package org.lnu.is.extractor.person.contact;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.contact.type.ContactType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.contact.PersonContact;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Department Contact parameters parameters extractor.
 * 
 * @author illay
 *
 */
@ParametersExtractor("personContactParametersExtractor")
public class PersonContactParametersExtractor extends
	AbstractParametersExtractor<PersonContact> {

    @Resource(name = "personDao")
    private Dao<Person, Long> personDao;

    @Resource(name = "contactTypeDao")
    private Dao<ContactType, Long> contactTypeDao;

    @Override
    protected Map<String, Object> getParameters(final PersonContact entity,
	    final Map<String, Object> parameters) {
	addParameter(entity.getPerson(), personDao, "person", parameters);
	addParameter(entity.getContactType(), contactTypeDao, "contactType",
		parameters);
	addParameter(entity.getValue(), "value", parameters);

	return parameters;
    }

}
