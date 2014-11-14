package org.lnu.is.dao.dao.marriedtype;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.marriedtype.MarriedType;
import org.springframework.stereotype.Repository;

/**
 * Default married type dao.
 * @author ivanursul
 *
 */
@Repository("marriedTypeDao")
public class DefaultMarriedTypeDao extends AbstractDao<MarriedType, Long> implements MarriedTypeDao {

	@Override
	public Class<MarriedType> getEntityClass() {
		return MarriedType.class;
	}

}
