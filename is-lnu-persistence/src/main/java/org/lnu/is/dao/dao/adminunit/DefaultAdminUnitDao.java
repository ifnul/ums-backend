package org.lnu.is.dao.dao.adminunit;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.springframework.stereotype.Repository;

/**
 * Default admin unit dao.
 * @author ivanursul
 *
 */
@Repository("adminUnitDao")
public class DefaultAdminUnitDao extends AbstractDao<AdminUnit, Long> implements AdminUnitDao {

	@Override
	public Class<AdminUnit> getEntityClass() {
		return AdminUnit.class;
	}

}
