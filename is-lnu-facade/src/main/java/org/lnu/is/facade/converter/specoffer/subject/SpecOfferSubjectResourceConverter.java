package org.lnu.is.facade.converter.specoffer.subject;

import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.specoffer.subject.SpecOfferSubjectResource;

/**
 * Spec Offer Subject ResourceConverter.
 * @author ivanursul
 *
 */
@Converter("specOfferSubjectResourceConverter")
public class SpecOfferSubjectResourceConverter extends AbstractConverter<SpecOfferSubjectResource, SpecofferSubject> {

	@Override
	public SpecofferSubject convert(final SpecOfferSubjectResource source, final SpecofferSubject target) {
		return target;
	}

	@Override
	public SpecofferSubject convert(final SpecOfferSubjectResource source) {
		return convert(source, new SpecofferSubject());
	}

}
