package org.lnu.is.extractor.partner;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Partner parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("partnerParametersExtractor")
public class PartnerParametersExtractor extends AbstractParametersExtractor<Partner> {

	@Resource(name = "partnerDao")
	private Dao<Partner, Partner, Long> partnerDao;
	
	@Override
	public Map<String, Object> getParameters(final Partner entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getParent(), partnerDao, "parent", parameters);
		
		addParameter(entity.getPhone(), "phone", parameters);
		addParameter(entity.getEmail(), "email", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getManager(), "manager", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		
		return parameters;
	}

}
