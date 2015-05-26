package org.lnu.is.extractor.benefit;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Benefit Parameters Extactor.
 * @author ivanursul
 *
 */
@ParametersExtractor("benefitParametersExtractor")
public class BenefitParametersExtractor extends AbstractParametersExtractor<Benefit> {

	@Resource(name = "benefitTypeDao")
	private Dao<BenefitType, Long> benefitTypeDao;
	
	@Resource(name = "benefitDao")
	private Dao<Benefit, Long> benefitDao;
	
	@Override
	protected Map<String, Object> getParameters(final Benefit entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getBenefitType(), benefitTypeDao, "benefitType", parameters);
		addParameter(entity.getParent(), benefitDao, "parent", parameters);
		
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		addParameter(entity.getDescription(), "description", parameters);
		
		return parameters;
	}

}
