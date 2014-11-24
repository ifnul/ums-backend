package org.lnu.is.dao.dao.street.type;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.streettype.StreetType;
import org.springframework.stereotype.Repository;

/**
 * Default street type dao.
 * @author ivanursul
 *
 */
@Repository("streetTypeDao")
public class DefaultStreetTypeDao extends AbstractDao<StreetType, Long> implements StreetTypeDao {

	@Override
	public Class<StreetType> getEntityClass() {
		return StreetType.class;
	}

}
