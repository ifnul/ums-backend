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
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffertype.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Component;

/**
 * Parameters extractor for Spec Offer.
 * @author ivanursul
 *
 */
@Component("specOfferParametersExtractor")
public class SpecOfferParametersExtractor implements ParametersExtractor<SpecOffer> {

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
	public Map<String, Object> getParameters(final PagedSearch<SpecOffer> pagedSearch) {
		SpecOffer entity = pagedSearch.getEntity();
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		if (entity.getParent() != null) {
			SpecOffer parent = specOfferDao.findById(entity.getParent().getId());
			parameters.put("parent", parent);
		}
		
		if (entity.getSpecialty() != null) {
			Specialty specialty = specialtyDao.findById(entity.getSpecialty().getId());
			parameters.put("specialty", specialty);
		}
		
		if (entity.getDepartment() != null) {
			Department department = departmentDao.findById(entity.getDepartment().getId());
			parameters.put("department", department);
		}
		
		if (entity.getTimePeriod() != null) {
			TimePeriod timePeriod = timePeriodDao.findById(entity.getTimePeriod().getId());
			parameters.put("timePeriod", timePeriod);
		}
		
		if (entity.getEduFormType() != null) {
			EduFormType eduFormType = eduFormTypeDao.findById(entity.getEduFormType().getId());
			parameters.put("eduFormType", eduFormType);
		}
		
		if (entity.getSpecOfferType() != null) {
			SpecOfferType specOfferType = specOfferTypeDao.findById(entity.getSpecOfferType().getId());
			parameters.put("specOfferType", specOfferType);
		}
		
		if (entity.getDocSeries() != null) {
			parameters.put("docSeries", entity.getDocSeries());
		}
		
		if (entity.getDocNum() != null) {
			parameters.put("docNum", entity.getDocNum());
		}
		
		if (entity.getLicCount() != null) {
			parameters.put("licCount", entity.getLicCount());
		}
		
		if (entity.getStateCount() != null) {
			parameters.put("stateCount", entity.getStateCount());
		}
		
		if (entity.getBegDate() != null) {
			parameters.put("begDate", entity.getBegDate());
		}
		
		if (entity.getEndDate() != null) {
			parameters.put("endDate", entity.getEndDate());
		}
		
		return parameters;
	}

}
