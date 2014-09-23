package org.lnu.is.facade.facade.picture;

import org.lnu.is.facade.resources.picture.PictureResource;
import org.lnu.is.facade.resources.search.PagedRequest;
import org.lnu.is.facade.resources.search.PagedResultResource;

public interface PictureFacade {

	PagedResultResource<PictureResource> getPictures(PagedRequest pagedRequest);
	
	PictureResource createPicture(PictureResource pictureResource);
	
	void updatePicture(Long id, PictureResource pictureResource);

}
