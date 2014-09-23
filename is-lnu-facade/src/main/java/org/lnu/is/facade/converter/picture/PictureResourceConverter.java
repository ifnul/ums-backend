package org.lnu.is.facade.converter.picture;

import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resources.picture.PictureResource;
import org.lnu.is.model.Picture;
import org.springframework.stereotype.Component;

@Component("pictureResourceConverter")
public class PictureResourceConverter extends AbstractConverter<PictureResource, Picture> {

	@Override
	public Picture convert(PictureResource source, Picture target) {
		
		target.setName(source.getName());
		target.setUrl(source.getUrl());
		
		return target;
	}

	@Override
	public Picture convert(PictureResource source) {
		return convert(source, new Picture());
	}

}
