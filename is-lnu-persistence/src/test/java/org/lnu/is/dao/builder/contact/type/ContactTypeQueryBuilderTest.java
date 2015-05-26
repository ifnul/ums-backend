package org.lnu.is.dao.builder.contact.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.contact.type.ContactType;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

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
	public void testBuildWithOrderBy() throws Exception {
		// Given
		ContactType context = new ContactType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);

		String expectedQuery = "SELECT e FROM ContactType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testBuildWithDisabledSecurityConstaintsWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		ContactType context = new ContactType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM ContactType e WHERE e.status=:status ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testBuildWihDisabledStatusConstaintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		ContactType context = new ContactType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM ContactType e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testBuildWithDisabledDefaultCOnstaintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		ContactType context = new ContactType();
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM ContactType e ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
		
		String expectedQuery = "SELECT e FROM ContactType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithOrderBy() throws Exception {
		// Given
		String abbrName = "AN";
		String name = "fsdfds";
		
		ContactType context = new ContactType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM ContactType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
		
		String expectedQuery = "SELECT e FROM ContactType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultCOnstaintsWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "AN";
		String name = "fsdfds";
		
		ContactType context = new ContactType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		OrderBy orderBy1 = new OrderBy("abbrName", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("name", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2);
		
		String expectedQuery = "SELECT e FROM ContactType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ORDER BY e.abbrName ASC, e.name DESC";
		MultiplePagedSearch<ContactType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

}
