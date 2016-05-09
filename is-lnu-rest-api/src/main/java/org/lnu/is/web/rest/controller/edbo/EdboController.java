package org.lnu.is.web.rest.controller.edbo;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.lnu.is.edbo.Main;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by illya on 07.03.16.
 */
@RestController
@RequestMapping("/edbo")
@Api(value = "edbo", description = "Edbo")
public class EdboController  extends BaseController {
    private static final Logger LOG = LoggerFactory.getLogger(EdboController.class);

    @Resource
    private Main main;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/all", method = RequestMethod.POST)
    @ApiOperation(value = "Synchronize")
    public void synchronize() {
        LOG.info("Edbo synchronize");
        main.synchronizeAll(false, "", 0);
    }


    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/specOffer", method = RequestMethod.POST)
    @ApiOperation(value = "Synchronize SpecOffers")
    public void synchronizeSpecoffers() {
        LOG.info("Edbo synchronize");
        main.synchronizeSpecoffers(false, "", 0);
    }

}
