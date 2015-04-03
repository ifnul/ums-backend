package org.lnu.is.converter.person.entrant;

import java.math.BigDecimal;
import java.util.List;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.Person;

import ua.edboservice.ArrayOfDPersonAddRet;
import ua.edboservice.DPersonAddRet;

/**
 * Entrant Person Converter.
 * This converter converts only single 
 * @author ivanursul
 *
 */
@Converter("entrantPersonConverter")
public class EntrantPersonConverter extends AbstractConverter<ArrayOfDPersonAddRet, Person> {

	@Override
	public Person convert(final ArrayOfDPersonAddRet source, final Person target) {
		
		List<DPersonAddRet> persons = source.getDPersonAddRet();
		DPersonAddRet person = persons.get(BigDecimal.ZERO.intValue());
	
		target.setUid(Long.valueOf(person.getIdPerson()));
		target.setUtid(person.getPersonCodeU());
		
		return target;
	}

	@Override
	public Person convert(final ArrayOfDPersonAddRet source) {
		throw new UnsupportedOperationException("Method not allowed");
	}

}
