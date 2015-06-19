package org.lnu.is.web.rest.processor.resolver;

import org.lnu.is.annotations.Limit;
import org.lnu.is.annotations.Offset;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.web.rest.constant.Constants;
import org.lnu.is.web.rest.processor.resolver.limit.LimitParameterResolver;
import org.lnu.is.web.rest.processor.resolver.offset.OffsetParameterResolver;
import org.lnu.is.web.rest.processor.resolver.order.OrderByFieldResolver;
import org.lnu.is.web.rest.processor.resolver.parameters.ParametersRetriever;
import org.lnu.is.web.rest.processor.resolver.resource.ResourceParameterResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


/**
 * Paged request argument resolver.
 * TODO: Ivan Ursul - Split this class to four separated resolvers - for offset, limit, resource and order by
 * @author ivanursul
 *
 */
@Component("pagedRequestHandlerMethodArgumentResolver")
public class PagedRequestHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
	private static final Logger LOG = LoggerFactory.getLogger(PagedRequestHandlerMethodArgumentResolver.class);

	@Resource(name = "orderByFieldResolver")
	private OrderByFieldResolver orderByFieldResolver;
	
	@Resource(name = "offsetParameterResolver")
	private OffsetParameterResolver offsetParameterResolver;
	
	@Resource(name = "limitParameterResolver")
	private LimitParameterResolver limitParameterResolver;
	
	@Resource(name = "resourceParameterResolver")
	private ResourceParameterResolver resourceParameterResolver;

	@Resource(name = "parametersRetriever")
	private ParametersRetriever parametersRetriever;

	@Override
	public boolean supportsParameter(final MethodParameter parameter) {
		return PagedRequest.class.isAssignableFrom(parameter.getParameterType());
	}

	@Override
	public Object resolveArgument(final MethodParameter param,
			final ModelAndViewContainer mavContainer, final NativeWebRequest webRequest,
			final WebDataBinderFactory binderFactory) throws Exception {
		LOG.debug("Debugging PagedRequest Parsing:");
		
		HttpServletRequest httpRequest = (HttpServletRequest) webRequest.getNativeRequest();

		Map<String, Object> parameters = parametersRetriever.getParameters(webRequest);
        Object resource = resourceParameterResolver.getResource(param, parameters);
        Integer limit = limitParameterResolver.getLimit(param.getParameterAnnotation(Limit.class), param.getParameterType().getDeclaredField("limit"), httpRequest);
        Integer offset = offsetParameterResolver.getOffset(param.getParameterAnnotation(Offset.class), param.getParameterType().getDeclaredField("offset"), httpRequest);
        List<OrderBy> orders = orderByFieldResolver.getOrdersBy(httpRequest.getParameter(Constants.ORDER_BY), resource);
		
        PagedRequest<Object> pagedRequest = new PagedRequest<Object>(resource, offset, limit, orders);
		return pagedRequest;
	}

	public void setResourceParameterResolver(final ResourceParameterResolver resourceParameterResolver) {
		this.resourceParameterResolver = resourceParameterResolver;
	}

	public void setParametersRetriever(final ParametersRetriever parametersRetriever) {
		this.parametersRetriever = parametersRetriever;
	}

	public void setOrderByFieldResolver(final OrderByFieldResolver orderByFieldResolver) {
		this.orderByFieldResolver = orderByFieldResolver;
	}

	public void setOffsetParameterResolver(final OffsetParameterResolver offsetParameterResolver) {
		this.offsetParameterResolver = offsetParameterResolver;
	}

	public void setLimitParameterResolver(final LimitParameterResolver limitParameterResolver) {
		this.limitParameterResolver = limitParameterResolver;
	}

	public void setResourceParamterResolver(final ResourceParameterResolver resourceParamterResolver) {
		this.resourceParameterResolver = resourceParamterResolver;
	}

}
