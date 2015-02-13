package org.lnu.is.extractor.person.work;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.work.PersonWork;
import org.lnu.is.domain.specstagetype.SpecStageType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Person work parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("personWorkParametersExtractor")
public class PersonWorkParametersExtractor extends AbstractParametersExtractor<PersonWork> {

	@Resource(name = "personDao")
	private Dao<Person, Long> personDao;
	
	@Resource(name = "jobTypeDao")
	private Dao<JobType, Long> jobTypeDao;
	
	@Resource(name = "specStageTypeDao")
	private Dao<SpecStageType, Long> specStageTypeDao;
	
	@Override
	public Map<String, Object> getParameters(final PersonWork entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getJobType(), jobTypeDao, "jobType", parameters);
		addParameter(entity.getSpecStageType(), specStageTypeDao, "specStageType", parameters);
		
		addParameter(entity.getOrganizationName(), "organizationName", parameters);
		addParameter(entity.getPostName(), "postName", parameters);
		addParameter(entity.getDescription(), "description", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		
		return parameters;
	}

}
