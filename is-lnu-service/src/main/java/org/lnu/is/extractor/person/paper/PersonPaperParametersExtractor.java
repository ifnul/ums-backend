package org.lnu.is.extractor.person.paper;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.honors.type.HonorsTypeDao;
import org.lnu.is.dao.dao.person.PersonDao;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.lnu.is.extractor.paper.type.PaperTypeDao;
import org.springframework.stereotype.Component;

/**
 * TODO: IU - Write tests for all parameter extractors.
 * Person paper parameters extractor.
 * @author ivanursul
 *
 */
@Component("personPaperParametersExtractor")
public class PersonPaperParametersExtractor extends AbstractParametersExtractor<PersonPaper> {

	@Resource(name = "personDao")
	private PersonDao personDao;
	
	@Resource(name = "paperTypeDao")
	private PaperTypeDao paperTypeDao;
	
	@Resource(name = "honorsTypeDao")
	private HonorsTypeDao honortTypeDao;
	
	@Override
	public Map<String, Object> getParameters(final PersonPaper entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getPaperType(), paperTypeDao, "paperType", parameters);
		addParameter(entity.getHonorsType(), honortTypeDao, "honorsType", parameters);
		
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
