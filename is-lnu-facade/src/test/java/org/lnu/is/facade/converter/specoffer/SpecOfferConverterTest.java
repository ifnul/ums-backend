package org.lnu.is.facade.converter.specoffer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.facade.resources.specoffer.SpecOfferResource;

public class SpecOfferConverterTest {

	private SpecOfferConverter unit = new SpecOfferConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		SpecOffer source = new SpecOffer();
		SpecOfferResource expected = new SpecOfferResource();
		
		// When
		SpecOfferResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
