package org.lnu.is.facade.converter.adminunit;

import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.adminunit.AdminUnitResource;

/**
 * Admin Unit converter.
 * @author ivanursul
 *
 */
@Converter("adminUnitConverter")
public class AdminUnitConverter extends AbstractConverter<AdminUnit, AdminUnitResource> {

	@Override
	public AdminUnitResource convert(final AdminUnit source, final AdminUnitResource target) {
		
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		target.setId(source.getId());
		target.setIdentifier(source.getIdentifier());
		target.setIdentifier1(source.getIdentifier1());
		target.setIdentifier2(source.getIdentifier2());
		target.setIdentifier3(source.getIdentifier3());
		target.setName(source.getName());
		
		if (source.getParent() != null) {
			target.setParentId(source.getParent().getId());
		}
		
		if (source.getAdminUnitType() != null) {
			target.setAdminUnitTypeId(source.getAdminUnitType().getId());
		}
		
		return target;
	}

	@Override
	public AdminUnitResource convert(final AdminUnit source) {
		return convert(source, new AdminUnitResource());
	}

}
