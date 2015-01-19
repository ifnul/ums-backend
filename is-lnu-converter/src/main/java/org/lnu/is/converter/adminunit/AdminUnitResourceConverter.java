package org.lnu.is.converter.adminunit;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.adminunit.type.AdminUnitType;
import org.lnu.is.resource.adminunit.AdminUnitResource;

/**
 * AdminUnitResourceConverter.
 * @author ivanursul
 *
 */
@Converter("adminUnitResourceConverter")
public class AdminUnitResourceConverter extends AbstractConverter<AdminUnitResource, AdminUnit> {

	@Override
	public AdminUnit convert(final AdminUnitResource source, final AdminUnit target) {
		
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		target.setId(source.getId());
		target.setIdentifier(source.getIdentifier());
		target.setIdentifier1(source.getIdentifier1());
		target.setIdentifier2(source.getIdentifier2());
		target.setIdentifier3(source.getIdentifier3());
		target.setName(source.getName());
		
		if (source.getParentId() != null) {
			AdminUnit parent = new AdminUnit();
			parent.setId(source.getParentId());
			target.setParent(parent);
		}
		
		if (source.getAdminUnitTypeId() != null) {
			AdminUnitType adminUnitType = new AdminUnitType();
			adminUnitType.setId(source.getAdminUnitTypeId());
			target.setAdminUnitType(adminUnitType);
		}
		
		return target;
	}

	@Override
	public AdminUnit convert(final AdminUnitResource source) {
		return convert(source, new AdminUnit());
	}

}
