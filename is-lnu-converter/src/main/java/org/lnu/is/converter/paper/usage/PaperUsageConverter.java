package org.lnu.is.converter.paper.usage;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.paper.usage.PaperUsage;
import org.lnu.is.resource.paper.usage.PaperUsageResource;

/**
 * Paper Type Converter.
 * 
 * @author illay
 *
 */

@Converter("paperUsageConverter")
public class PaperUsageConverter extends AbstractConverter<PaperUsage, PaperUsageResource> {

	@Override
	public PaperUsageResource convert(final PaperUsage source, final PaperUsageResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public PaperUsageResource convert(final PaperUsage source) {	
		return convert(source, new PaperUsageResource());
	}

}
