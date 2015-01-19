package org.lnu.is.converter.enrolment;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.resource.enrolment.EnrolmentResource;

/**
 * Enrolment converter.
 * 
 * @author kushnir
 *
 */
@ResourceConverter("enrolmentConverter")
public class EnrolmentConverter extends AbstractConverter<Enrolment, EnrolmentResource> {

	@Override
	public EnrolmentResource convert(final Enrolment source, final EnrolmentResource target) {
		target.setId(source.getId());
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

		if (source.getPerson() != null) {
			target.setPersonId(source.getPerson().getId());
		}

		if (source.getSpecOffer() != null) {
			target.setSpecofferId(source.getSpecOffer().getId());
		}

		if (source.getDepartment() != null) {
			target.setDepartmentId(source.getDepartment().getId());
		}

		if (source.getPersonPaper() != null) {
			target.setPersonPaperId(source.getPersonPaper().getId());
		}

		if (source.getEnrolmentType() != null) {
			target.setEnrolmentTypeId(source.getEnrolmentType().getId());
		}

		if (source.getParent() != null) {
			target.setParentId(source.getParent().getId());
		}

		return target;
	}

	@Override
	public EnrolmentResource convert(final Enrolment source) {
		return convert(source, new EnrolmentResource());
	}

}
