package org.lnu.is.populator.edbo.person;

import java.util.ArrayList;
import java.util.List;

import org.is.lnu.edbo.resource.person.EdboPersonResource;
import org.lnu.is.converter.Converter;
import org.springframework.stereotype.Component;

import ua.edboservice.ArrayOfDPersonsFind;
import ua.edboservice.DPersonsFind;

/**
 * Converter for converting ArrayOfDPersonsFind, which
 * is from EDBO web service into EdboPersonResource,
 * which is our class.
 * @author ivanursul
 *
 */
@Component("arrayOfDPersonFindResourceConverter")
public class ArrayOfDPersonFindResourceConverter implements Converter<ArrayOfDPersonsFind, List<EdboPersonResource>> {

	@Override
	public List<EdboPersonResource> convert(final ArrayOfDPersonsFind source, final List<EdboPersonResource> target) {
		
		for (DPersonsFind personFind : source.getDPersonsFind()) {
			EdboPersonResource resource = convert(personFind);
			target.add(resource);
		}
		
		return target;
	}

	/**
	 * Method for converting.
	 * @param source
	 * @return EdboPersonResource.
	 */
	private EdboPersonResource convert(final DPersonsFind source) {
		EdboPersonResource resource = new EdboPersonResource();
		
		resource.setAtestatDate(source.getAtestatDate());
		resource.setAtestatNumber(source.getAtestatNumber());
		resource.setAtestatSeries(source.getAtestatSeries());
		resource.setBirthday(source.getBirthday());
		resource.setBirthplace(source.getBirthplace());
		resource.setFather(source.getFather());
		resource.setFatherPhones(source.getFatherPhones());
		resource.setFio(source.getFIO());
		resource.setFirstName(source.getFirstName());
		resource.setIdLanguage(source.getIdLanguage());
		resource.setIdPerson(source.getIdPerson());
		resource.setIdPersonDocumentAtestat(source.getIdPersonDocumentAtestat());
		resource.setIdPersonDocumentPasp(source.getIdPersonDocumentPasp());
		resource.setIdPersonName(source.getIdPersonName());
		resource.setIdPersonSex(source.getIdPersonSex());
		resource.setIdPersonTypeDict(source.getIdPersonTypeDict());
		resource.setLanguagesAreStudied(source.getLanguagesAreStudied());
		resource.setLastName(source.getLastName());
		resource.setMiddleName(source.getMiddleName());
		resource.setMother(source.getMother());
		resource.setMotherPhones(source.getMotherPhones());
		resource.setPasportDate(source.getPasportDate());
		resource.setPasportIssued(source.getPasportIssued());
		resource.setPasportNumber(source.getPasportNumber());
		resource.setPasportSeries(source.getPasportSeries());
		resource.setPersonCodeU(source.getPersonCodeU());
		resource.setPersonNameDateBegin(source.getPersonNameDateBegin());
		resource.setPersonNameDateEnd(source.getPersonNameDateEnd());
		resource.setPersonSexName(source.getPersonSexName());
		resource.setPersonTypeName(source.getPersonTypeName());
		resource.setResident(source.getResident());
		
		return resource;
	}

	@Override
	public List<EdboPersonResource> convert(final ArrayOfDPersonsFind source) {
		return convert(source, new ArrayList<EdboPersonResource>());
	}

	@Override
	public List<List<EdboPersonResource>> convertAll(final List<ArrayOfDPersonsFind> sources) {
		throw new IllegalArgumentException("Method not supported");
	}

	@Override
	public List<List<EdboPersonResource>> convertAll(final List<ArrayOfDPersonsFind> sources, final List<List<EdboPersonResource>> targets) {
		throw new IllegalArgumentException("Method not supported");
	}

}
