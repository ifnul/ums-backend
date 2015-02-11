package org.lnu.is.converter.asset.type;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.asset.type.AssetType;
import org.lnu.is.resource.asset.type.AssetTypeResource;

public class AssetTypeResourceConverterTest {

	private AssetTypeResourceConverter unit = new AssetTypeResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		String name = "name";
		String abbrName = "abbrname";
		AssetType expected = new AssetType();
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		AssetTypeResource source = new AssetTypeResource();
		source.setAbbrName(abbrName);
		source.setId(id);
		source.setName(name);
		
		// When
		AssetType actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1l;
		String abbrName = "abbr Name";
		String name = "n a m e";
		
		AssetTypeResource source = new AssetTypeResource();
		source.setId(id);
		source.setAbbrName(abbrName);
		source.setName(name);
		
		List<AssetTypeResource> sources = Arrays.asList(source); 
		
		AssetType expected = new AssetType();
		expected.setId(id);
		expected.setAbbrName(abbrName);
		expected.setName(name);
		
		List<AssetType> expecteds = Arrays.asList(expected);
		
		// Where
		List<AssetType> actuals = unit.convertAll(sources);
		
		//Then
		assertEquals(expecteds, actuals);
	}
}
