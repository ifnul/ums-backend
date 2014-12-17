package org.lnu.is.integration

import org.lnu.is.integration.asset.types.AssetTypeIntegrationTest
import org.lnu.is.integration.department.types.DepartmentTypeIntegrationTest
import org.lnu.is.integration.enrolment.statustype.EnrolmentStatusTypeIntegrationTest
import org.lnu.is.integration.enrolment.subject.EnrolmentSubjectIntegrationTest
import org.lnu.is.integration.enrolment.types.EnrolmentTypeIntegrationTest
import org.lnu.is.integration.gendertype.GenderTypeIntegrationTest
import org.lnu.is.integration.language.LanguageIntegrationTest
import org.lnu.is.integration.operation.types.OperationTypeIntegrationTest
import org.lnu.is.integration.order.types.OrderTypeIntegrationTest
import org.lnu.is.integration.partner.PartnerIntegrationTest
import org.lnu.is.integration.person.name.PersonNameIntegrationTest
import org.lnu.is.integration.person.types.PersonTypeIntegrationTest
import org.lnu.is.integration.reasons.ReasonIntegrationTest
import org.lnu.is.integration.specialty.types.SpecialtyTypeIntegrationTest
import org.lnu.is.integration.timeperiod.TimePeriodIntegrationTest
import org.lnu.is.integration.timeperiod.types.TimePeriodTypeIntegrationTest
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef.atOnceUsers
import io.gatling.core.Predef.stringToExpression
import io.gatling.http.Predef.http
import io.gatling.http.config.HttpProtocolBuilder.toHttpProtocol
import org.lnu.is.integration.asset.state.AssetStateIntegrationTest
import org.lnu.is.integration.asset.status.AssetStatusIntegrationTest
import org.lnu.is.integration.specialty.SpecialtyIntegrationTest

class IntegrationTest extends Simulation {

	val httpConf = http
			.baseURL("http://localhost:8080/is-lnu-rest-api/api")
			.acceptHeader("application/json")
	
	val injectStep = atOnceUsers(1);
	
	setUp(
		AssetTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		AssetStatusIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		AssetStateIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		PersonIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		PersonNameIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		PersonTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		EduFormTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		AddressTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		EnrolmentStatusTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		EnrolmentTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		EnrolmentSubjectIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		DepartmentTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		GenderTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		LanguageIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		OrderTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		TimePeriodIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		TimePeriodTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		PartnerIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		SpecialtyTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		ReasonIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		OperationTypeIntegrationTest.scn.inject(injectStep).protocols(httpConf),
		SpecialtyIntegrationTest.scn.inject(injectStep).protocols(httpConf)
	)
}
