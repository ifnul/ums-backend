package org.lnu.is.dao.builder.person.work;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.work.PersonWork;
import org.lnu.is.domain.specstagetype.SpecStageType;
import org.lnu.is.pagination.MultiplePagedSearch;

public class PersonWorkQueryBuilderTest {

	private PersonWorkQueryBuilder unit = new PersonWorkQueryBuilder();
	
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
		PersonWork context = new PersonWork();
		
		String expectedQuery = "SELECT e FROM PersonWork e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonWork> pagedSearch = new MultiplePagedSearch<>();
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
		PersonWork context = new PersonWork();
		
		String expectedQuery = "SELECT e FROM PersonWork e WHERE e.status=:status ";
		MultiplePagedSearch<PersonWork> pagedSearch = new MultiplePagedSearch<>();
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
		PersonWork context = new PersonWork();
		
		String expectedQuery = "SELECT e FROM PersonWork e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonWork> pagedSearch = new MultiplePagedSearch<>();
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
		
		PersonWork context = new PersonWork();
		
		String expectedQuery = "SELECT e FROM PersonWork e ";
		MultiplePagedSearch<PersonWork> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Person person = new Person();
		JobType jobType = new JobType();
		SpecStageType specStageType = new SpecStageType();
		String organizationName = "organization name";
		String postName = "post name";
		String description = "post name";
		Date begDate = new Date();
		Date endDate = new Date();

		PersonWork context = new PersonWork();
		context.setPerson(person);
		context.setJobType(jobType);
		context.setSpecStageType(specStageType);
		context.setOrganizationName(organizationName);
		context.setPostName(postName);
		context.setDescription(description);
		context.setBegDate(begDate);
		context.setEndDate(endDate);

		String expectedQuery = "SELECT e FROM PersonWork e WHERE ( e.person = :person OR e.jobType = :jobType OR e.specStageType = :specStageType OR e.organizationName LIKE CONCAT('%',:organizationName,'%') OR e.postName LIKE CONCAT('%',:postName,'%') OR e.description LIKE CONCAT('%',:description,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonWork> pagedSearch = new MultiplePagedSearch<>();
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
		
		Person person = new Person();
		JobType jobType = new JobType();
		SpecStageType specStageType = new SpecStageType();
		String organizationName = "organization name";
		String postName = "post name";
		String description = "post name";
		Date begDate = new Date();
		Date endDate = new Date();

		PersonWork context = new PersonWork();
		context.setPerson(person);
		context.setJobType(jobType);
		context.setSpecStageType(specStageType);
		context.setOrganizationName(organizationName);
		context.setPostName(postName);
		context.setDescription(description);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		
		String expectedQuery = "SELECT e FROM PersonWork e WHERE ( e.person = :person OR e.jobType = :jobType OR e.specStageType = :specStageType OR e.organizationName LIKE CONCAT('%',:organizationName,'%') OR e.postName LIKE CONCAT('%',:postName,'%') OR e.description LIKE CONCAT('%',:description,'%') OR e.begDate <= :begDate OR e.endDate >= :endDate) ";
		MultiplePagedSearch<PersonWork> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
