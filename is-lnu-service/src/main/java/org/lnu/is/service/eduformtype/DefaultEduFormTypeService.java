package org.lnu.is.service.eduformtype;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.eduformtype.EduFormTypeDao;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * Default Edu Form Type.
 * @author ivanursul
 *
 */
@Service("eduFormTypeService")
public class DefaultEduFormTypeService implements EduFormTypeService {

	@Resource(name = "eduFormTypeDao")
	private EduFormTypeDao eduFormTypeDao;
	
	@Override
	public PagedResult<EduFormType> getEduFormTypes(final PagedSearch<EduFormType> pagedSearch) {
		return eduFormTypeDao.getEduFormTypes(pagedSearch);
	}

}
