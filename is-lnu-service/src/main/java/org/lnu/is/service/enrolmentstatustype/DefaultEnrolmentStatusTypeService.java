package org.lnu.is.service.enrolmentstatustype;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.enrolmentstatustype.EnrolmentStatusTypeDao;
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
	private EnrolmentStatusTypeDao enrolmentStatusTypeDao;

	@Resource(name = "enrolmentStatusTypeParametersExtractor")
	private ParametersExtractor<EnrolmentStatusType> parametersExtractor;
	
	@Override
	public void createEnrolmentStatusType(final EnrolmentStatusType enrolmentStatusType) {
		enrolmentStatusTypeDao.save(enrolmentStatusType);
	}

	@Override
	public EnrolmentStatusType getEnrolmentStatusType(final Long id) {
		return enrolmentStatusTypeDao.findById(id);
	}

	@Override
	public void updateEnrolmentStatusType(final EnrolmentStatusType enrolmentStatusType) {
		enrolmentStatusTypeDao.update(enrolmentStatusType);
	}

	@Override
	public void removeEnrolmentStatusType(final EnrolmentStatusType enrolmentStatusType) {
		enrolmentStatusTypeDao.delete(enrolmentStatusType);
	}

	@Override
	public PagedResult<EnrolmentStatusType> getEnrolmentStatusTypes(final PagedSearch<EnrolmentStatusType> pagedSearch) {
		return enrolmentStatusTypeDao.getEntities(pagedSearch);
	}

}
