package org.lnu.is.dao.builder.specoffer;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffertype.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.queries.Queries;

public class SpecOfferQueryBuilderTest {

	private SpecOfferQueryBuilder unit = new SpecOfferQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		Specialty specialty = new Specialty();
		TimePeriod timePeriod = new TimePeriod();
		SpecOffer parent = new SpecOffer();
		SpecOfferType specOfferType = new SpecOfferType();
		EduFormType eduFormType = new EduFormType();
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
		
		String expectedQuery = "SELECT s FROM SpecOffer s WHERE s.parent = :parent OR s.specialty = :specialty OR s.department = :department OR s.timePeriod = :timePeriod OR s.eduFormType = :eduFormType OR s.specOfferType :specOfferType OR s.docSeries LIKE CONCAT('%',:docSeries,'%') OR s.docNum LIKE CONCAT('%',:docNum,'%') OR s.licCount = :licCount OR s.stateCount = :stateCount OR t.begDate <= :begDate OR t.endDate >= :endDate";
		
		// When
		Queries actual = unit.build(context);
		String actualQuery = actual.getQuery();
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}

	@Test
	public void testBuildWithExmptyParameters() throws Exception {
		// Given
		SpecOffer context = new SpecOffer();
		String expectedQuery = "SELECT s FROM SpecOffer s ";
		
		// When
		Queries actual = unit.build(context);
		String actualQuery = actual.getQuery();
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
