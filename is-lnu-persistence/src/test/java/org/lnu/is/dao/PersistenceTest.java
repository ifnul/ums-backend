package org.lnu.is.dao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.dao.Dao;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/persistence-context.xml"})
public class PersistenceTest {

	@Resource
	private ApplicationContext context;
	
	@Resource
	private List<Dao<?, ?>> daos;

	@Resource
	private List<QueryBuilder<?>> queryBuilders;
	
	@Test
	public void testAplicatioContext() throws Exception {
		assertNotNull(context);
	}
}
