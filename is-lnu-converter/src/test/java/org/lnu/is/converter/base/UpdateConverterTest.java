package org.lnu.is.converter.base;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.lnu.is.domain.streettype.StreetType;
import org.lnu.is.resource.street.type.StreetTypeResource;

public class UpdateConverterTest {

	private UpdateConverter<StreetTypeResource, StreetType> unit = new UpdateConverter<>();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		StreetType streetType = new StreetType();
		StreetTypeResource streetTypeResource = new StreetTypeResource();
		
		// When
		unit.convert(streetTypeResource, streetType);

		// Then
		assertNotNull(streetType.getUpdateDate());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testConvertWithOneArgument() throws Exception {
		unit.convert(null);
	}
}
