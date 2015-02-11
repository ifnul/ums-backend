package org.lnu.is.extractor.enrolment.benefit;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.benefit.EnrolmentBenefit;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Enrolment Benefit Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("enrolmentBenefitParametersExtractor")
public class EnrolmentBenefitParametersExtractor extends AbstractParametersExtractor<EnrolmentBenefit> {

	@Resource(name = "enrolmentDao")
	private Dao<Enrolment, Long> enrolmentDao;
	
	@Resource(name = "benefitDao")
	private Dao<Benefit, Long> benefitDao;
	
	@Resource(name = "personPaperDao")
	private Dao<PersonPaper, Long> personPaperDao;
	
	@Override
	protected Map<String, Object> getParameters(final EnrolmentBenefit entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getEnrolment(), enrolmentDao, "enrolment", parameters);
		addParameter(entity.getBenefit(), benefitDao, "benefit", parameters);
		addParameter(entity.getPersonPaper(), personPaperDao, "personPaper", parameters);
		
		return parameters;
	}

}
