package com.optigra.funnypictures.facade.facade.picture;

import com.optigra.funnypictures.facade.resources.picture.PictureResource;
import com.optigra.funnypictures.facade.resources.search.PagedRequest;
import com.optigra.funnypictures.facade.resources.search.PagedResultResource;

public interface PictureFacade {

	PagedResultResource<PictureResource> getPictures(PagedRequest pagedRequest);
	
	PictureResource createPicture(PictureResource pictureResource);
	
	void updatePicture(Long id, PictureResource pictureResource);

}
