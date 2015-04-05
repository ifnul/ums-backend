package org.lnu.is.extractor.person.enrolment.subject;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.enrolment.subject.PersonEnrolmentSubject;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Person Enrolment Subject Parameters Extractor.
 * 
 * @author kushnir
 *
 */

@ParametersExtractor("personEnrolmentSubjectParametersExtractor")
public class PersonEnrolmentSubjectParametersExtractor extends AbstractParametersExtractor<PersonEnrolmentSubject> {

	@Resource(name = "personDao")
	private Dao<Person, Long> personDao;

	@Resource(name = "personPaperDao")
	private Dao<PersonPaper, Long> personPaperDao;

	@Resource(name = "enrolmentSubjectDao")
	private Dao<EnrolmentSubject, Long> enrolmentSubjectDao;

	@Override
	protected Map<String, Object> getParameters(final PersonEnrolmentSubject entity, final Map<String, Object> parameters) {
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getPersonPaper(), personPaperDao, "personPaper", parameters);
		addParameter(entity.getEnrolmentSubject(), enrolmentSubjectDao, "enrolmentSubject", parameters);
		addParameter(entity.getMark(), "mark", parameters);

		return parameters;
	}

}
