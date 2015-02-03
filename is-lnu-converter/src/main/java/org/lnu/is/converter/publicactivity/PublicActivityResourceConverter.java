package org.lnu.is.converter.publicactivity;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.publicactivity.PublicActivity;
import org.lnu.is.domain.publicactivity.PublicActivityType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.resource.publicactivity.PublicActivityResource;

/**
 * Public Activity Resource Converter.
 * @author ivanursul
 *
 */
@Converter("publicActivityResourceConverter")
public class PublicActivityResourceConverter extends AbstractConverter<PublicActivityResource, PublicActivity> {

	@Override
	public PublicActivity convert(final PublicActivityResource source, final PublicActivity target) {

		target.setName(source.getName());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		
		if (source.getPublicActiveTypeId() != null) {
			PublicActivityType publicActiveType = new PublicActivityType();
			publicActiveType.setId(source.getPublicActiveTypeId());
			target.setPublicActiveType(publicActiveType);
		}
		
		if (source.getTimePeriodId() != null) {
			TimePeriod timePeriod = new TimePeriod();
			timePeriod.setId(source.getTimePeriodId());
			target.setTimePeriod(timePeriod);
		}
		
		return target;
	}

	@Override
	public PublicActivity convert(final PublicActivityResource source) {
		return convert(source, new PublicActivity());
	}

}
