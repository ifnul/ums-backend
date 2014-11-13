package org.lnu.is.extractor.specoffertype;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.specialtytype.SpecialtyTypeDao;
import org.lnu.is.domain.specialtype.SpecialtyType;
import org.lnu.is.domain.specoffertype.SpecOfferType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Component;

/**
 * Spec Offer Type Parameter extractor.
 * @author ivanursul
 *
 */
@Component("specOfferTypeParametersExtractor")
public class SpecOfferTypeParametersExtractor implements ParametersExtractor<SpecOfferType> {

	@Resource(name = "specialtyTypeDao")
	private SpecialtyTypeDao specialtyTypeDao;
	
	@Override
	public Map<String, Object> getParameters(final PagedSearch<SpecOfferType> pagedSearch) {
		SpecOfferType context = pagedSearch.getEntity();
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		if (context.getAbbrName() != null) {
			parameters.put("abbrName", context.getAbbrName());
		}
		
		if (context.getName() != null) {
			parameters.put("name", context.getName());
		}
		
		if (context.getSpecialtyType() != null) {
			SpecialtyType specialtyType = specialtyTypeDao.findById(context.getSpecialtyType().getId());
			parameters.put("specialtyType", specialtyType);
		}
		
		return parameters;
	}

}
