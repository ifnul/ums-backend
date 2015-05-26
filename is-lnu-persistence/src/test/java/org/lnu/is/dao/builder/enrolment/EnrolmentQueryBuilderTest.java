package org.lnu.is.dao.builder.enrolment;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.type.EnrolmentType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

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
	public void testBuildWithOrderBy() throws Exception {
		// Given
		Enrolment context = new Enrolment();
		
		OrderBy orderBy1 = new OrderBy("person", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specOffer", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("personPaper", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("enrolmentType", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("parent", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("mark", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("docSeries", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("docNum", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("docText", OrderByType.DESC);
		OrderBy orderBy11 = new OrderBy("isState", OrderByType.ASC);
		OrderBy orderBy12 = new OrderBy("isContract", OrderByType.DESC);
		OrderBy orderBy13 = new OrderBy("isPrivilege", OrderByType.ASC);
		OrderBy orderBy14 = new OrderBy("isHostel", OrderByType.DESC);
		OrderBy orderBy15 = new OrderBy("evDate", OrderByType.ASC);
		OrderBy orderBy16 = new OrderBy("begDate", OrderByType.DESC);
		OrderBy orderBy17 = new OrderBy("endDate", OrderByType.ASC);
		OrderBy orderBy18 = new OrderBy("priority", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10, orderBy11, orderBy12, orderBy13, orderBy14, orderBy15, orderBy16, orderBy17, orderBy18);

		String expectedQuery = "SELECT e FROM Enrolment e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.person ASC, e.specOffer DESC, e.department ASC, e.personPaper DESC, e.enrolmentType ASC, e.parent DESC, e.mark ASC, e.docSeries DESC, e.docNum ASC, e.docText DESC, e.isState ASC, e.isContract DESC, e.isPrivilege ASC, e.isHostel DESC, e.evDate ASC, e.begDate DESC, e.endDate ASC, e.priority DESC";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testBuildWithDisabledSecurityConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Enrolment context = new Enrolment();
		
		OrderBy orderBy1 = new OrderBy("person", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specOffer", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("personPaper", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("enrolmentType", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("parent", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("mark", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("docSeries", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("docNum", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("docText", OrderByType.DESC);
		OrderBy orderBy11 = new OrderBy("isState", OrderByType.ASC);
		OrderBy orderBy12 = new OrderBy("isContract", OrderByType.DESC);
		OrderBy orderBy13 = new OrderBy("isPrivilege", OrderByType.ASC);
		OrderBy orderBy14 = new OrderBy("isHostel", OrderByType.DESC);
		OrderBy orderBy15 = new OrderBy("evDate", OrderByType.ASC);
		OrderBy orderBy16 = new OrderBy("begDate", OrderByType.DESC);
		OrderBy orderBy17 = new OrderBy("endDate", OrderByType.ASC);
		OrderBy orderBy18 = new OrderBy("priority", OrderByType.DESC);
		OrderBy orderBy19 = new OrderBy("isEducationState", OrderByType.DESC);
		OrderBy orderBy20 = new OrderBy("isInterview", OrderByType.DESC);
		OrderBy orderBy21 = new OrderBy("isOriginal", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10, orderBy11, orderBy12, orderBy13, orderBy14, orderBy15, orderBy16, orderBy17, orderBy18, orderBy19, orderBy20, orderBy21);
		
		String expectedQuery = "SELECT e FROM Enrolment e WHERE e.status=:status ORDER BY e.person ASC, e.specOffer DESC, e.department ASC, e.personPaper DESC, e.enrolmentType ASC, e.parent DESC, e.mark ASC, e.docSeries DESC, e.docNum ASC, e.docText DESC, e.isState ASC, e.isContract DESC, e.isPrivilege ASC, e.isHostel DESC, e.evDate ASC, e.begDate DESC, e.endDate ASC, e.priority DESC, e.isEducationState DESC, e.isInterview DESC, e.isOriginal DESC";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testBuildWithDisabledStatusConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		
		Enrolment context = new Enrolment();
		
		OrderBy orderBy1 = new OrderBy("person", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specOffer", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("personPaper", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("enrolmentType", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("parent", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("mark", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("docSeries", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("docNum", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("docText", OrderByType.DESC);
		OrderBy orderBy11 = new OrderBy("isState", OrderByType.ASC);
		OrderBy orderBy12 = new OrderBy("isContract", OrderByType.DESC);
		OrderBy orderBy13 = new OrderBy("isPrivilege", OrderByType.ASC);
		OrderBy orderBy14 = new OrderBy("isHostel", OrderByType.DESC);
		OrderBy orderBy15 = new OrderBy("evDate", OrderByType.ASC);
		OrderBy orderBy16 = new OrderBy("begDate", OrderByType.DESC);
		OrderBy orderBy17 = new OrderBy("endDate", OrderByType.ASC);
		OrderBy orderBy18 = new OrderBy("priority", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10, orderBy11, orderBy12, orderBy13, orderBy14, orderBy15, orderBy16, orderBy17, orderBy18);
		
		String expectedQuery = "SELECT e FROM Enrolment e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.person ASC, e.specOffer DESC, e.department ASC, e.personPaper DESC, e.enrolmentType ASC, e.parent DESC, e.mark ASC, e.docSeries DESC, e.docNum ASC, e.docText DESC, e.isState ASC, e.isContract DESC, e.isPrivilege ASC, e.isHostel DESC, e.evDate ASC, e.begDate DESC, e.endDate ASC, e.priority DESC";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
	public void testBuildWithDisabledDefaultCOnstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Enrolment context = new Enrolment();
		
		OrderBy orderBy1 = new OrderBy("person", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specOffer", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("personPaper", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("enrolmentType", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("parent", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("mark", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("docSeries", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("docNum", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("docText", OrderByType.DESC);
		OrderBy orderBy11 = new OrderBy("isState", OrderByType.ASC);
		OrderBy orderBy12 = new OrderBy("isContract", OrderByType.DESC);
		OrderBy orderBy13 = new OrderBy("isPrivilege", OrderByType.ASC);
		OrderBy orderBy14 = new OrderBy("isHostel", OrderByType.DESC);
		OrderBy orderBy15 = new OrderBy("evDate", OrderByType.ASC);
		OrderBy orderBy16 = new OrderBy("begDate", OrderByType.DESC);
		OrderBy orderBy17 = new OrderBy("endDate", OrderByType.ASC);
		OrderBy orderBy18 = new OrderBy("priority", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10, orderBy11, orderBy12, orderBy13, orderBy14, orderBy15, orderBy16, orderBy17, orderBy18);
		
		String expectedQuery = "SELECT e FROM Enrolment e ORDER BY e.person ASC, e.specOffer DESC, e.department ASC, e.personPaper DESC, e.enrolmentType ASC, e.parent DESC, e.mark ASC, e.docSeries DESC, e.docNum ASC, e.docText DESC, e.isState ASC, e.isContract DESC, e.isPrivilege ASC, e.isHostel DESC, e.evDate ASC, e.begDate DESC, e.endDate ASC, e.priority DESC";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
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
		Integer isEducationState = 0;
		Integer isInterview = 0;
		Integer isOriginal = 0;
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
		context.setIsEducationState(isEducationState);
		context.setIsInterview(isInterview);
		context.setIsOriginal(isOriginal);
		context.setEvDate(evDate);
		context.setBegDate(begDate);
		context.setEndDate(endDate);

		String expectedQuery = "SELECT e FROM Enrolment e WHERE ( e.person = :person AND e.specOffer LIKE CONCAT('%',:specOffer,'%') AND e.department = :department AND e.personPaper = :personPaper AND e.enrolmentType = :enrolmentType AND e.parent = :parent AND e.mark = :mark AND e.docSeries LIKE CONCAT('%',:docSeries,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') AND e.docText LIKE CONCAT('%',:docText,'%') AND e.isState = :isState AND e.isContract = :isContract AND e.isPrivilege = :isPrivilege AND e.isHostel = :isHostel AND e.isEducationState = :isEducationState AND e.isInterview = :isInterview AND e.isOriginal = :isOriginal AND e.evDate = :evDate AND e.begDate <= :begDate AND e.endDate >= :endDate) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithOrderBy() throws Exception {
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
		
		OrderBy orderBy1 = new OrderBy("person", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specOffer", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("personPaper", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("enrolmentType", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("parent", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("mark", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("docSeries", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("docNum", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("docText", OrderByType.DESC);
		OrderBy orderBy11 = new OrderBy("isState", OrderByType.ASC);
		OrderBy orderBy12 = new OrderBy("isContract", OrderByType.DESC);
		OrderBy orderBy13 = new OrderBy("isPrivilege", OrderByType.ASC);
		OrderBy orderBy14 = new OrderBy("isHostel", OrderByType.DESC);
		OrderBy orderBy15 = new OrderBy("evDate", OrderByType.ASC);
		OrderBy orderBy16 = new OrderBy("begDate", OrderByType.DESC);
		OrderBy orderBy17 = new OrderBy("endDate", OrderByType.ASC);
		OrderBy orderBy18 = new OrderBy("priority", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10, orderBy11, orderBy12, orderBy13, orderBy14, orderBy15, orderBy16, orderBy17, orderBy18);

		String expectedQuery = "SELECT e FROM Enrolment e WHERE ( e.person = :person AND e.specOffer LIKE CONCAT('%',:specOffer,'%') AND e.department = :department AND e.personPaper = :personPaper AND e.enrolmentType = :enrolmentType AND e.parent = :parent AND e.mark = :mark AND e.docSeries LIKE CONCAT('%',:docSeries,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') AND e.docText LIKE CONCAT('%',:docText,'%') AND e.isState = :isState AND e.isContract = :isContract AND e.isPrivilege = :isPrivilege AND e.isHostel = :isHostel AND e.evDate = :evDate AND e.begDate <= :begDate AND e.endDate >= :endDate) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.person ASC, e.specOffer DESC, e.department ASC, e.personPaper DESC, e.enrolmentType ASC, e.parent DESC, e.mark ASC, e.docSeries DESC, e.docNum ASC, e.docText DESC, e.isState ASC, e.isContract DESC, e.isPrivilege ASC, e.isHostel DESC, e.evDate ASC, e.begDate DESC, e.endDate ASC, e.priority DESC";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
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
		
		String expectedQuery = "SELECT e FROM Enrolment e WHERE ( e.person = :person AND e.specOffer LIKE CONCAT('%',:specOffer,'%') AND e.department = :department AND e.personPaper = :personPaper AND e.enrolmentType = :enrolmentType AND e.parent = :parent AND e.mark = :mark AND e.docSeries LIKE CONCAT('%',:docSeries,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') AND e.docText LIKE CONCAT('%',:docText,'%') AND e.isState = :isState AND e.isContract = :isContract AND e.isPrivilege = :isPrivilege AND e.isHostel = :isHostel AND e.evDate = :evDate AND e.begDate <= :begDate AND e.endDate >= :endDate) ";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersAndDisabledDefaultConstraintsWithOrderBy() throws Exception {
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
		
		OrderBy orderBy1 = new OrderBy("person", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("specOffer", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("department", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("personPaper", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("enrolmentType", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("parent", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("mark", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("docSeries", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("docNum", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("docText", OrderByType.DESC);
		OrderBy orderBy11 = new OrderBy("isState", OrderByType.ASC);
		OrderBy orderBy12 = new OrderBy("isContract", OrderByType.DESC);
		OrderBy orderBy13 = new OrderBy("isPrivilege", OrderByType.ASC);
		OrderBy orderBy14 = new OrderBy("isHostel", OrderByType.DESC);
		OrderBy orderBy15 = new OrderBy("evDate", OrderByType.ASC);
		OrderBy orderBy16 = new OrderBy("begDate", OrderByType.DESC);
		OrderBy orderBy17 = new OrderBy("endDate", OrderByType.ASC);
		OrderBy orderBy18 = new OrderBy("priority", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10, orderBy11, orderBy12, orderBy13, orderBy14, orderBy15, orderBy16, orderBy17, orderBy18);
		
		String expectedQuery = "SELECT e FROM Enrolment e WHERE ( e.person = :person AND e.specOffer LIKE CONCAT('%',:specOffer,'%') AND e.department = :department AND e.personPaper = :personPaper AND e.enrolmentType = :enrolmentType AND e.parent = :parent AND e.mark = :mark AND e.docSeries LIKE CONCAT('%',:docSeries,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') AND e.docText LIKE CONCAT('%',:docText,'%') AND e.isState = :isState AND e.isContract = :isContract AND e.isPrivilege = :isPrivilege AND e.isHostel = :isHostel AND e.evDate = :evDate AND e.begDate <= :begDate AND e.endDate >= :endDate) ORDER BY e.person ASC, e.specOffer DESC, e.department ASC, e.personPaper DESC, e.enrolmentType ASC, e.parent DESC, e.mark ASC, e.docSeries DESC, e.docNum ASC, e.docText DESC, e.isState ASC, e.isContract DESC, e.isPrivilege ASC, e.isHostel DESC, e.evDate ASC, e.begDate DESC, e.endDate ASC, e.priority DESC";
		MultiplePagedSearch<Enrolment> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
}
