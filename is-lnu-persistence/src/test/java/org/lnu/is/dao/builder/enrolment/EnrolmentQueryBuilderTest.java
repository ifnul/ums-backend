package org.lnu.is.dao.builder.enrolment;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.type.EnrolmentType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.pagination.MultiplePagedSearch;

public class EnrolmentQueryBuilderTest {

	private EnrolmentQueryBuilder unit = new EnrolmentQueryBuilder();
	
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
		Enrolment context = new Enrolment();

		String expectedQuery = "SELECT e FROM Enrolment e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraints() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Enrolment context = new Enrolment();
		
		String expectedQuery = "SELECT e FROM Enrolment e WHERE e.status=:status ";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
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
		
		Enrolment context = new Enrolment();
		
		String expectedQuery = "SELECT e FROM Enrolment e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultCOnstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Enrolment context = new Enrolment();
		
		String expectedQuery = "SELECT e FROM Enrolment e ";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String docNum = "123456789";
		Person person = new Person();
		SpecOffer specOffer = new SpecOffer();
		Department department = new Department();
		PersonPaper personPaper = new PersonPaper();
		EnrolmentType enrolmentType = new EnrolmentType();
		Enrolment parent = new Enrolment();
		Double mark = 1.2;
		String docSeries = "fdsfds";
		String docText = "fdfds";
		Integer isState = 1;
		Integer isContract = 2;
		Integer isPrivilege = 3;
		Integer isHostel = 4;
		Date evDate = new Date();
		Date begDate = new Date();
		Date endDate = new Date();

		Enrolment context = new Enrolment();
		context.setPerson(person);
		context.setSpecOffer(specOffer);
		context.setDepartment(department);
		context.setPersonPaper(personPaper);
		context.setEnrolmentType(enrolmentType);
		context.setParent(parent);
		context.setMark(mark);
		context.setDocSeries(docSeries);
		context.setDocNum(docNum);
		context.setDocText(docText);
		context.setIsState(isState);
		context.setIsContract(isContract);
		context.setIsPrivilege(isPrivilege);
		context.setIsHostel(isHostel);
		context.setEvDate(evDate);
		context.setBegDate(begDate);
		context.setEndDate(endDate);

		String expectedQuery = "SELECT e FROM Enrolment e WHERE ( e.person = :person OR e.specOffer LIKE CONCAT('%',:specOffer,'%') OR e.department = :department OR e.personPaper = :personPaper OR e.enrolmentType = :enrolmentType OR e.parent = :parent OR e.mark LIKE CONCAT('%',:mark,'%') OR e.docSeries LIKE CONCAT('%',:docSeries,'%') OR e.docNum LIKE CONCAT('%',:docNum,'%') OR e.docText LIKE CONCAT('%',:docText,'%') OR e.isState LIKE CONCAT('%',:isState,'%') OR e.isContract LIKE CONCAT('%',:isContract,'%') OR e.isPrivelege LIKE CONCAT('%',:isPrivelege,'%') OR e.isHostel LIKE CONCAT('%',:isHostel,'%') OR e.evDate = :evDate OR e.begDate <= :begDate OR e.endDate >= :endDate) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDIsabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String docNum = "123456789";
		Person person = new Person();
		SpecOffer specOffer = new SpecOffer();
		Department department = new Department();
		PersonPaper personPaper = new PersonPaper();
		EnrolmentType enrolmentType = new EnrolmentType();
		Enrolment parent = new Enrolment();
		Double mark = 1.2;
		String docSeries = "fdsfds";
		String docText = "fdfds";
		Integer isState = 1;
		Integer isContract = 2;
		Integer isPrivilege = 3;
		Integer isHostel = 4;
		Date evDate = new Date();
		Date begDate = new Date();
		Date endDate = new Date();
		
		Enrolment context = new Enrolment();
		context.setPerson(person);
		context.setSpecOffer(specOffer);
		context.setDepartment(department);
		context.setPersonPaper(personPaper);
		context.setEnrolmentType(enrolmentType);
		context.setParent(parent);
		context.setMark(mark);
		context.setDocSeries(docSeries);
		context.setDocNum(docNum);
		context.setDocText(docText);
		context.setIsState(isState);
		context.setIsContract(isContract);
		context.setIsPrivilege(isPrivilege);
		context.setIsHostel(isHostel);
		context.setEvDate(evDate);
		context.setBegDate(begDate);
		context.setEndDate(endDate);
		
		String expectedQuery = "SELECT e FROM Enrolment e WHERE ( e.person = :person OR e.specOffer LIKE CONCAT('%',:specOffer,'%') OR e.department = :department OR e.personPaper = :personPaper OR e.enrolmentType = :enrolmentType OR e.parent = :parent OR e.mark LIKE CONCAT('%',:mark,'%') OR e.docSeries LIKE CONCAT('%',:docSeries,'%') OR e.docNum LIKE CONCAT('%',:docNum,'%') OR e.docText LIKE CONCAT('%',:docText,'%') OR e.isState LIKE CONCAT('%',:isState,'%') OR e.isContract LIKE CONCAT('%',:isContract,'%') OR e.isPrivelege LIKE CONCAT('%',:isPrivelege,'%') OR e.isHostel LIKE CONCAT('%',:isHostel,'%') OR e.evDate = :evDate OR e.begDate <= :begDate OR e.endDate >= :endDate) ";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
