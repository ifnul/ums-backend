package org.lnu.is.dao.dao.adminunit;

import org.lnu.is.dao.dao.DefaultDao;
import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.queries.Query;

public class AdminUnitDao extends DefaultDao<AdminUnit, AdminUnit, Long> {

    public AdminUnit getRootAdminUnit() {
        String queryJpql = "SELECT a FROM AdminUnit a WHERE parent IS NULL";
        Query<AdminUnit> query = new Query<>(getEntityClass(), queryJpql);
        return getSingleResult(query);
    }
}
