package org.lnu.is.converter.addresstype;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.converter.address.type.AddressTypeResourceConverter;
import org.lnu.is.domain.address.type.AddressType;
import org.lnu.is.resource.addresstype.AddressTypeResource;

public class AddressTypeResourceConverterTest {

	private AddressTypeResourceConverter unit = new AddressTypeResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "AddressN";
		String abbrName = "AN";

		AddressType expected = new AddressType();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		AddressTypeResource source = new AddressTypeResource();
		source.setName(name);
		source.setAbbrName(abbrName);

		// When
		AddressType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		AddressTypeResource source = new AddressTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<AddressTypeResource> sources = Arrays.asList(source); 
		
		AddressType expected = new AddressType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<AddressType> expecteds = Arrays.asList(expected);
		
		// Where
		List<AddressType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
