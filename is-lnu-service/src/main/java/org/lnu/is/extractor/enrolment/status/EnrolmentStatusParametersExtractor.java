package org.lnu.is.extractor.enrolment.status;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.status.EnrolmentStatus;
import org.lnu.is.domain.enrolment.status.type.EnrolmentStatusType;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Enrolment Status Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("enrolmentStatusParametersExtractor")
public class EnrolmentStatusParametersExtractor extends AbstractParametersExtractor<EnrolmentStatus> {

	@Resource(name = "enrolmentDao")
	private Dao<Enrolment, Enrolment, Long> enrolmentDao;
	
	@Resource(name = "specOfferWaveDao")
	private Dao<SpecOfferWave, SpecOfferWave, Long> specOfferWaveDao;
	
	@Resource(name = "enrolmentStatusTypeDao")
	private Dao<EnrolmentStatusType, EnrolmentStatusType, Long> enrolmentStatusTypeDao;
	
	@Override
	protected Map<String, Object> getParameters(final EnrolmentStatus entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getEnrolment(), enrolmentDao, "enrolment", parameters);
		addParameter(entity.getSpecOfferWave(), specOfferWaveDao, "specOfferWave", parameters);
		addParameter(entity.getEnrolmentStatusType(), enrolmentStatusTypeDao, "enrolmentStatusType", parameters);
		
		addParameter(entity.getIsContract(), "isContract", parameters);
		addParameter(entity.getIsState(), "isState", parameters);
		
		return parameters;
	}

}
