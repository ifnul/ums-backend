package org.lnu.is.dao.builder.specoffer;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.pagination.MultiplePagedSearch;

public class SpecOfferQueryBuilderTest {

	private SpecOfferQueryBuilder unit = new SpecOfferQueryBuilder();
	
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
		Specialty specialty = new Specialty();
		TimePeriod timePeriod = new TimePeriod();
		TimePeriod timePeriodCourse = new TimePeriod();
		SpecOffer parent = new SpecOffer();
		SpecOfferType specOfferType = new SpecOfferType();
		EducationFormType eduFormType = new EducationFormType();
		Department department = new Department();
		String docSeries = "docSeries";
		String docNum = "docNum";
		Integer licCount = 2;
		Integer stateCount = 45;

		SpecOffer context = new SpecOffer();
		context.setBegDate(new Date());
		context.setEndDate(new Date());
		context.setDepartment(department);
		context.setDocNum(docNum);
		context.setDocSeries(docSeries);
		context.setEduFormType(eduFormType);
		context.setLicCount(licCount);
		context.setParent(parent);
		context.setSpecialty(specialty);
		context.setSpecOfferType(specOfferType);
		context.setStateCount(stateCount);
		context.setTimePeriod(timePeriod);
		context.setTimePeriodCourse(timePeriodCourse);
		
		String expectedQuery = "SELECT e FROM SpecOffer e WHERE ( e.parent = :parent AND e.specialty = :specialty AND e.department = :department AND e.timePeriod = :timePeriod AND e.timePeriodCourse = :timePeriodCourse AND e.eduFormType = :eduFormType AND e.specOfferType :specOfferType AND e.docSeries LIKE CONCAT('%',:docSeries,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') AND e.licCount = :licCount AND e.stateCount = :stateCount AND e.begDate <= :begDate AND e.endDate >= :endDate ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOffer> pagedSearch = new MultiplePagedSearch<>();
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
		
		Specialty specialty = new Specialty();
		TimePeriod timePeriod = new TimePeriod();
		TimePeriod timePeriodCourse = new TimePeriod();
		SpecOffer parent = new SpecOffer();
		SpecOfferType specOfferType = new SpecOfferType();
		EducationFormType eduFormType = new EducationFormType();
		Department department = new Department();
		String docSeries = "docSeries";
		String docNum = "docNum";
		Integer licCount = 2;
		Integer stateCount = 45;
		
		SpecOffer context = new SpecOffer();
		context.setBegDate(new Date());
		context.setEndDate(new Date());
		context.setDepartment(department);
		context.setDocNum(docNum);
		context.setDocSeries(docSeries);
		context.setEduFormType(eduFormType);
		context.setLicCount(licCount);
		context.setParent(parent);
		context.setSpecialty(specialty);
		context.setSpecOfferType(specOfferType);
		context.setStateCount(stateCount);
		context.setTimePeriod(timePeriod);
		context.setTimePeriodCourse(timePeriodCourse);
		
		String expectedQuery = "SELECT e FROM SpecOffer e WHERE ( e.parent = :parent AND e.specialty = :specialty AND e.department = :department AND e.timePeriod = :timePeriod AND e.timePeriodCourse = :timePeriodCourse AND e.eduFormType = :eduFormType AND e.specOfferType :specOfferType AND e.docSeries LIKE CONCAT('%',:docSeries,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') AND e.licCount = :licCount AND e.stateCount = :stateCount AND e.begDate <= :begDate AND e.endDate >= :endDate ) ";
		MultiplePagedSearch<SpecOffer> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithOneParameter() throws Exception {
		// Given
		SpecOffer parent = new SpecOffer();
		
		SpecOffer context = new SpecOffer();
		context.setParent(parent);
		
		String expectedQuery = "SELECT e FROM SpecOffer e WHERE ( e.parent = :parent ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOffer> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithExmptyParameters() throws Exception {
		// Given
		SpecOffer context = new SpecOffer();
		String expectedQuery = "SELECT e FROM SpecOffer e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOffer> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithExmptyParametersAndDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		SpecOffer context = new SpecOffer();
		String expectedQuery = "SELECT e FROM SpecOffer e WHERE e.status=:status ";
		MultiplePagedSearch<SpecOffer> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithExmptyParametersAndDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		SpecOffer context = new SpecOffer();
		String expectedQuery = "SELECT e FROM SpecOffer e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<SpecOffer> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithExmptyParametersAndDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		SpecOffer context = new SpecOffer();
		String expectedQuery = "SELECT e FROM SpecOffer e ";
		MultiplePagedSearch<SpecOffer> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
