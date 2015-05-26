package org.lnu.is.converter.publicactivity.award;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.publicactivity.PublicActivityAward;
import org.lnu.is.resource.publicactivity.award.PublicActivityAwardResource;

/**
 * Public Activity Converter.
 * @author ivanursul
 *
 */
@Converter("publicActivityAwardConverter")
public class PublicActivityAwardConverter extends AbstractConverter<PublicActivityAward, PublicActivityAwardResource> {

	@Override
	public PublicActivityAwardResource convert(final PublicActivityAward source, final PublicActivityAwardResource target) {

		target.setId(source.getId());
		target.setAwardName(source.getAwardName());
		target.setBonus(source.getBonus());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		
		if (source.getPublicActivity() != null) {
			target.setPublicActivityId(source.getPublicActivity().getId());
		}
		
		if (source.getEnrolmentSubject() != null) {
			target.setEnrolmentSubjectId(source.getEnrolmentSubject().getId());
		}
		
		return target;
	}

	@Override
	public PublicActivityAwardResource convert(final PublicActivityAward source) {
		return convert(source, new PublicActivityAwardResource());
	}

}
