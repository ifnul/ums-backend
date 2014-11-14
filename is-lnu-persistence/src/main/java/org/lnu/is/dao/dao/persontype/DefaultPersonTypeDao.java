package org.lnu.is.dao.dao.persontype;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.persontype.PersonType;
import org.springframework.stereotype.Repository;

/**
 * Default implementation of person type dao.
 * @author ivanursul
 *
 */
@Repository("personTypeDao")
public class DefaultPersonTypeDao extends AbstractDao<PersonType, Long> implements PersonTypeDao {

	@Override
	public Class<PersonType> getEntityClass() {
		return PersonType.class;
	}

}
