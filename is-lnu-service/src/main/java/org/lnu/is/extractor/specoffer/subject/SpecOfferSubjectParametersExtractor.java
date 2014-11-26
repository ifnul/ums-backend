package org.lnu.is.extractor.specoffer.subject;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.enrolment.subject.EnrolmentSubjectDao;
import org.lnu.is.dao.dao.specoffer.SpecOfferDao;
import org.lnu.is.domain.specoffer.SpecofferSubject;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Spec Offer Subject Parameters Extractor.
 * @author ivanursul
 *
 */
@Component("specOfferSubjectParametersExtractor")
public class SpecOfferSubjectParametersExtractor extends AbstractParametersExtractor<SpecofferSubject> {

	@Resource(name = "specOfferDao")
	private SpecOfferDao specOfferDao;
	
	@Resource(name = "enrolmentSubjectDao")
	private EnrolmentSubjectDao enrolmenntSubjectDao;
	
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
