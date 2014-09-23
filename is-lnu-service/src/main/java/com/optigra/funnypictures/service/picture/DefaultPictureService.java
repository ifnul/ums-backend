package com.optigra.funnypictures.service.picture;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.optigra.funnypictures.dao.picture.PictureDao;
import com.optigra.funnypictures.model.Picture;
import com.optigra.funnypictures.pagination.PagedResult;
import com.optigra.funnypictures.pagination.PagedSearch;

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
