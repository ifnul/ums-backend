package org.lnu.is.dao.builder.asset.state;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.asset.AssetState;

public class AssetStateQueryBuilderTest {

	private AssetStateQueryBuilder unit = new AssetStateQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		String name = "name";
		AssetState context = new AssetState();
		context.setName(name);
		
		String expected = "SELECT a FROM AssetState a WHERE a.name LIKE CONCAT('%',:name,'%') ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
}