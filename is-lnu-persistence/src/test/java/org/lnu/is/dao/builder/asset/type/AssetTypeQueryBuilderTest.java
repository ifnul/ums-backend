package org.lnu.is.dao.builder.asset.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.asset.AssetType;

public class AssetTypeQueryBuilderTest {

	private AssetTypeQueryBuilder unit = new AssetTypeQueryBuilder();
	
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
		AssetType context = new AssetType();
		
		String expected = "SELECT e FROM AssetType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String abbrName = "abrrName";
		String name = "name";
		AssetType context = new AssetType();
		context.setAbbrName(abbrName);
		context.setName(name);
		
		String expected = "SELECT e FROM AssetType e WHERE ( e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
