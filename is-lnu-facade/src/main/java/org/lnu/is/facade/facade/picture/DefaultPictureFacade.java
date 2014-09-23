package org.lnu.is.facade.facade.picture;

import java.util.List;

import javax.annotation.Resource;

import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resources.ApiResource;
import org.lnu.is.facade.resources.picture.PictureResource;
import org.lnu.is.facade.resources.search.PagedRequest;
import org.lnu.is.facade.resources.search.PagedResultResource;
import org.lnu.is.model.Picture;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.picture.PictureService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("pictureFacade")
@Transactional
public class DefaultPictureFacade implements PictureFacade {
	
	@Resource(name = "pagedRequestConverter")
	private Converter<PagedRequest, PagedSearch<Picture>> pagedRequestConverter;

	@Resource(name = "pagedSearchConverter")
	private Converter<PagedResult<?>, PagedResultResource<? extends ApiResource>> pagedResultConverter;

	@Resource(name = "pictureConverter")
	private Converter<Picture, PictureResource> pictureConverter;
	
	@Resource(name = "pictureResourceConverter")
	private Converter<PictureResource, Picture> pictureResourceConverter;
	
	@Resource(name = "pictureService")
	private PictureService pictureService;
	
	@Override
	public PagedResultResource<PictureResource> getPictures(PagedRequest pagedRequest) {
		// Convert PagedRequest to PagedSearch
		PagedSearch<Picture> pagedSearch = pagedRequestConverter.convert(pagedRequest);
		
		// Retrieve result pictureService.getPictures(pagedSearch)
		PagedResult<Picture> pagedResult = pictureService.getPictures(pagedSearch);
		
		// Convert List<Picture> to List<PictureResource>
		List<PictureResource> resources = pictureConverter.convertAll(pagedResult.getEntities());
		
		// Create pagedResultResource
		PagedResultResource<PictureResource> pagedResultResource = new PagedResultResource<>("/pictures");
		pagedResultResource.setEntities(resources);
		
		// Convert PagedResult to PagedResultResource
		pagedResultConverter.convert(pagedResult, pagedResultResource);
		
		return pagedResultResource;
	}

	@Override
	public PictureResource createPicture(PictureResource pictureResource) {
		
		Picture pictureForService = pictureResourceConverter.convert(pictureResource);
		pictureService.createPicture(pictureForService);
		
		return pictureConverter.convert(pictureForService);
	}

	@Override
	public void updatePicture(Long id, PictureResource pictureResource) {
		Picture picture = pictureService.getPicture(id);
		pictureResourceConverter.convert(pictureResource, picture);
		pictureService.updatePicture(picture);
	}

}
