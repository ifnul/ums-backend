package org.lnu.is.service.picture;

import org.lnu.is.model.Picture;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

public interface PictureService {

	PagedResult<Picture> getPictures(PagedSearch<Picture> pagedSearch);

	Picture createPicture(Picture picture);

	Picture getPicture(Long id);

	void updatePicture(Picture picture);
	
}

