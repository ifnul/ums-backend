package org.lnu.is.dao.builder.asset.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.asset.AssetType;

public class AssetTypeQueryBuilderTest {

	private AssetTypeQueryBuilder unit = new AssetTypeQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		AssetType context = new AssetType();
		
		String expected = "SELECT a FROM AssetType a ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}
