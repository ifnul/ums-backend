package org.lnu.is.converter.paper.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.papertype.PaperType;
import org.lnu.is.domain.paperusage.PaperUsage;
import org.lnu.is.resource.paper.type.PaperTypeResource;

/**
 * Paper Type Resource Converter.
 * 
 * @author ivanursul
 *
 */
@Converter("paperTypeResourceConverter")
public class PaperTypeResourceConverter extends AbstractConverter<PaperTypeResource, PaperType> {

	@Override
	public PaperType convert(final PaperTypeResource source, final PaperType target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());
		
		if (source.getPaperUsageId() != null) {
			PaperUsage paperUsage = new PaperUsage();
			paperUsage.setId(source.getPaperUsageId());
			target.setPaperUsage(paperUsage);
		}

		return target;
	}

	@Override
	public PaperType convert(final PaperTypeResource source) {
		return convert(source, new PaperType());
	}

}
