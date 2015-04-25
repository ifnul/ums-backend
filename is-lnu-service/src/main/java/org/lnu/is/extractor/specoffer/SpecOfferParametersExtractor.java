package org.lnu.is.extractor.specoffer;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Parameters extractor for Spec Offer.
 * @author ivanursul
 *
 */
@ParametersExtractor("specOfferParametersExtractor")
public class SpecOfferParametersExtractor extends AbstractParametersExtractor<SpecOffer> {

	@Resource(name = "specOfferDao")
	private Dao<SpecOffer, SpecOffer, Long> specOfferDao;
	
	@Resource(name = "specialtyDao")
	private Dao<Specialty, Specialty, Long> specialtyDao;
	
	@Resource(name = "departmentDao")
	private Dao<Department, Department, Long> departmentDao;
	
	@Resource(name = "timePeriodDao")
	private Dao<TimePeriod, TimePeriod, Long> timePeriodDao;
	
	@Resource(name = "eduFormTypeDao")
	private Dao<EducationFormType, EducationFormType, Long> eduFormTypeDao;
	
	@Resource(name = "specOfferTypeDao")
	private Dao<SpecOfferType, SpecOfferType, Long> specOfferTypeDao;
	
	@Override
	public Map<String, Object> getParameters(final SpecOffer entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getParent(), specOfferDao, "parent", parameters);
		addParameter(entity.getSpecialty(), specialtyDao, "specialty", parameters);
		addParameter(entity.getDepartment(), departmentDao, "department", parameters);
		addParameter(entity.getTimePeriod(), timePeriodDao, "timePeriod", parameters);
		addParameter(entity.getTimePeriodCourse(), timePeriodDao, "timePeriodCourse", parameters);
		addParameter(entity.getEducationFormType(), eduFormTypeDao, "educationFormType", parameters);
		addParameter(entity.getSpecOfferType(), specOfferTypeDao, "specOfferType", parameters);
		addParameter(entity.getDocSeries(), "docSeries", parameters);
		addParameter(entity.getDocNum(), "docNum", parameters);
		addParameter(entity.getLicCount(), "licCount", parameters);
		addParameter(entity.getStateCount(), "stateCount", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		addParameter(entity.getDuration(), "duration", parameters);
		
		return parameters;
	}

}
