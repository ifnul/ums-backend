package org.lnu.is.service.enrolment.statustype;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.enrolment.statustype.EnrolmentStatusTypeDao;
import org.lnu.is.domain.enrolment.EnrolmentStatusType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * Default implementation of enrolmentstatustype functionality for service
 * layer.
 * 
 * @author OlehZanevych
 */
@Service("enrolmentStatusTypeService")
public class DefaultEnrolmentStatusTypeService implements EnrolmentStatusTypeService {

	@Resource(name = "enrolmentStatusTypeDao")
	private EnrolmentStatusTypeDao defaultDao;

	@Resource(name = "enrolmentStatusTypeParametersExtractor")
	private ParametersExtractor<EnrolmentStatusType> parametersExtractor;
	
	@Override
	public void createEnrolmentStatusType(final EnrolmentStatusType enrolmentStatusType) {
		defaultDao.save(enrolmentStatusType);
	}

	@Override
	public EnrolmentStatusType getEnrolmentStatusType(final Long id) {
		return defaultDao.findById(id);
	}

	@Override
	public void updateEnrolmentStatusType(final EnrolmentStatusType enrolmentStatusType) {
		defaultDao.update(enrolmentStatusType);
	}

	@Override
	public void removeEnrolmentStatusType(final EnrolmentStatusType enrolmentStatusType) {
		defaultDao.delete(enrolmentStatusType);
	}

	@Override
	public PagedResult<EnrolmentStatusType> getEnrolmentStatusTypes(final PagedSearch<EnrolmentStatusType> pagedSearch) {
		return defaultDao.getEntities(pagedSearch);
	}

}
