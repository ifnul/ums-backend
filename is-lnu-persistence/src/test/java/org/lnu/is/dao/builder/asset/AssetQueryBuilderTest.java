package org.lnu.is.dao.builder.asset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.asset.AssetState;
import org.lnu.is.domain.asset.AssetStatus;
import org.lnu.is.domain.asset.AssetType;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.partner.Partner;

public class AssetQueryBuilderTest {

	private AssetQueryBuilder unit = new AssetQueryBuilder();
	
	@Test
	public void testBuild() throws Exception {
		// Given
		Asset context = new Asset();

		String expectedSql = "SELECT e FROM Asset e WHERE e.status=:status ";
		
		// When
		String actualSql = unit.build(context);

		// Then
		assertEquals(expectedSql, actualSql);
	}

	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		AssetType assetType = new AssetType();
		AssetState assetState = new AssetState();
		AssetStatus assetStatus = new AssetStatus();
		Department department = new Department();
		Employee employee = new Employee();
		Partner partner = new Partner();
		Order order = new Order();

		Asset context = new Asset();
		context.setAssetType(assetType);
		context.setAssetState(assetState);
		context.setAssetStatus(assetStatus);
		context.setDepartment(department);
		context.setEmployee(employee);
		context.setPartner(partner);
		context.setOrder(order);
		
		String expectedSql = "SELECT e FROM Asset e WHERE ( e.order = :order OR e.partner = :partner OR e.employee = :employee OR e.department = :department OR e.assetStatus = :assetStatus OR e.assetState = :assetState OR e.assetType = :assetType ) AND e.status=:status ";
		
		// When
		String actualSql = unit.build(context);
		
		// Then
		assertEquals(expectedSql, actualSql);
	}
}
