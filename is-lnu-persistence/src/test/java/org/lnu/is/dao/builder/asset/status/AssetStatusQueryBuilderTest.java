package org.lnu.is.dao.builder.asset.status;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.asset.AssetStatus;

public class AssetStatusQueryBuilderTest {
	
	private AssetStatusQueryBuilder unit = new AssetStatusQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}
	

	@Test
	public void testBuild() throws Exception {
		// Given
		AssetStatus context = new AssetStatus();

		String expected = "SELECT e FROM AssetStatus e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String name = "name";
		
		AssetStatus context = new AssetStatus();
		context.setName(name);
		
		String expected = "SELECT e FROM AssetStatus e WHERE ( e.name LIKE CONCAT('%',:name,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
