package org.lnu.is.extractor.person.paper;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.honors.type.HonorType;
import org.lnu.is.domain.paper.type.PaperType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Person paper parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("personPaperParametersExtractor")
public class PersonPaperParametersExtractor extends AbstractParametersExtractor<PersonPaper> {

	@Resource(name = "personDao")
	private Dao<Person, Long> personDao;
	
	@Resource(name = "paperTypeDao")
	private Dao<PaperType, Long> paperTypeDao;
	
	@Resource(name = "honorsTypeDao")
	private Dao<HonorType, Long> honorTypeDao;
	
	@Override
	public Map<String, Object> getParameters(final PersonPaper entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getPaperType(), paperTypeDao, "paperType", parameters);
		addParameter(entity.getHonorsType(), honorTypeDao, "honorsType", parameters);
		
		addParameter(entity.getDocSeries(), "docSeries", parameters);
		addParameter(entity.getDocNum(), "docNum", parameters);
		addParameter(entity.getDocDate(), "docDate", parameters);
		addParameter(entity.getDocIssued(), "docIssued", parameters);
		addParameter(entity.getDocPin(), "docPin", parameters);
		addParameter(entity.getMark(), "mark", parameters);
		addParameter(entity.getIsChecked(), "isChecked", parameters);
		addParameter(entity.getIsForeign(), "isForeign", parameters);
		
		return parameters;
	}

}
