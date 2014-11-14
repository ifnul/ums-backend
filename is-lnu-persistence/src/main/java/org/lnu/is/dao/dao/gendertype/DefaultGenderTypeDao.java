package org.lnu.is.dao.dao.gendertype;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.gendertype.GenderType;
import org.springframework.stereotype.Repository;

/**
 * Default gender type dao.
 * @author ivanursul
 *
 */
@Repository("genderTypeDao")
public class DefaultGenderTypeDao extends AbstractDao<GenderType, Long> implements GenderTypeDao {

	@Override
	public Class<GenderType> getEntityClass() {
		return GenderType.class;
	}

}
