package org.lnu.is.dao.dao.address.type;

import javax.annotation.Resource;

import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.dao.AbstractDao;
import org.lnu.is.domain.addresstype.AddressType;
import org.springframework.stereotype.Component;

/**
 * Default address type dao.
 * 
 * @author ROMA
 *
 */
@Component("addressTypeDao")
public class DefaultAddressTypeDao extends AbstractDao<AddressType, Long>
		implements AddressTypeDao {

	@Override
	@Resource(name = "addressTypeQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<AddressType> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

	@Override
	public Class<AddressType> getEntityClass() {
		return AddressType.class;
	}

}
