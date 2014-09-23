package com.optigra.funnypictures.facade.converter.picture;

import org.springframework.stereotype.Component;

import com.optigra.funnypictures.facade.converter.AbstractConverter;
import com.optigra.funnypictures.facade.resources.picture.PictureResource;
import com.optigra.funnypictures.model.Picture;

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
