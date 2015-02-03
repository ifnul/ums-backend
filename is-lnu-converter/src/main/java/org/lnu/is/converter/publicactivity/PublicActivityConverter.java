package org.lnu.is.converter.publicactivity;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.publicactivity.PublicActivity;
import org.lnu.is.resource.publicactivity.PublicActivityResource;

/**
 * Public Activity Converter.
 * @author ivanursul
 *
 */
@Converter("publicActivityConverter")
public class PublicActivityConverter extends AbstractConverter<PublicActivity, PublicActivityResource> {

	@Override
	public PublicActivityResource convert(final PublicActivity source, final PublicActivityResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		
		if (source.getPublicActiveType() != null) {
			target.setPublicActiveTypeId(source.getPublicActiveType().getId());
		}
		
		if (source.getTimePeriod() != null) {
			target.setTimePeriodId(source.getTimePeriod().getId());
		}
		
		return target;
	}

	@Override
	public PublicActivityResource convert(final PublicActivity source) {
		return convert(source, new PublicActivityResource());
	}

}
