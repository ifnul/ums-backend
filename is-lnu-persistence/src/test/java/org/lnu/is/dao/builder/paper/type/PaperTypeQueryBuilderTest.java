package org.lnu.is.dao.builder.paper.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.paper.type.PaperType;
import org.lnu.is.domain.paper.usage.PaperUsage;
import org.lnu.is.pagination.MultiplePagedSearch;

public class PaperTypeQueryBuilderTest {

	private PaperTypeQueryBuilder unit = new PaperTypeQueryBuilder();
	
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
		PaperType context = new PaperType();
		
		String expectedQuery = "SELECT e FROM PaperType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PaperType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		PaperType context = new PaperType();
		
		String expectedQuery = "SELECT e FROM PaperType e WHERE e.status=:status ";
		MultiplePagedSearch<PaperType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		PaperType context = new PaperType();
		
		String expectedQuery = "SELECT e FROM PaperType e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PaperType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		PaperType context = new PaperType();
		
		String expectedQuery = "SELECT e FROM PaperType e ";
		MultiplePagedSearch<PaperType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abbrname";
		String name = "fdsfds";
		PaperUsage paperUsage = new PaperUsage();

		PaperType context = new PaperType();
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setPaperUsage(paperUsage);

		String expectedQuery = "SELECT e FROM PaperType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.paperUsage = :paperUsage ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PaperType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String abbrName = "abbrname";
		String name = "fdsfds";
		PaperUsage paperUsage = new PaperUsage();
		
		PaperType context = new PaperType();
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setPaperUsage(paperUsage);
		
		String expectedQuery = "SELECT e FROM PaperType e WHERE ( e.name LIKE CONCAT('%',:name,'%') AND e.abbrName LIKE CONCAT('%',:abbrName,'%') AND e.paperUsage = :paperUsage ) ";
		MultiplePagedSearch<PaperType> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
