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
import javax.servlet.http.HttpSession;

/**
 * Created by illya on 07.03.16.
 */
@RestController
@RequestMapping("/edbo")
@Api(value = "edbo", description = "Edbo")
@SessionAttributes("sessionGuid")
public class EdboController  extends BaseController {
    private static final Logger LOG = LoggerFactory.getLogger(EdboController.class);

    @Resource
    private Main main;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(
            @RequestParam("login") String login,
            @RequestParam("password") String password,
            HttpSession httpSession
    ) {
        String sessionGuid = main.login(login, password);
        httpSession.setAttribute("sessionGuid", sessionGuid);
        return sessionGuid;
    }


    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/all", method = RequestMethod.POST)
    @ApiOperation(value = "Synchronize")
    public void synchronize(@ModelAttribute(value = "sessionGuid") String sessionGuid) {
        LOG.info("Edbo synchronize");

        main.synchronizeAll(false, sessionGuid, 0);
    }


    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/specOffer", method = RequestMethod.POST)
    @ApiOperation(value = "Synchronize SpecOffers")
    public void synchronizeSpecoffers(@ModelAttribute(value = "sessionGuid") String sessionGuid) {
        LOG.info("Edbo synchronize");
        main.synchronizeSpecoffers(false, sessionGuid, 0);
    }

}
