package org.is.lnu.edbo.manager;

import ua.edboservice.EDBOPersonSoap;


/**
 * Service manager, that returns EDBOPersonSoap Client.
 * @author ivanursul
 *
 */
public class EDBOPersonServiceManager implements ServiceManager<EDBOPersonSoap> {

	private EDBOPersonSoap edboPerson;
	
	@Override
	public EDBOPersonSoap getWebServiceClient() {
		return edboPerson;
	}

	public void setEdboPerson(final EDBOPersonSoap edboPerson) {
		this.edboPerson = edboPerson;
	}

}
