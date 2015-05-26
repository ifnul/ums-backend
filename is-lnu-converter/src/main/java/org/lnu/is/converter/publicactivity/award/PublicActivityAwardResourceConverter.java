package org.lnu.is.converter.publicactivity.award;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.publicactivity.PublicActivity;
import org.lnu.is.domain.publicactivity.PublicActivityAward;
import org.lnu.is.resource.publicactivity.award.PublicActivityAwardResource;

/**
 * Public Activity Resource Converter.
 * @author ivanursul
 *
 */
@Converter("publicActivityAwardResourceConverter")
public class PublicActivityAwardResourceConverter extends AbstractConverter<PublicActivityAwardResource, PublicActivityAward> {

	@Override
	public PublicActivityAward convert(final PublicActivityAwardResource source, final PublicActivityAward target) {

		target.setAwardName(source.getAwardName());
		target.setBonus(source.getBonus());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		
		if (source.getPublicActivityId() != null) {
			PublicActivity publicActivity = new PublicActivity();
			publicActivity.setId(source.getPublicActivityId());
			target.setPublicActivity(publicActivity);
		}
		
		if (source.getEnrolmentSubjectId() != null) {
			EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
			enrolmentSubject.setId(source.getEnrolmentSubjectId());
			target.setEnrolmentSubject(enrolmentSubject);
		}
		
		return target;
	}

	@Override
	public PublicActivityAward convert(final PublicActivityAwardResource source) {
		return convert(source, new PublicActivityAward());
	}

}
