package com.optigra.funnypictures.web.picture;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.optigra.funnypictures.facade.facade.picture.PictureFacade;
import com.optigra.funnypictures.facade.resources.message.MessageResource;
import com.optigra.funnypictures.facade.resources.message.MessageType;
import com.optigra.funnypictures.facade.resources.picture.PictureResource;
import com.optigra.funnypictures.facade.resources.search.PagedRequest;
import com.optigra.funnypictures.facade.resources.search.PagedResultResource;
import com.optigra.funnypictures.web.BaseController;

@RestController
@RequestMapping(value = "/pictures")
public class PictureController extends BaseController {
	private Logger logger = LoggerFactory.getLogger(PictureController.class);
	
	@Resource(name = "pictureFacade")
	private PictureFacade pictureFacade;

	@RequestMapping
	public PagedResultResource<PictureResource> getPictures(@RequestParam(value = "offset", defaultValue = "0") Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") Integer limit) {
		logger.info("Retrieving PagedResultResource for Picture Resources with offset: {}, limit: {}", offset, limit);
		PagedRequest pagedRequest = new PagedRequest(offset, limit);
		return pictureFacade.getPictures(pagedRequest);
	}

	@RequestMapping(method = RequestMethod.POST)
	public PictureResource createPicture(@RequestBody PictureResource picture) {
		logger.info("Creating Picture resource with: {}", picture);
		return pictureFacade.createPicture(picture);
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public MessageResource updatePicture(@PathVariable("id") Long id, @RequestBody PictureResource pictureResource) {
		logger.info("Updating Picture resource with id: {}, resource: {}", id, pictureResource);
		pictureFacade.updatePicture(id, pictureResource);
		return new MessageResource(MessageType.INFO, "Picture Resource updated");
	}
}
