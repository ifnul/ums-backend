package org.lnu.is.dao.builder.asset.status;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.asset.AssetStatus;

public class AssetStatusQueryBuilderTest {
	
	private AssetStatusQueryBuilder unit = new AssetStatusQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String name = "name";
		
		AssetStatus context = new AssetStatus();
		context.setName(name);

		String expected = "SELECT a FROM AssetStatus a WHERE a.name LIKE CONCAT('%',:name,'%') ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}