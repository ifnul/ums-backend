package org.lnu.is.dao.picture;

import java.util.Collections;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.model.Picture;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Repository;

@Repository("pictureDao")
public class DefaultPictureDao extends AbstractDao<Picture, Long> implements PictureDao {

	@Override
	public Class<Picture> getEntityClass() {
		return Picture.class;
	}

	@Override
	public PagedResult<Picture> getPictures(PagedSearch<Picture> pagedSearch) {
		
		Queries query = Queries.FIND_PICTURES;
		
		pagedSearch.setClazz(getEntityClass());
		pagedSearch.setParameters(Collections.<String, Object>emptyMap());
		pagedSearch.setQuery(query);
		
		return search(pagedSearch);
	}

}
