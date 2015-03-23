package org.lnu.is.web.rest.processor.resolver;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.lnu.is.annotations.Limit;
import org.lnu.is.annotations.Offset;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;
import org.lnu.is.resource.person.PersonResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.web.exception.InvalidOrderByException;
import org.lnu.is.web.rest.processor.resolver.limit.LimitParameterResolver;
import org.lnu.is.web.rest.processor.resolver.offset.OffsetParameterResolver;
import org.lnu.is.web.rest.processor.resolver.order.OrderByFieldResolver;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.HandlerMapping;

@RunWith(MockitoJUnitRunner.class)
public class PagedRequestHandlerMethodArgumentResolverTest {

	@InjectMocks
	private PagedRequestHandlerMethodArgumentResolver unit;

	@Mock
	private OrderByFieldResolver orderByFieldResolver;

	@Mock
	private OffsetParameterResolver offsetParameteResolver;
	
	@Mock
	private LimitParameterResolver limitParameterResolver;
	
	@Mock
	private MethodParameter param;
	
	@Mock
	private ModelAndViewContainer mavContainer;
	
	@Mock
	private NativeWebRequest webRequest;
	
	@Mock
	private WebDataBinderFactory binderFactory;

	@Mock
	private HttpServletRequest httpRequest;

	@Mock
	private ParameterizedType type;
	
	@Rule
	public ExpectedException exception = ExpectedException.none();

	private Class<PersonResource> clzType = PersonResource.class;

	private Type[] types = new Type[] { clzType };

	@SuppressWarnings("rawtypes")
	private Class<PagedRequest> paramType = PagedRequest.class;

	@Test
	public void testResolveArgument() throws Exception {
		// Given
		final Integer limitValue = 20;
		final Integer offsetValue = 0;
		String orderByParameterValue = "name-asc, description-desc";
		
		String id = "1";
		String name = "Ivan";
		Map<String, String> pathVariables = new HashMap<>();
		pathVariables.put("id", id);
		Map<String, String[]> parameterMap = new HashMap<>();
		parameterMap.put("name", new String[] { name });

		Map<String, String> requestParameters = new HashMap<>();
		requestParameters.put("id", id);
		requestParameters.put("name", name);
		
		PersonResource resource = new PersonResource();
		resource.setName(name);
		resource.setId(Long.valueOf(id));

		OrderBy order1 = new OrderBy("name", OrderByType.ASC);
		OrderBy order2 = new OrderBy("description", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(order1, order2);
		PagedRequest<PersonResource> expected = new PagedRequest<PersonResource>(resource, 
				offsetValue, limitValue, orders);
		
		// When
		// Init when's
		when(webRequest.getNativeRequest()).thenReturn(httpRequest);
		when(webRequest.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE, RequestAttributes.SCOPE_REQUEST))
			.thenReturn(pathVariables);
		when(webRequest.getParameterMap()).thenReturn(parameterMap);
		
		// Resource when's
		when(param.getGenericParameterType()).thenReturn(type);
		when(type.getActualTypeArguments()).thenReturn(types);
		
		// Limit when's
		Limit limit = (Limit) Proxy.newProxyInstance(Limit.class.getClassLoader(), 
			new Class[] { Limit.class }, 
			new InvocationHandler() {
				@Override
				public Object invoke(final Object proxy, final Method method, final Object[] args)
						throws Throwable {
					return String.valueOf(limitValue);
				}
		});
		
		when(param.getParameterAnnotation(Limit.class)).thenReturn(limit);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("limit")).thenReturn(String.valueOf(limitValue));
		when(limitParameterResolver.getLimit(any(Limit.class), any(Field.class), any(HttpServletRequest.class))).thenReturn(limitValue);
		
		// Offset when's
		Offset offset = (Offset) Proxy.newProxyInstance(Offset.class.getClassLoader(), 
			new Class[] { Offset.class }, 
			new InvocationHandler() {
				@Override
				public Object invoke(final Object proxy, final Method method, final Object[] args)
						throws Throwable {
					return String.valueOf(offsetValue);
				}
		});
		
		when(param.getParameterAnnotation(Offset.class)).thenReturn(offset);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("offset")).thenReturn(String.valueOf(limitValue));
		when(offsetParameteResolver.getOffset(any(Offset.class), any(Field.class), any(HttpServletRequest.class))).thenReturn(offsetValue);
		
		// Orders when's
		when(httpRequest.getParameter("orderBy")).thenReturn(orderByParameterValue);
		when(orderByFieldResolver.getOrdersBy(anyString(), any())).thenReturn(orders);
		
		Object actual = unit.resolveArgument(param, mavContainer, webRequest, binderFactory);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResolveArgumentWithCapitalLetter() throws Exception {
		// Given
		final Integer limitValue = 20;
		final Integer offsetValue = 0;
		String orderByParameterValue = "name-ASC, description-desc";
		
		String id = "1";
		String name = "Ivan";
		Map<String, String> pathVariables = new HashMap<>();
		pathVariables.put("id", id);
		Map<String, String[]> parameterMap = new HashMap<>();
		parameterMap.put("name", new String[] { name });
		
		Map<String, String> requestParameters = new HashMap<>();
		requestParameters.put("id", id);
		requestParameters.put("name", name);
		
		PersonResource resource = new PersonResource();
		resource.setName(name);
		resource.setId(Long.valueOf(id));
		
		OrderBy order1 = new OrderBy("name", OrderByType.ASC);
		OrderBy order2 = new OrderBy("description", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(order1, order2);
		PagedRequest<PersonResource> expected = new PagedRequest<PersonResource>(resource, 
				offsetValue, limitValue, orders);
		
		// When
		// Init when's
		when(webRequest.getNativeRequest()).thenReturn(httpRequest);
		when(webRequest.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE, RequestAttributes.SCOPE_REQUEST))
			.thenReturn(pathVariables);
		when(webRequest.getParameterMap()).thenReturn(parameterMap);
		
		// Resource when's
		when(param.getGenericParameterType()).thenReturn(type);
		when(type.getActualTypeArguments()).thenReturn(types);
		
		// Limit when's
		Limit limit = (Limit) Proxy.newProxyInstance(Limit.class.getClassLoader(), 
				new Class[] { Limit.class }, 
				new InvocationHandler() {
			@Override
			public Object invoke(final Object proxy, final Method method, final Object[] args)
					throws Throwable {
				return String.valueOf(limitValue);
			}
		});
		
		when(param.getParameterAnnotation(Limit.class)).thenReturn(limit);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("limit")).thenReturn(String.valueOf(limitValue));
		when(limitParameterResolver.getLimit(any(Limit.class), any(Field.class), any(HttpServletRequest.class))).thenReturn(limitValue);
		
		// Offset when's
		Offset offset = (Offset) Proxy.newProxyInstance(Offset.class.getClassLoader(), 
				new Class[] { Offset.class }, 
				new InvocationHandler() {
			@Override
			public Object invoke(final Object proxy, final Method method, final Object[] args)
					throws Throwable {
				return String.valueOf(offsetValue);
			}
		});
		
		when(param.getParameterAnnotation(Offset.class)).thenReturn(offset);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("offset")).thenReturn(String.valueOf(limitValue));
		when(offsetParameteResolver.getOffset(any(Offset.class), any(Field.class), any(HttpServletRequest.class))).thenReturn(offsetValue);
		
		// Orders when's
		when(httpRequest.getParameter("orderBy")).thenReturn(orderByParameterValue);
		when(orderByFieldResolver.getOrdersBy(anyString(), any())).thenReturn(orders);
		Object actual = unit.resolveArgument(param, mavContainer, webRequest, binderFactory);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResolveArgumentWithSingleOrder() throws Exception {
		// Given
		final Integer limitValue = 20;
		final Integer offsetValue = 0;
		String orderByParameterValue = "name-asc";
		
		String id = "1";
		String name = "Ivan";
		Map<String, String> pathVariables = new HashMap<>();
		pathVariables.put("id", id);
		Map<String, String[]> parameterMap = new HashMap<>();
		parameterMap.put("name", new String[] { name });
		
		Map<String, String> requestParameters = new HashMap<>();
		requestParameters.put("id", id);
		requestParameters.put("name", name);
		
		PersonResource resource = new PersonResource();
		resource.setName(name);
		resource.setId(Long.valueOf(id));
		
		OrderBy order1 = new OrderBy("name", OrderByType.ASC);
		List<OrderBy> orders = Arrays.asList(order1);
		PagedRequest<PersonResource> expected = new PagedRequest<PersonResource>(resource, 
				offsetValue, limitValue, orders);
		
		// When
		// Init when's
		when(webRequest.getNativeRequest()).thenReturn(httpRequest);
		when(webRequest.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE, RequestAttributes.SCOPE_REQUEST))
		.thenReturn(pathVariables);
		when(webRequest.getParameterMap()).thenReturn(parameterMap);
		
		// Resource when's
		when(param.getGenericParameterType()).thenReturn(type);
		when(type.getActualTypeArguments()).thenReturn(types);
		
		// Limit when's
		Limit limit = (Limit) Proxy.newProxyInstance(Limit.class.getClassLoader(), 
				new Class[] { Limit.class }, 
				new InvocationHandler() {
			@Override
			public Object invoke(final Object proxy, final Method method, final Object[] args)
					throws Throwable {
				return String.valueOf(limitValue);
			}
		});
		
		when(param.getParameterAnnotation(Limit.class)).thenReturn(limit);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("limit")).thenReturn(String.valueOf(limitValue));
		when(limitParameterResolver.getLimit(any(Limit.class), any(Field.class), any(HttpServletRequest.class))).thenReturn(limitValue);
		
		// Offset when's
		Offset offset = (Offset) Proxy.newProxyInstance(Offset.class.getClassLoader(), 
				new Class[] { Offset.class }, 
				new InvocationHandler() {
			@Override
			public Object invoke(final Object proxy, final Method method, final Object[] args)
					throws Throwable {
				return String.valueOf(offsetValue);
			}
		});
		
		when(param.getParameterAnnotation(Offset.class)).thenReturn(offset);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("offset")).thenReturn(String.valueOf(limitValue));
		when(offsetParameteResolver.getOffset(any(Offset.class), any(Field.class), any(HttpServletRequest.class))).thenReturn(offsetValue);
		
		// Orders when's
		when(httpRequest.getParameter("orderBy")).thenReturn(orderByParameterValue);
		when(orderByFieldResolver.getOrdersBy(anyString(), any())).thenReturn(orders);
		Object actual = unit.resolveArgument(param, mavContainer, webRequest, binderFactory);
		
		// Then
		assertEquals(expected.toString(), actual.toString());
	}
	
	@Test
	public void testResolveArgumentWithEmptyOrders() throws Exception {
		// Given
		final Integer limitValue = 20;
		final Integer offsetValue = 0;
		String orderByParameterValue = "";
		
		String id = "1";
		String name = "Ivan";
		Map<String, String> pathVariables = new HashMap<>();
		pathVariables.put("id", id);
		Map<String, String[]> parameterMap = new HashMap<>();
		parameterMap.put("name", new String[] { name });
		
		Map<String, String> requestParameters = new HashMap<>();
		requestParameters.put("id", id);
		requestParameters.put("name", name);
		
		PersonResource resource = new PersonResource();
		resource.setName(name);
		resource.setId(Long.valueOf(id));
		
		List<OrderBy> orders = Collections.emptyList();
		PagedRequest<PersonResource> expected = new PagedRequest<PersonResource>(resource, 
				offsetValue, limitValue, orders);
		
		// When
		// Init when's
		when(webRequest.getNativeRequest()).thenReturn(httpRequest);
		when(webRequest.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE, RequestAttributes.SCOPE_REQUEST))
		.thenReturn(pathVariables);
		when(webRequest.getParameterMap()).thenReturn(parameterMap);
		
		// Resource when's
		when(param.getGenericParameterType()).thenReturn(type);
		when(type.getActualTypeArguments()).thenReturn(types);
		
		// Limit when's
		Limit limit = (Limit) Proxy.newProxyInstance(Limit.class.getClassLoader(), 
				new Class[] { Limit.class }, 
				new InvocationHandler() {
			@Override
			public Object invoke(final Object proxy, final Method method, final Object[] args)
					throws Throwable {
				return String.valueOf(limitValue);
			}
		});
		
		when(param.getParameterAnnotation(Limit.class)).thenReturn(limit);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("limit")).thenReturn(String.valueOf(limitValue));
		when(limitParameterResolver.getLimit(any(Limit.class), any(Field.class), any(HttpServletRequest.class))).thenReturn(limitValue);
		
		// Offset when's
		Offset offset = (Offset) Proxy.newProxyInstance(Offset.class.getClassLoader(), 
				new Class[] { Offset.class }, 
				new InvocationHandler() {
			@Override
			public Object invoke(final Object proxy, final Method method, final Object[] args)
					throws Throwable {
				return String.valueOf(offsetValue);
			}
		});
		
		when(param.getParameterAnnotation(Offset.class)).thenReturn(offset);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("offset")).thenReturn(String.valueOf(limitValue));
		when(offsetParameteResolver.getOffset(any(Offset.class), any(Field.class), any(HttpServletRequest.class))).thenReturn(offsetValue);
		
		// Orders when's
		when(httpRequest.getParameter("orderBy")).thenReturn(orderByParameterValue);
		
		Object actual = unit.resolveArgument(param, mavContainer, webRequest, binderFactory);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResolveArgumentWithNullOrders() throws Exception {
		// Given
		final Integer limitValue = 20;
		final Integer offsetValue = 0;
		String orderByParameterValue = null;
		
		String id = "1";
		String name = "Ivan";
		Map<String, String> pathVariables = new HashMap<>();
		pathVariables.put("id", id);
		Map<String, String[]> parameterMap = new HashMap<>();
		parameterMap.put("name", new String[] { name });
		
		Map<String, String> requestParameters = new HashMap<>();
		requestParameters.put("id", id);
		requestParameters.put("name", name);
		
		PersonResource resource = new PersonResource();
		resource.setName(name);
		resource.setId(Long.valueOf(id));
		
		List<OrderBy> orders = Collections.emptyList();
		PagedRequest<PersonResource> expected = new PagedRequest<PersonResource>(resource, 
				offsetValue, limitValue, orders);
		
		// When
		// Init when's
		when(webRequest.getNativeRequest()).thenReturn(httpRequest);
		when(webRequest.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE, RequestAttributes.SCOPE_REQUEST))
		.thenReturn(pathVariables);
		when(webRequest.getParameterMap()).thenReturn(parameterMap);
		
		// Resource when's
		when(param.getGenericParameterType()).thenReturn(type);
		when(type.getActualTypeArguments()).thenReturn(types);
		
		// Limit when's
		Limit limit = (Limit) Proxy.newProxyInstance(Limit.class.getClassLoader(), 
				new Class[] { Limit.class }, 
				new InvocationHandler() {
			@Override
			public Object invoke(final Object proxy, final Method method, final Object[] args)
					throws Throwable {
				return String.valueOf(limitValue);
			}
		});
		
		when(param.getParameterAnnotation(Limit.class)).thenReturn(limit);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("limit")).thenReturn(String.valueOf(limitValue));
		when(limitParameterResolver.getLimit(any(Limit.class), any(Field.class), any(HttpServletRequest.class))).thenReturn(limitValue);
		
		// Offset when's
		Offset offset = (Offset) Proxy.newProxyInstance(Offset.class.getClassLoader(), 
				new Class[] { Offset.class }, 
				new InvocationHandler() {
			@Override
			public Object invoke(final Object proxy, final Method method, final Object[] args)
					throws Throwable {
				return String.valueOf(offsetValue);
			}
		});
		
		when(param.getParameterAnnotation(Offset.class)).thenReturn(offset);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("offset")).thenReturn(String.valueOf(limitValue));
		when(offsetParameteResolver.getOffset(any(Offset.class), any(Field.class), any(HttpServletRequest.class))).thenReturn(offsetValue);
		
		// Orders when's
		when(httpRequest.getParameter("orderBy")).thenReturn(orderByParameterValue);
		
		Object actual = unit.resolveArgument(param, mavContainer, webRequest, binderFactory);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testResolveArgumentWithInvalidOrderFormat() throws Exception {
		// Given
		final Integer limitValue = 20;
		final Integer offsetValue = 0;
		String orderByParameterValue = "name*asc, description\\-desc";
		
		String id = "1";
		String name = "Ivan";
		Map<String, String> pathVariables = new HashMap<>();
		pathVariables.put("id", id);
		Map<String, String[]> parameterMap = new HashMap<>();
		parameterMap.put("name", new String[] { name });
		
		Map<String, String> requestParameters = new HashMap<>();
		requestParameters.put("id", id);
		requestParameters.put("name", name);
		
		PersonResource resource = new PersonResource();
		resource.setName(name);
		resource.setId(Long.valueOf(id));
		
		List<OrderBy> orders = Collections.emptyList();
		PagedRequest<PersonResource> expected = new PagedRequest<PersonResource>(resource, 
				offsetValue, limitValue, orders);
		
		// When
		// Init when's
		when(webRequest.getNativeRequest()).thenReturn(httpRequest);
		when(webRequest.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE, RequestAttributes.SCOPE_REQUEST))
		.thenReturn(pathVariables);
		when(webRequest.getParameterMap()).thenReturn(parameterMap);
		
		// Resource when's
		when(param.getGenericParameterType()).thenReturn(type);
		when(type.getActualTypeArguments()).thenReturn(types);
		
		// Limit when's
		Limit limit = (Limit) Proxy.newProxyInstance(Limit.class.getClassLoader(), 
				new Class[] { Limit.class }, 
				new InvocationHandler() {
			@Override
			public Object invoke(final Object proxy, final Method method, final Object[] args)
					throws Throwable {
				return String.valueOf(limitValue);
			}
		});
		
		when(param.getParameterAnnotation(Limit.class)).thenReturn(limit);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("limit")).thenReturn(String.valueOf(limitValue));
		
		// Offset when's
		Offset offset = (Offset) Proxy.newProxyInstance(Offset.class.getClassLoader(), 
				new Class[] { Offset.class }, 
				new InvocationHandler() {
			@Override
			public Object invoke(final Object proxy, final Method method, final Object[] args)
					throws Throwable {
				return String.valueOf(offsetValue);
			}
		});
		
		when(param.getParameterAnnotation(Offset.class)).thenReturn(offset);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("offset")).thenReturn(String.valueOf(limitValue));
		when(offsetParameteResolver.getOffset(any(Offset.class), any(Field.class), any(HttpServletRequest.class))).thenReturn(offsetValue);
		
		// Orders when's
		when(httpRequest.getParameter("orderBy")).thenReturn(orderByParameterValue);
		when(orderByFieldResolver.getOrdersBy(anyString(), any())).thenThrow(new InvalidOrderByException("Invalid string for order by field"));
		exception.expect(InvalidOrderByException.class);
		exception.expectMessage("Invalid string for order by field");
		
		Object actual = unit.resolveArgument(param, mavContainer, webRequest, binderFactory);
		
		// Then
		assertEquals(expected.toString(), actual.toString());
	}
	
	@Test
	public void testResolveArgumentWithInvalidOrderField() throws Exception {
		// Given
		final Integer limitValue = 20;
		final Integer offsetValue = 0;
		String orderByParameterValue = "name-asc, personId-desc";
		
		String id = "1";
		String name = "Ivan";
		Map<String, String> pathVariables = new HashMap<>();
		pathVariables.put("id", id);
		Map<String, String[]> parameterMap = new HashMap<>();
		parameterMap.put("name", new String[] { name });
		
		Map<String, String> requestParameters = new HashMap<>();
		requestParameters.put("id", id);
		requestParameters.put("name", name);
		
		PersonResource resource = new PersonResource();
		resource.setName(name);
		resource.setId(Long.valueOf(id));
		
		List<OrderBy> orders = Collections.emptyList();
		PagedRequest<PersonResource> expected = new PagedRequest<PersonResource>(resource, 
				offsetValue, limitValue, orders);
		
		// When
		// Init when's
		when(webRequest.getNativeRequest()).thenReturn(httpRequest);
		when(webRequest.getAttribute(HandlerMapping.URI_TEMPLATE_VARIABLES_ATTRIBUTE, RequestAttributes.SCOPE_REQUEST))
		.thenReturn(pathVariables);
		when(webRequest.getParameterMap()).thenReturn(parameterMap);
		
		// Resource when's
		when(param.getGenericParameterType()).thenReturn(type);
		when(type.getActualTypeArguments()).thenReturn(types);
		
		// Limit when's
		Limit limit = (Limit) Proxy.newProxyInstance(Limit.class.getClassLoader(), 
				new Class[] { Limit.class }, 
				new InvocationHandler() {
			@Override
			public Object invoke(final Object proxy, final Method method, final Object[] args)
					throws Throwable {
				return String.valueOf(limitValue);
			}
		});
		
		when(param.getParameterAnnotation(Limit.class)).thenReturn(limit);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("limit")).thenReturn(String.valueOf(limitValue));
		
		// Offset when's
		Offset offset = (Offset) Proxy.newProxyInstance(Offset.class.getClassLoader(), 
				new Class[] { Offset.class }, 
				new InvocationHandler() {
			@Override
			public Object invoke(final Object proxy, final Method method, final Object[] args)
					throws Throwable {
				return String.valueOf(offsetValue);
			}
		});
		
		when(param.getParameterAnnotation(Offset.class)).thenReturn(offset);
		doReturn(paramType).when(param).getParameterType();
		when(httpRequest.getParameter("offset")).thenReturn(String.valueOf(offsetValue));
		when(offsetParameteResolver.getOffset(any(Offset.class), any(Field.class), any(HttpServletRequest.class))).thenReturn(offsetValue);
		
		// Orders when's
		when(httpRequest.getParameter("orderBy")).thenReturn(orderByParameterValue);
		when(orderByFieldResolver.getOrdersBy(anyString(), any())).thenThrow(new IllegalArgumentException("Fields that contains 'Id' are not supported for ordering"));
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Fields that contains 'Id' are not supported for ordering");
		
		Object actual = unit.resolveArgument(param, mavContainer, webRequest, binderFactory);
		
		// Then
		assertEquals(expected.toString(), actual.toString());
	}
	
}
