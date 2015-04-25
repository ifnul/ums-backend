package org.lnu.is.extractor.publicactivity.award;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.publicactivity.PublicActivity;
import org.lnu.is.domain.publicactivity.PublicActivityAward;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Public activity parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("publicActivityAwardParametersExtractor")
public class PublicActivityAwardParametersExtractor extends AbstractParametersExtractor<PublicActivityAward> {

	@Resource(name = "publicActivityDao")
	private Dao<PublicActivity, PublicActivity, Long> publicActivityDao;
	
	@Resource(name = "enrolmentSubjectDao")
	private Dao<EnrolmentSubject, EnrolmentSubject, Long> enrolmentSubjectDao;
	
	@Override
	protected Map<String, Object> getParameters(final PublicActivityAward entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getPublicActivity(), publicActivityDao, "publicActivity", parameters);
		addParameter(entity.getEnrolmentSubject(), enrolmentSubjectDao, "enrolmentSubject", parameters);
		
		addParameter(entity.getAwardName(), "awardName", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		
		return parameters;
	}

}
