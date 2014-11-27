package org.lnu.is.service.addresstype;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.address.type.AddressTypeDao;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * Default Address Type Service.
 * 
 * @author ROMA
 *
 */
@Service("addressTypeService")
public class DefaultAddressTypeService implements AddressTypeService {

	@Resource(name = "addressTypeDao")
	private AddressTypeDao defaultDao;

	@Resource(name = "addressTypeParametersExtractor")
	private ParametersExtractor<AddressType> addressTypeParametersExtractor;

	@Override
	public PagedResult<AddressType> getAddressTypes(
			final PagedSearch<AddressType> pagedSearch) {
		Map<String, Object> parameters = addressTypeParametersExtractor
				.getParameters(pagedSearch.getEntity());
		pagedSearch.setParameters(parameters);

		return defaultDao.getEntities(pagedSearch);
	}
}
