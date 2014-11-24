package org.lnu.is.dao.dao.person.address;

import javax.annotation.Resource;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.person.PersonAddress;
import org.springframework.stereotype.Repository;

/**
 * Default Person Address Dao.
 * @author ivanursul
 *
 */
@Repository("personAddressDao")
public class DefaultPersonAddressDao extends AbstractDao<PersonAddress, Long> implements PersonAddressDao {

	@Override
	public Class<PersonAddress> getEntityClass() {
		return PersonAddress.class;
	}

	@Override
	@Resource(name = "personAddressQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<PersonAddress> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

}
