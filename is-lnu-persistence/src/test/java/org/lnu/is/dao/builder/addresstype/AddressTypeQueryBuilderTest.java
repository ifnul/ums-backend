package org.lnu.is.dao.builder.addresstype;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class AddressTypeQueryBuilderTest {

	private AddressTypeQueryBuilder unit = new AddressTypeQueryBuilder();
	
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
		AddressType context = new AddressType();
		
		String expectedQuery = "SELECT e FROM AddressType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AddressType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		AddressType context = new AddressType();
		
		String expectedQuery = "SELECT e FROM AddressType e ";
		MultiplePagedSearch<AddressType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithDisabledSecurityCondition() throws Exception {
		// Given
		unit.setSecurity(false);
		AddressType context = new AddressType();
		
		String expectedQuery = "SELECT e FROM AddressType e WHERE e.status=:status ";
		MultiplePagedSearch<AddressType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithDisabledStatusCondition() throws Exception {
		// Given
		unit.setActive(false);
		AddressType context = new AddressType();
		
		String expectedQuery = "SELECT e FROM AddressType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AddressType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "AN";
		String name = "name";

		AddressType context = new AddressType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM AddressType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<AddressType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParametersWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "AN";
		String name = "name";
		
		AddressType context = new AddressType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM AddressType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<AddressType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
