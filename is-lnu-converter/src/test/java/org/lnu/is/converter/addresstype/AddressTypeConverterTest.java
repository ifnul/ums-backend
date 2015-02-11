package org.lnu.is.converter.addresstype;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.resource.addresstype.AddressTypeResource;

public class AddressTypeConverterTest {

	private AddressTypeConverter unit = new AddressTypeConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		String name = "AddressN";
		String abbrName = "AN";

		AddressType source = new AddressType();
		source.setName(name);
		source.setAbbrName(abbrName);

		AddressTypeResource expected = new AddressTypeResource();
		expected.setName(name);
		expected.setAbbrName(abbrName);

		// When
		AddressTypeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		AddressType source = new AddressType();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<AddressType> sources = Arrays.asList(source); 
		
		AddressTypeResource expected = new AddressTypeResource();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<AddressTypeResource> expecteds = Arrays.asList(expected);
		
		// Where
		List<AddressTypeResource> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
