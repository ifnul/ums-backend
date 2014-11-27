package org.lnu.is.dao.dao.honors.type;

import org.lnu.is.dao.dao.AbstractDao;
import org.lnu.is.domain.honorstype.HonorsType;
import org.springframework.stereotype.Repository;

/**
 * Default honors type dao.
 * @author ivanursul
 *
 */
@Repository("honorsTypeDao")
public class DefaultHonorsTypeDao extends AbstractDao<HonorsType, Long> implements HonorsTypeDao {

	@Override
	public Class<HonorsType> getEntityClass() {
		return HonorsType.class;
	}

}
