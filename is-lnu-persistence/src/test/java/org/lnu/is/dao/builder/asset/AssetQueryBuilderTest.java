package org.lnu.is.dao.builder.asset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.asset.Asset;

public class AssetQueryBuilderTest {

	private AssetQueryBuilder unit = new AssetQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		Asset context = new Asset();

		String expectedSql = "SELECT a FROM Asset a ";
		
		// When
		String actualSql = unit.build(context);

		// Then
		assertEquals(expectedSql, actualSql);
	}
}
