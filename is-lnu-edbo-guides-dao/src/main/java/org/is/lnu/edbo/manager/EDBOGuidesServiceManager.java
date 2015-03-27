package org.is.lnu.edbo.manager;

import ua.edboservice.EDBOGuidesSoap;

/**
 * Service manager, that returns EDBOGuidesSoap Client.
 * @author ivanursul
 *
 */
public class EDBOGuidesServiceManager implements ServiceManager<EDBOGuidesSoap> {

	private EDBOGuidesSoap edboGuides;
	
	@Override
	public EDBOGuidesSoap getWebServiceClient() {
		return edboGuides;
	}

	public void setEdboGuides(final EDBOGuidesSoap edboGuides) {
		this.edboGuides = edboGuides;
	}

}
