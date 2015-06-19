package org.lnu.is.extractor.enrolment.enrolment.subject;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.enrolment.subject.EnrolmentEnrolmentSubject;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.enrolment.subject.PersonEnrolmentSubject;
import org.lnu.is.extractor.AbstractParametersExtractor;
/**
 * Enrolment Enrolment Subject Parameters Extractor.
 * @author illay
 *
 */
@ParametersExtractor("enrolmentEnrolmentSubjectParametersExtractor")
public class EnrolmentEnrolmentSubjectParametersExtractor extends AbstractParametersExtractor<EnrolmentEnrolmentSubject> {

    @Resource(name = "enrolmentSubjectDao")
    private Dao<EnrolmentSubject, EnrolmentSubject, Long> enrolmentSubjectDao;
    
    @Resource(name = "enrolmentDao")
    private Dao<Enrolment, Enrolment, Long> enrolmentDao;
    
    @Resource(name = "personEnrolmentSubjectDao")
    private Dao<PersonEnrolmentSubject, PersonEnrolmentSubject, Long> persinEnrolmentSubjectDao;
    
    @Override
    protected Map<String, Object> getParameters(final EnrolmentEnrolmentSubject entity, final Map<String, Object> parameters) {
	
	addParameter(entity.getEnrolmentSubject(), enrolmentSubjectDao, "enrolmentSubject", parameters);
	addParameter(entity.getEnrolment(), enrolmentDao, "enrolment", parameters);
	addParameter(entity.getPersonEnrolmentSubject(), persinEnrolmentSubjectDao, "personEnrolmentSubject", parameters);
	
	addParameter(entity.getMark(), "mark", parameters);
	
	return parameters;
    }

}
