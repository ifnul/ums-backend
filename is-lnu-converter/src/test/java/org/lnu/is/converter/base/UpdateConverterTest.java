package org.lnu.is.converter.base;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.street.type.StreetType;
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
	
	@Test(expected = UnsupportedOperationException.class)
	public void testConvertAll() throws Exception {
		// Given
		
		List<StreetTypeResource> streetTypeResource = Arrays.asList(new StreetTypeResource());
		
		// When
		List<StreetType> streetType = unit.convertAll(streetTypeResource);

		// Then
		for (StreetType streetType2 : streetType) {
		    assertNotNull(streetType2.getUpdateDate());
		}
		
	}

}
