package org.lnu.is.service.enrolmentstatustype;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.enrolmentstatustype.EnrolmentStatusTypeDao;
import org.lnu.is.domain.enrolmentstatustype.EnrolmentStatusType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * Default implementation of enrolmentstatustype
 * functionality for service layer.
 * @author OlehZanevych
 */
@Service("specOfferService")
public class DefaultEnrolmentStatusTypeService implements EnrolmentStatusTypeService {

	@Resource(name = "enrolmentStatusTypeDao")
	private EnrolmentStatusTypeDao enrolmentStatusTypeDao;
	
	@Override
	public void createEnrolmentStatusType(
			final EnrolmentStatusType enrolmentStatusType) {
		enrolmentStatusTypeDao.save(enrolmentStatusType);
	}

	@Override
	public EnrolmentStatusType getEnrolmentStatusType(final Long id) {
		return enrolmentStatusTypeDao.findById(id);
	}

	@Override
	public void updateEnrolmentStatusType(
			final EnrolmentStatusType enrolmentStatusType) {
		enrolmentStatusTypeDao.update(enrolmentStatusType);
	}

	@Override
	public void removeEnrolmentStatusType(
			final EnrolmentStatusType enrolmentStatusType) {
		enrolmentStatusTypeDao.delete(enrolmentStatusType);
	}

	@Override
	public PagedResult<EnrolmentStatusType> getEnrolmentStatusTypes(
			final PagedSearch<EnrolmentStatusType> pagedSearch) {
		return enrolmentStatusTypeDao.getEnrolmentStatusTypes(pagedSearch);
	}

}