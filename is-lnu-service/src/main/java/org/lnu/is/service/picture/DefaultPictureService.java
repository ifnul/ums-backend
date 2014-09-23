package org.lnu.is.service.picture;

import javax.annotation.Resource;

import org.lnu.is.dao.picture.PictureDao;
import org.lnu.is.model.Picture;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

@Service("pictureService")
public class DefaultPictureService implements PictureService {

	@Resource(name = "pictureDao")
	private PictureDao pictureDao;
	
	@Override
	public PagedResult<Picture> getPictures(PagedSearch<Picture> pagedSearch) {
		return pictureDao.getPictures(pagedSearch);
	}

	@Override
	public Picture createPicture(Picture picture) {
		pictureDao.save(picture);
		return picture;
	}

	@Override
	public Picture getPicture(Long id) {
		return pictureDao.findById(id);
	}

	@Override
	public void updatePicture(Picture picture) {
		pictureDao.update(picture);
	}

}
