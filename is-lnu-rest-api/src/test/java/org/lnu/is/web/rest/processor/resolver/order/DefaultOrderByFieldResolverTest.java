package org.lnu.is.web.rest.processor.resolver.order;


import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;
import org.lnu.is.resource.person.PersonResource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class DefaultOrderByFieldResolverTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@InjectMocks
	private DefaultOrderByFieldResolver unit;

	@Mock
	private Map<String, Map<String, String>> replacementMap;

	private Pattern pattern = Pattern.compile("^[a-zA-Z]+-([aA][sS][cC]|[dD][eE][sS][cC])(,\\s?[a-zA-Z]+-([aA][sS][cC]|[dD][eE][sS][cC]))*$");

	@Before
	public void setup() {
		unit.setPattern(pattern);
	}
	
	@Test
	public void testGetOrdersBy() throws Exception {
		// Given
		String orderByParam = "name-desc,identifier-asc,citizenCountryId-desc";
		Object resource = new PersonResource();
		OrderBy orderBy1 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy2 = new OrderBy("identifier", OrderByType.ASC);
		OrderBy orderBy3 = new OrderBy("citizenCountry", OrderByType.DESC);
		List<OrderBy> expected = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		Map<String, String> personMap = new HashMap<>();
		personMap.put("name", "name");
		personMap.put("identifier", "identifier");
		personMap.put("citizenCountryId", "citizenCountry");
		
		// When
		when(replacementMap.get(anyString())).thenReturn(personMap);
		List<OrderBy> actual = unit.getOrdersBy(orderByParam, resource);

		// Then
		verify(replacementMap).get("org.lnu.is.resource.person.PersonResource");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetOrdersByWithoutMap() throws Exception {
		// Given
		String orderByParam = "name-desc,identifier-asc";
		Object resource = new PersonResource();
		OrderBy orderBy1 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy2 = new OrderBy("identifier", OrderByType.ASC);
		List<OrderBy> expected = Arrays.asList(orderBy1, orderBy2);
		
		Map<String, String> personMap = new HashMap<>();
		personMap.put("name", "name");
		personMap.put("identifier", "identifier");
		
		// When
		when(replacementMap.get(anyString())).thenReturn(personMap);
		List<OrderBy> actual = unit.getOrdersBy(orderByParam, resource);
		
		// Then
		verify(replacementMap).get("org.lnu.is.resource.person.PersonResource");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetOrdersByWithoutResourceMapAndWithFieldThatContainsID() throws Exception {
		// Given
		String orderByParam = "name-desc,identifier-asc,citizenCountryId-desc";
		Object resource = new PersonResource();
		OrderBy orderBy1 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy2 = new OrderBy("identifier", OrderByType.ASC);
		OrderBy orderBy3 = new OrderBy("citizenCountry", OrderByType.DESC);
		List<OrderBy> expected = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		// When
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Fields that contains 'Id' are not supported for ordering.Please contact backend-dev team to fix this issue.");
		
		List<OrderBy> actual = unit.getOrdersBy(orderByParam, resource);
		
		// Then
		verify(replacementMap).get("org.lnu.is.resource.person.PersonResource");
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetOrdersByWithUnknowIdResolver() throws Exception {
		// Given
		String orderByParam = "name-desc,identifier-asc,citizenCountryId-desc";
		Object resource = new PersonResource();
		OrderBy orderBy1 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy2 = new OrderBy("identifier", OrderByType.ASC);
		OrderBy orderBy3 = new OrderBy("citizenCountry", OrderByType.DESC);
		List<OrderBy> expected = Arrays.asList(orderBy1, orderBy2, orderBy3);
		
		Map<String, String> personMap = new HashMap<>();
		personMap.put("name", "name");
		personMap.put("identifier", "identifier");
		
		// When
		when(replacementMap.get(anyString())).thenReturn(personMap);
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Fields that contains 'Id' are not supported for ordering.Please contact backend-dev team to fix this issue.");
		
		List<OrderBy> actual = unit.getOrdersBy(orderByParam, resource);
		
		// Then
		verify(replacementMap).get("org.lnu.is.resource.person.PersonResource");
		assertEquals(expected, actual);
	}
}
