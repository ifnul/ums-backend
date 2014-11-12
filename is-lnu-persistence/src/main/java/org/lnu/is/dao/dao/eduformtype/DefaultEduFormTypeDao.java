package org.lnu.is.dao.dao.eduformtype;

import java.util.Collections;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Repository;

/**
 * Default Edu Form tpe Dao.
 * @author ivanursul
 *
 */
@Repository("eduFormTypeDao")
public class DefaultEduFormTypeDao extends AbstractDao<EduFormType, Long> implements EduFormTypeDao {

	@Override
	public Class<EduFormType> getEntityClass() {
		return EduFormType.class;
	}

	@Override
	public PagedResult<EduFormType> getEduFormTypes(final PagedSearch<EduFormType> pagedSearch) {
		
		Queries query = Queries.FIND_EDU_FORM_TYPES;

		pagedSearch.setClazz(getEntityClass());
		pagedSearch.setParameters(Collections.<String, Object>emptyMap());
		pagedSearch.setQuery(query);
		
		return search(pagedSearch);
	}

}
