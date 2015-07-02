package org.lnu.is.web.rest.processor.resolver.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.resource.person.PersonResourceList;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.core.MethodParameter;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DefaultResourceParameterResolverTest {

	private DefaultResourceParameterResolver unit = new DefaultResourceParameterResolver();
	
	@Mock
	private MethodParameter param;
	
	@Mock
	private ParameterizedType type;
	
	private Class<PersonResourceList> clzType = PersonResourceList.class;

	private Type[] types = new Type[] { clzType };
	
	@Test
	public void testGetResource() throws Exception {
		// Given
		Map<String, Object> parameters = new HashMap<>();
		Integer resident = 1;
		parameters.put("resident", resident);

		PersonResourceList expected = new PersonResourceList();
		expected.setResident(resident);

		// When
		when(param.getGenericParameterType()).thenReturn(type);
		when(type.getActualTypeArguments()).thenReturn(types);
		
		Object actual = unit.getResource(param, parameters);

		// Then
		verify(param).getGenericParameterType();
		verify(type).getActualTypeArguments();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetResourceWithMultipleFields() throws Exception {
		// Given
		String id = "1";
		String name = "Ivan";
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("name", name);

		PersonResourceList expected = new PersonResourceList();
		expected.setName(Arrays.asList(name));

		// When
		when(param.getGenericParameterType()).thenReturn(type);
		when(type.getActualTypeArguments()).thenReturn(types);

		Object actual = unit.getResource(param, parameters);

		// Then
		verify(param).getGenericParameterType();
		verify(type).getActualTypeArguments();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetResourceWithMultipleFieldsId() throws Exception {
		// Given
		String id = "1";
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("id", id);

		PersonResourceList expected = new PersonResourceList();
		expected.setId(Arrays.asList(Long.valueOf(id)));

		// When
		when(param.getGenericParameterType()).thenReturn(type);
		when(type.getActualTypeArguments()).thenReturn(types);

		Object actual = unit.getResource(param, parameters);

		// Then
		verify(param).getGenericParameterType();
		verify(type).getActualTypeArguments();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetResourceWithMultipleFieldsAndReadyParameters() throws Exception {
		// Given
		String id = "1";
		String name = "ivan";
		List<String> names = Arrays.asList(name);
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("name", names);

		PersonResourceList expected = new PersonResourceList();
		expected.setName(names);

		// When
		when(param.getGenericParameterType()).thenReturn(type);
		when(type.getActualTypeArguments()).thenReturn(types);

		Object actual = unit.getResource(param, parameters);

		// Then
		verify(param).getGenericParameterType();
		verify(type).getActualTypeArguments();
		assertEquals(expected, actual);
	}
}
