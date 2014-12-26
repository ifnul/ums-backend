package org.lnu.is.facade.converter.adminunit.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.domain.adminunit.type.AdminUnitType;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.resource.adminunit.type.AdminUnitTypeResource;

/**
 * Admin Unit type converter.
 * @author ivanursul
 *
 */
@Converter("adminUnitTypeConverter")
public class AdminUnitTypeConverter extends AbstractConverter<AdminUnitType, AdminUnitTypeResource> {

	@Override
	public AdminUnitTypeResource convert(final AdminUnitType source, final AdminUnitTypeResource target) {

		target.setId(source.getId());
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public AdminUnitTypeResource convert(final AdminUnitType source) {
		return convert(source, new AdminUnitTypeResource());
	}

}
