package org.lnu.is.facade.converter.picture;

import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resources.picture.PictureResource;
import org.lnu.is.model.Picture;
import org.springframework.stereotype.Component;

@Component("pictureConverter")
public class PictureConverter extends AbstractConverter<Picture, PictureResource> {

	@Override
	public PictureResource convert(Picture source, PictureResource target) {
		target.setId(source.getId());
		target.setName(source.getName());
		target.setUrl(source.getUrl());
		return target;
	}

	@Override
	public PictureResource convert(Picture source) {
		PictureResource result = new PictureResource();
		if (source != null) {
			result.setId(source.getId());
			result.setName(source.getName());
			result.setUrl(source.getUrl());
		}
		return result;
	}
}
