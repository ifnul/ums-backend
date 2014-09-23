package org.lnu.is.dao.picture;

import org.lnu.is.dao.Dao;
import org.lnu.is.model.Picture;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

public interface PictureDao extends Dao<Picture, Long> {

	PagedResult<Picture> getPictures(PagedSearch<Picture> pagedSearch);

}
