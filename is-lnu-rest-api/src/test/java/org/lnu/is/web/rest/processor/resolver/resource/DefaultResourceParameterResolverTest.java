package org.lnu.is.web.rest.processor.resolver.resource;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.resource.person.PersonResource;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.core.MethodParameter;

@RunWith(MockitoJUnitRunner.class)
public class DefaultResourceParameterResolverTest {

	private DefaultResourceParameterResolver unit = new DefaultResourceParameterResolver();
	
	@Mock
	private MethodParameter param;
	
	@Mock
	private ParameterizedType type;
	
	private Class<PersonResource> clzType = PersonResource.class;

	private Type[] types = new Type[] { clzType };
	
	@Test
	public void testGetResource() throws Exception {
		// Given
		String id = "1";
		String name = "Ivan";
		Map<String, String> parameters = new HashMap<>();
		parameters.put("id", id);
		parameters.put("name", name);
		
		PersonResource expected = new PersonResource();
		expected.setName(name);
		expected.setId(Long.valueOf(id));
		
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
