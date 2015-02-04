package org.lnu.is.converter.paper.usage;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.paper.usage.PaperUsage;
import org.lnu.is.resource.paper.usage.PaperUsageResource;

/**
 * Paper Type Resource Converter.
 * 
 * @author illay
 *
 */
@Converter("paperUsageResourceConverter")
public class PaperUsageResourceConverter extends AbstractConverter<PaperUsageResource, PaperUsage> {

	@Override
	public PaperUsage convert(final PaperUsageResource source, final PaperUsage target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());
		
		return target;
	}

	@Override
	public PaperUsage convert(final PaperUsageResource source) {
		return convert(source, new PaperUsage());
	}

}
