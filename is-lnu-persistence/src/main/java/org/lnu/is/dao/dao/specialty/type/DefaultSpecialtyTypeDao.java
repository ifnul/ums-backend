package org.lnu.is.dao.dao.specialty.type;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.specialty.SpecialtyType;
import org.springframework.stereotype.Repository;

/**
 * Default Specialty Type dao.
 * @author ivanursul
 *
 */
@Repository("specialtyTypeDao")
public class DefaultSpecialtyTypeDao extends AbstractDao<SpecialtyType, Long> implements SpecialtyTypeDao {

	@Override
	public Class<SpecialtyType> getEntityClass() {
		return SpecialtyType.class;
	}

}
