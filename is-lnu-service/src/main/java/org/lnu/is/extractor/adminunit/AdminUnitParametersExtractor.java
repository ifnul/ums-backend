package org.lnu.is.extractor.adminunit;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.adminunit.type.AdminUnitType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Admin Unit parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("adminUnitParametersExtractor")
public class AdminUnitParametersExtractor extends AbstractParametersExtractor<AdminUnit> {

	@Resource(name = "adminUnitTypeDao")
	private Dao<AdminUnitType, Long> adminUnitTypeDao;
	
	@Resource(name = "adminUnitDao")
	private Dao<AdminUnit, Long> adminUnitDao;
	
	@Override
	protected Map<String, Object> getParameters(final AdminUnit entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getAdminUnitType(), adminUnitTypeDao, "adminUnitType", parameters);
		addParameter(entity.getParent(), adminUnitDao, "parent", parameters);
		
		addParameter(entity.getIdentifier(), "identifier", parameters);
		addParameter(entity.getIdentifier1(), "identifier1", parameters);
		addParameter(entity.getIdentifier2(), "identifier2", parameters);
		addParameter(entity.getIdentifier3(), "identifier3", parameters);
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		
		return parameters;
	}

}
