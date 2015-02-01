package org.lnu.is.dao.builder.user.group;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class UserGroupViewQueryBuilderTest {

	private UserGroupViewQueryBuilder unit = new UserGroupViewQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}
	
	@Test
	public void testBuild() throws Exception {
		// Given
		Long group1 = 1L;
		Long group2 = 2L;
		List<Long> context = Arrays.asList(group1, group2);
		
		String expectedQuery = "SELECT e FROM UserGroupView e WHERE ( e.groupId IN (:groupIds)) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatus() throws Exception {
		// Given
		unit.setActive(false);
		
		Long group1 = 1L;
		Long group2 = 2L;
		List<Long> context = Arrays.asList(group1, group2);
		
		String expectedQuery = "SELECT e FROM UserGroupView e WHERE ( e.groupId IN (:groupIds)) AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaults() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long group1 = 1L;
		Long group2 = 2L;
		List<Long> context = Arrays.asList(group1, group2);
		
		String expectedQuery = "SELECT e FROM UserGroupView e WHERE ( e.groupId IN (:groupIds)) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurity() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Long group1 = 1L;
		Long group2 = 2L;
		List<Long> context = Arrays.asList(group1, group2);
		
		String expectedQuery = "SELECT e FROM UserGroupView e WHERE ( e.groupId IN (:groupIds)) AND e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithEmptyContext() throws Exception {
		// Given
		List<Long> context = Collections.emptyList();
		
		String expectedQuery = "SELECT e FROM UserGroupView e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithNullContext() throws Exception {
		// Given
		List<Long> context = null;
		
		String expectedQuery = "SELECT e FROM UserGroupView e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
