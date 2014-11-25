package org.lnu.is.dao.dao.paper.type;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.papertype.PaperType;
import org.springframework.stereotype.Repository;

/**
 * Default Paper Type Dao.
 * @author ivanursul
 *
 */
@Repository("paperTypeDao")
public class DefaultPaperTypeDao extends AbstractDao<PaperType, Long> implements PaperTypeDao {

	@Override
	public Class<PaperType> getEntityClass() {
		return PaperType.class;
	}

}
