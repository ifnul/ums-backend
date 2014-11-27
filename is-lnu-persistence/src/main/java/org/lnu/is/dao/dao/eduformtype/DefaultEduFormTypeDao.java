package org.lnu.is.dao.dao.eduformtype;

import javax.annotation.Resource;

import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.dao.AbstractDao;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.springframework.stereotype.Repository;

/**
 * Default Edu Form tpe Dao.
 * @author ivanursul
 *
 */
@Repository("eduFormTypeDao")
public class DefaultEduFormTypeDao extends AbstractDao<EduFormType, Long> implements EduFormTypeDao {

	@Override
	public Class<EduFormType> getEntityClass() {
		return EduFormType.class;
	}

	@Override
	@Resource(name = "eduFormTypeQueryBuilder")
	public void setQueryBuilder(final QueryBuilder<EduFormType> queryBuilder) {
		super.setQueryBuilder(queryBuilder);
	}

}
