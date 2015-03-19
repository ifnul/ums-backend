package org.lnu.is.dao.builder.contact.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class ContactTypeQueryBuilderTest {

	private ContactTypeQueryBuilder unit = new ContactTypeQueryBuilder();
	
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
		ContactType context = new ContactType();

		String expectedQuery = "SELECT e FROM ContactType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstaints() throws Exception {
		// Given
		unit.setSecurity(false);
		
		ContactType context = new ContactType();
		
		String expectedQuery = "SELECT e FROM ContactType e WHERE e.status=:status ";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWihDisabledStatusConstaint() throws Exception {
		// Given
		unit.setActive(false);
		ContactType context = new ContactType();
		
		String expectedQuery = "SELECT e FROM ContactType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultCOnstaints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		
		ContactType context = new ContactType();
		
		String expectedQuery = "SELECT e FROM ContactType e ";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
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
		String name = "fsdfds";
		
		ContactType context = new ContactType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM ContactType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultCOnstaints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "AN";
		String name = "fsdfds";
		
		ContactType context = new ContactType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expectedQuery = "SELECT e FROM ContactType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
