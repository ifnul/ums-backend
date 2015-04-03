package org.lnu.is.service.person;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.person.entrant.PersonEntrant;
import org.lnu.is.domain.person.entrant.PersonEntrantAuto;
import org.springframework.stereotype.Service;

/**
 * Default implementation of Person Entrant Service.
 * @author ivanursul
 *
 */
@Service("personEntrantService")
public class DefaultPersonEntrantService implements PersonEntrantService {

	@Resource(name = "entrantDao")
	private Dao<PersonEntrant, Long> entrantDao;
	
	@Resource(name = "entrantAutoDao")
	private Dao<PersonEntrantAuto, Long> entrantAutoDao;
	
	@Override
	public PersonEntrant getEntrant(final Long id) {
		return entrantDao.getEntityById(id);
	}

	@Override
	public PersonEntrantAuto getEntrantAuto(final Long entrantId) {
		return entrantAutoDao.getEntityById(entrantId);
	}

}
