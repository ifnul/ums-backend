package org.lnu.is.service.marriedtype;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.marriedtype.MarriedTypeDao;
import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * Default Married Type Service.
 * @author Bohdan
 *
 */
@Service("marriedTypeService")
public class DefaultMarriedTypeService implements MarriedTypeService {

	@Resource(name = "marriedTypeDao")
	private MarriedTypeDao marriedTypeDao;
	
	@Resource(name = "marriedTypeParametersExtractor")
	private ParametersExtractor<MarriedType> marriedTypeParametersExtractor;
	
	@Override
	public PagedResult<MarriedType> getMarriedTypes(final PagedSearch<MarriedType> pagedSearch) {
		Map<String, Object> parameters = marriedTypeParametersExtractor.getParameters(pagedSearch.getEntity());
		pagedSearch.setParameters(parameters);
		
		return marriedTypeDao.getEntities(pagedSearch);
	}

}
