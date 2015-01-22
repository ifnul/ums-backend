package org.lnu.is.extractor.street.type;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StreetTypeParametersExtractorTest {
	
	@Mock
	private SessionService sessionService;
	
	@InjectMocks
	private StreetTypeParametersExtractor unit;

	private Boolean active = true;
	private Boolean security = true;

	private String group1 = "developers";
	private String group2 = "students";
	
	private List<String> groups = Arrays.asList(group1, group2);
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
		
		when(sessionService.getGroups()).thenReturn(groups);
	}
	
	@Test
	public void testGetParameters() throws Exception {
		// Given
		String name = "Extract Me All";
		String abbrName = "EML";

		StreetType entity = new StreetType();
		entity.setName(name);
		entity.setAbbrName(abbrName);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("abbrName", abbrName);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDisabledSecurity() throws Exception {
		// Given
		unit.setSecurity(false);
		
		String name = "Extract Me All";
		String abbrName = "EML";
		
		StreetType entity = new StreetType();
		entity.setName(name);
		entity.setAbbrName(abbrName);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("abbrName", abbrName);
		expected.put("status", RowStatus.ACTIVE);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDisabledStatus() throws Exception {
		// Given
		unit.setActive(false);
		
		String name = "Extract Me All";
		String abbrName = "EML";
		
		StreetType entity = new StreetType();
		entity.setName(name);
		entity.setAbbrName(abbrName);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("abbrName", abbrName);
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String name = "Extract Me All";
		String abbrName = "EML";
		
		StreetType entity = new StreetType();
		entity.setName(name);
		entity.setAbbrName(abbrName);
		
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("name", name);
		expected.put("abbrName", abbrName);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		StreetType entity = new StreetType();

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntityAndDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		StreetType entity = new StreetType();
		
		Map<String, Object> expected = new HashMap<String, Object>();
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);
		
		// Then
		assertEquals(expected, actual);
	}
}
