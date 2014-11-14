package org.lnu.is.extractor.specoffer;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.department.DepartmentDao;
import org.lnu.is.dao.dao.eduformtype.EduFormTypeDao;
import org.lnu.is.dao.dao.specialty.SpecialtyDao;
import org.lnu.is.dao.dao.specoffer.SpecOfferDao;
import org.lnu.is.dao.dao.specoffertype.SpecOfferTypeDao;
import org.lnu.is.dao.dao.timeperiod.TimePeriodDao;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Parameters extractor for Spec Offer.
 * @author ivanursul
 *
 */
@Component("specOfferParametersExtractor")
public class SpecOfferParametersExtractor extends AbstractParametersExtractor<SpecOffer> {

	@Resource(name = "specOfferDao")
	private SpecOfferDao specOfferDao;
	
	@Resource(name = "specialtyDao")
	private SpecialtyDao specialtyDao;
	
	@Resource(name = "departmentDao")
	private DepartmentDao departmentDao;
	
	@Resource(name = "timePeriodDao")
	private TimePeriodDao timePeriodDao;
	
	@Resource(name = "eduFormTypeDao")
	private EduFormTypeDao eduFormTypeDao;
	
	@Resource(name = "specOfferTypeDao")
	private SpecOfferTypeDao specOfferTypeDao;
	
	@Override
	public Map<String, Object> getParameters(final SpecOffer entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getParent(), specOfferDao, "parent", parameters);
		addParameter(entity.getSpecialty(), specialtyDao, "specialty", parameters);
		addParameter(entity.getDepartment(), departmentDao, "department", parameters);
		addParameter(entity.getTimePeriod(), timePeriodDao, "timePeriod", parameters);
		addParameter(entity.getEduFormType(), eduFormTypeDao, "eduFormType", parameters);
		addParameter(entity.getSpecOfferType(), specOfferTypeDao, "specOfferType", parameters);

		addParameter(entity.getDocSeries(), "docSeries", parameters);
		addParameter(entity.getDocNum(), "docNum", parameters);
		addParameter(entity.getLicCount(), "licCount", parameters);
		addParameter(entity.getStateCount(), "stateCount", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		
		return parameters;
	}

}
