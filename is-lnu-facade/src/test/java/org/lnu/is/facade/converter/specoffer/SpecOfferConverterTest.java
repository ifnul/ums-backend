package org.lnu.is.facade.converter.specoffer;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffertype.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.facade.resource.specoffer.SpecOfferResource;

public class SpecOfferConverterTest {

	private SpecOfferConverter unit = new SpecOfferConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Integer actualRow = 1;
		Date createDate = new Date();
		Date begDate = new Date();
		String crtUser = "user";
		String crtUserGroup = "user group";
		Department department = new Department();
		Long departmentId = 1L;
		department.setId(departmentId);
		String docNum = "doc num";
		String docSeries = "doc series";
		Date endDate = new Date();
		
		Long eduFormTypeId = 2L;
		EduFormType eduFormType = new EduFormType();
		eduFormType.setId(eduFormTypeId);

		Long id = 1L;
		Integer licCount = 223;
		String note = "soem notes";

		Long parentId = 45L;
		SpecOffer parent = new SpecOffer();
		parent.setId(parentId);
		
		Long specialtyId = 4L;
		Specialty specialty = new Specialty();
		specialty.setId(specialtyId);

		Long specOfferTypeId = 5L;
		SpecOfferType specOfferType = new SpecOfferType();
		specOfferType.setId(specOfferTypeId);
		
		Integer stateCount = 34;
		RowStatus status = RowStatus.ACTIVE;
		String uapp = "uap";
		Long uid = 124L;
		
		Long timePeriodId = 5L;
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setId(timePeriodId);
		
		Date updateDate = new Date();
		String utid = "utid";
		
		SpecOffer source = new SpecOffer();
		source.setActual(actualRow);
		source.setBegDate(begDate);
		source.setCreateDate(createDate);
		source.setCrtUser(crtUser);
		source.setCrtUserGroup(crtUserGroup);
		source.setDepartment(department);
		source.setDocNum(docNum);
		source.setDocSeries(docSeries);
		source.setEduFormType(eduFormType);
		source.setEndDate(endDate);
		source.setId(id);
		source.setLicCount(licCount);
		source.setNote(note);
		source.setParent(parent);
		source.setSpecialty(specialty);
		source.setSpecOfferType(specOfferType);
		source.setStateCount(stateCount);
		source.setStatus(status);
		source.setTimePeriod(timePeriod);
		source.setUapp(uapp);
		source.setUid(uid);
		source.setUpdateDate(updateDate);
		source.setUtid(utid);

		SpecOfferResource expected = new SpecOfferResource();
		expected.setBegDate(begDate);
		expected.setDepartmentId(departmentId);
		expected.setDocNum(docNum);
		expected.setDocSeries(docSeries);
		expected.setEduFormTypeId(eduFormTypeId);
		expected.setEndDate(endDate);
		expected.setId(id);
		expected.setLicCount(licCount);
		expected.setNote(note);
		expected.setSpecialtyId(specialtyId);
		expected.setSpecofferTypeId(specOfferTypeId);
		expected.setStateCount(stateCount);
		expected.setTimePeriodId(timePeriodId);
		
		// When
		SpecOfferResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
