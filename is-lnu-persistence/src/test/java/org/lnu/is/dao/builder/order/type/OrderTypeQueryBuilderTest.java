package org.lnu.is.dao.builder.order.type;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.order.type.OrderType;

public class OrderTypeQueryBuilderTest {

	private OrderTypeQueryBuilder unit = new OrderTypeQueryBuilder();
	
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
		OrderType context = new OrderType();
		
		String expected = "SELECT e FROM OrderType e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithSecurityCOnstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		OrderType context = new OrderType();
		
		String expected = "SELECT e FROM OrderType e WHERE e.status=:status ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		OrderType context = new OrderType();
		
		String expected = "SELECT e FROM OrderType e WHERE e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		OrderType context = new OrderType();
		
		String expected = "SELECT e FROM OrderType e ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		Long parentId = 1L;
		String abbrName = "abbr name";
		String name = "name";
		OrderType parent = new OrderType();
		parent.setId(parentId);
		
		OrderType context = new OrderType();
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setParent(parent);
		
		String expected = "SELECT e FROM OrderType e WHERE ( e.parent = :parent OR e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithParametersAndDIsabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Long parentId = 1L;
		String abbrName = "abbr name";
		String name = "name";
		OrderType parent = new OrderType();
		parent.setId(parentId);
		
		OrderType context = new OrderType();
		context.setAbbrName(abbrName);
		context.setName(name);
		context.setParent(parent);
		
		String expected = "SELECT e FROM OrderType e WHERE ( e.parent = :parent OR e.name LIKE CONCAT('%',:name,'%') OR e.abbrName LIKE CONCAT('%',:abbrName,'%') ) ";
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
