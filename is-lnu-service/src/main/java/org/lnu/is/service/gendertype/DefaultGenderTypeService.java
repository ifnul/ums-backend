package org.lnu.is.service.gendertype;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.gendertype.GenderTypeDao;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * 
 * @author kushnir
 *
 */
@Service("genderTypeService")
public class DefaultGenderTypeService implements GenderTypeService {

	@Resource(name = "genderTypeDao")
	private GenderTypeDao defaultDao;

	@Resource(name = "genderTypeParametersExtractor")
	private ParametersExtractor<GenderType> parametersExtractor;

	@Override
	public PagedResult<GenderType> getGenderTypes(final PagedSearch<GenderType> pagedSearch) {
		Map<String, Object> parameters = parametersExtractor.getParameters(pagedSearch.getEntity());
		pagedSearch.setParameters(parameters);

		return defaultDao.getEntities(pagedSearch);
	}

}
