package org.is.lnu.edbo.manager;

import org.is.lnu.edbo.exception.DisabledEDBOException;
import org.junit.Test;

public class DisabledServiceManagerTest {

	private DisabledServiceManager<Integer> unit = new DisabledServiceManager<>();
	
	
	@Test(expected = DisabledEDBOException.class)
	public void testGetWebServiceClient() throws Exception {
		unit.getWebServiceClient();
	}
}
