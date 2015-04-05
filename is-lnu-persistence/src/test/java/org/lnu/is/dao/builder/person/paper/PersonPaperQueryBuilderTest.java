package org.lnu.is.dao.builder.person.paper;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.honors.type.HonorType;
import org.lnu.is.domain.paper.type.PaperType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.pagination.MultiplePagedSearch;

public class PersonPaperQueryBuilderTest {

	private PersonPaperQueryBuilder unit = new PersonPaperQueryBuilder();
	
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
		PersonPaper context = new PersonPaper();
		String expectedQuery = "SELECT e FROM PersonPaper e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonPaper> pagedSearch = new MultiplePagedSearch<>();
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
		
		PersonPaper context = new PersonPaper();
		String expectedQuery = "SELECT e FROM PersonPaper e WHERE e.status=:status ";
		MultiplePagedSearch<PersonPaper> pagedSearch = new MultiplePagedSearch<>();
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
		
		PersonPaper context = new PersonPaper();
		String expectedQuery = "SELECT e FROM PersonPaper e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonPaper> pagedSearch = new MultiplePagedSearch<>();
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
		
		PersonPaper context = new PersonPaper();
		String expectedQuery = "SELECT e FROM PersonPaper e ";
		MultiplePagedSearch<PersonPaper> pagedSearch = new MultiplePagedSearch<>();
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
		PaperType paperType = new PaperType();
		HonorType honorsType = new HonorType();
		Date docDate = new Date();
		String docSeries = "dfds";
		String docNum = "fdssd";
		String docIssued = "fdssd";
		String docPin = "asfas xc";
		Integer isChecked = 1;
		Integer isForeign = 2;
		Double mark = 4.5;

		PersonPaper context = new PersonPaper();
		context.setPerson(person);
		context.setPaperType(paperType);
		context.setHonorsType(honorsType);
		context.setDocDate(docDate);
		context.setDocSeries(docSeries);
		context.setDocNum(docNum);
		context.setDocIssued(docIssued);
		context.setDocPin(docPin);
		context.setMark(mark);
		context.setIsChecked(isChecked);
		context.setIsForeign(isForeign);
		
		String expectedQuery = "SELECT e FROM PersonPaper e WHERE ( e.person = :person AND e.paperType = :paperType AND e.honorsType = :honorsType AND e.docDate = :docDate AND e.docSeries LIKE CONCAT('%',:docSeries,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') AND e.docIssued = :docIssued AND e.docPin = :docPin AND e.mark = :mark AND e.isChecked = :isChecked AND e.isForeign = :isForeign ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<PersonPaper> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithDisabledDEfaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Person person = new Person();
		PaperType paperType = new PaperType();
		HonorType honorsType = new HonorType();
		Date docDate = new Date();
		String docSeries = "dfds";
		String docNum = "fdssd";
		String docIssued = "fdssd";
		String docPin = "asfas xc";
		Integer isChecked = 1;
		Integer isForeign = 2;
		Double mark = 4.5;
		
		PersonPaper context = new PersonPaper();
		context.setPerson(person);
		context.setPaperType(paperType);
		context.setHonorsType(honorsType);
		context.setDocDate(docDate);
		context.setDocSeries(docSeries);
		context.setDocNum(docNum);
		context.setDocIssued(docIssued);
		context.setDocPin(docPin);
		context.setMark(mark);
		context.setIsChecked(isChecked);
		context.setIsForeign(isForeign);
		
		String expectedQuery = "SELECT e FROM PersonPaper e WHERE ( e.person = :person AND e.paperType = :paperType AND e.honorsType = :honorsType AND e.docDate = :docDate AND e.docSeries LIKE CONCAT('%',:docSeries,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') AND e.docIssued = :docIssued AND e.docPin = :docPin AND e.mark = :mark AND e.isChecked = :isChecked AND e.isForeign = :isForeign ) ";
		MultiplePagedSearch<PersonPaper> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
