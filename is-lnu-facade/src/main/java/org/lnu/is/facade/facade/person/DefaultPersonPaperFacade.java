package org.lnu.is.facade.facade.person;

import javax.annotation.Resource;

import org.lnu.is.facade.annotations.Facade;
import org.lnu.is.service.person.paper.PersonPaperService;

/**
 * Default implementation of person paper facade.
 * @author ivanursul
 *
 */
@Facade("personPaperFacade")
public class DefaultPersonPaperFacade implements PersonPaperFacade {

	@Resource
	private PersonPaperService personPaperService;
}
