package org.lnu.is.dao.dao.enrolmentstatustype;

import java.util.Collections;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.enrolmentstatustype.EnrolmentStatusType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Repository;

/**
 * Persistence for EnrolmentStatusType dao layer.
 * @author OlehZanevych
 */
@Repository("enrolmentStatusTypeDao")
public class DefaultEnrolmentStatusTypeDao
		extends AbstractDao<EnrolmentStatusType, Long>
		implements EnrolmentStatusTypeDao {

	@Override
	public Class<EnrolmentStatusType> getEntityClass() {
		return EnrolmentStatusType.class;
	}

	@Override
	public PagedResult<EnrolmentStatusType> getEnrolmentStatusTypes(
			PagedSearch<EnrolmentStatusType> pagedSearch) {
		
		Queries query = Queries.FIND_SPECOFFERS;

		pagedSearch.setClazz(getEntityClass());
		pagedSearch.setParameters(Collections.<String, Object>emptyMap());
		pagedSearch.setQuery(query);

		return search(pagedSearch);
	}

}