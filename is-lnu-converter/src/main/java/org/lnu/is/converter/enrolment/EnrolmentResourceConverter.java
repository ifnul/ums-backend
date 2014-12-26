package org.lnu.is.converter.enrolment;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.EnrolmentType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.resource.enrolment.EnrolmentResource;

/**
 * Enrolment Resource Converter.
 * 
 * @author kushnir
 *
 */
@Converter("enrolmentResourceConverter")
public class EnrolmentResourceConverter extends AbstractConverter<EnrolmentResource, Enrolment> {

	@Override
	public Enrolment convert(final EnrolmentResource source, final Enrolment target) {
		target.setBegDate(source.getBegDate());
		target.setDocNum(source.getDocNum());
		target.setDocSeries(source.getDocSeries());
		target.setDocText(source.getDocText());
		target.setEndDate(source.getEndDate());
		target.setEvDate(source.getEvDate());
		target.setIsContract(source.getIsContract());
		target.setIsHostel(source.getIsHostel());
		target.setIsPrivilege(source.getIsPrivilege());
		target.setIsState(source.getIsState());
		target.setMark(source.getMark());

		if (source.getPersonId() != null) {
			Person person = new Person();
			person.setId(source.getPersonId());
			target.setPerson(person);
		}

		if (source.getSpecofferId() != null) {
			SpecOffer specOffer = new SpecOffer();
			specOffer.setId(source.getSpecofferId());
			target.setSpecOffer(specOffer);
		}

		if (source.getDepartmentId() != null) {
			Department department = new Department();
			department.setId(source.getDepartmentId());
			target.setDepartment(department);
		}

		if (source.getPersonPaperId() != null) {
			PersonPaper personPaper = new PersonPaper();
			personPaper.setId(source.getPersonPaperId());
			target.setPersonPaper(personPaper);
		}

		if (source.getEnrolmentTypeId() != null) {
			EnrolmentType enrolmentType = new EnrolmentType();
			enrolmentType.setId(source.getEnrolmentTypeId());
			target.setEnrolmentType(enrolmentType);
		}

		if (source.getParentId() != null) {
			Enrolment parent = new Enrolment();
			parent.setId(source.getParentId());
			target.setParent(parent);
		}

		return target;
	}

	@Override
	public Enrolment convert(final EnrolmentResource source) {
		return convert(source, new Enrolment());
	}

}
