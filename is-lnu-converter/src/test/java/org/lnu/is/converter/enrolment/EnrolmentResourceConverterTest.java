package org.lnu.is.converter.enrolment;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.EnrolmentType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.resource.enrolment.EnrolmentResource;

public class EnrolmentResourceConverterTest {

	private EnrolmentResourceConverter unit = new EnrolmentResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String docNum = "1234";
		Date begDate = new Date();
		String docSeries = "doc seroes";
		String docText = "dco text";
		Date endDate = new Date();
		Date evDate = new Date();
		Integer isContract = 1;
		Integer isHostel = 2;
		Integer isPrivilege = 3;
		Integer isState = 4;
		Double mark = 2.5;

		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);
		
		Long departmentId = 3L;
		Department department = new Department();
		department.setId(departmentId);
		
		Long personPaperId = 4L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);
		
		Long enrolmentTypeId = 5L;
		EnrolmentType enrolmentType = new EnrolmentType();
		enrolmentType.setId(enrolmentTypeId);
		
		Long parentId = 6L;
		Enrolment parent = new Enrolment();
		parent.setId(parentId);
		
		Long specOfferId = 7L;
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(specOfferId);
		
		Enrolment expected = new Enrolment();
		expected.setDocNum(docNum);
		expected.setBegDate(begDate);
		expected.setDocSeries(docSeries);
		expected.setDocText(docText);
		expected.setEndDate(endDate);
		expected.setEvDate(evDate);
		expected.setIsContract(isContract);
		expected.setIsHostel(isHostel);
		expected.setIsPrivilege(isPrivilege);
		expected.setIsState(isState);
		expected.setMark(mark);
		expected.setPerson(person);
		expected.setSpecOffer(specOffer);
		expected.setDepartment(department);
		expected.setPersonPaper(personPaper);
		expected.setEnrolmentType(enrolmentType);
		expected.setParent(parent);

		EnrolmentResource source = new EnrolmentResource();
		source.setDocNum(docNum);
		source.setBegDate(begDate);
		source.setDocSeries(docSeries);
		source.setDocText(docText);
		source.setEndDate(endDate);
		source.setEvDate(evDate);
		source.setIsContract(isContract);
		source.setIsHostel(isHostel);
		source.setIsPrivilege(isPrivilege);
		source.setIsState(isState);
		source.setMark(mark);
		source.setPersonId(personId);
		source.setSpecofferId(specOfferId);
		source.setDepartmentId(departmentId);
		source.setPersonPaperId(personPaperId);
		source.setEnrolmentTypeId(enrolmentTypeId);
		source.setParentId(parentId);

		// When
		Enrolment actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String docNum = "1234";
		Date begDate = new Date();
		String docSeries = "doc seroes";
		String docText = "dco text";
		Date endDate = new Date();
		Date evDate = new Date();
		Integer isContract = 1;
		Integer isHostel = 2;
		Integer isPrivilege = 3;
		Integer isState = 4;
		Double mark = 2.5;
		
		Enrolment expected = new Enrolment();
		expected.setDocNum(docNum);
		expected.setBegDate(begDate);
		expected.setDocSeries(docSeries);
		expected.setDocText(docText);
		expected.setEndDate(endDate);
		expected.setEvDate(evDate);
		expected.setIsContract(isContract);
		expected.setIsHostel(isHostel);
		expected.setIsPrivilege(isPrivilege);
		expected.setIsState(isState);
		expected.setMark(mark);
		
		EnrolmentResource source = new EnrolmentResource();
		source.setDocNum(docNum);
		source.setBegDate(begDate);
		source.setDocSeries(docSeries);
		source.setDocText(docText);
		source.setEndDate(endDate);
		source.setEvDate(evDate);
		source.setIsContract(isContract);
		source.setIsHostel(isHostel);
		source.setIsPrivilege(isPrivilege);
		source.setIsState(isState);
		source.setMark(mark);
		
		// When
		Enrolment actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
