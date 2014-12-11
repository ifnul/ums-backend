package org.lnu.is.extractor.specoffer.subject;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Spec Offer Subject Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("specOfferSubjectParametersExtractor")
public class SpecOfferSubjectParametersExtractor extends AbstractParametersExtractor<SpecofferSubject> {

	@Resource(name = "specOfferDao")
	private Dao<SpecOffer, Long> specOfferDao;
	
	@Resource(name = "enrolmentSubjectDao")
	private Dao<EnrolmentSubject, Long> enrolmenntSubjectDao;
	
	@Override
	public Map<String, Object> getParameters(final SpecofferSubject entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getSpecOffer(), specOfferDao, "specOffer", parameters);
		addParameter(entity.getEnrolmentSubject(), enrolmenntSubjectDao, "enrolmentSubject", parameters);
		addParameter(entity.getIsMajor(), "isMajor", parameters);
		addParameter(entity.getAlternative(), "alternative", parameters);
		
		return parameters;
	}

}
