package org.lnu.is.web.rest.processor.api;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.domain.department.DepartmentType;
import org.lnu.is.web.rest.controller.department.DepartmentController;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

@RunWith(MockitoJUnitRunner.class)
public class WebServiceMethodCountBeanFactoryPostProcessorTest {

	@Mock
	private ConfigurableListableBeanFactory beanFactory;

	private WebServiceMethodCountBeanFactoryPostProcessor unit = new WebServiceMethodCountBeanFactoryPostProcessor();
	
	@Test
	public void testpostProcessBeanFactory() throws Exception {
		// Given
		String[] beanDefinitionNames = {"bean1", "bean2"};

		// When
		when(beanFactory.getBeanDefinitionNames()).thenReturn(beanDefinitionNames);
		
		when(beanFactory.getType("bean1")).thenAnswer(new Answer<Object>() {
            @Override
            public Object answer(final InvocationOnMock invocationOnMock) throws Throwable {
                return DepartmentController.class;
            }
        });

		when(beanFactory.getType("bean2")).thenAnswer(new Answer<Object>() {
			@Override
			public Object answer(final InvocationOnMock invocationOnMock) throws Throwable {
				return DepartmentType.class;
			}
		});
		
		unit.postProcessBeanFactory(beanFactory);

		// Then
		verify(beanFactory).getBeanDefinitionNames();
	}
	
	public static <T> Answer<T> createAnswer(final T value) {
	    Answer<T> dummy = new Answer<T>() {
	        @Override
	        public T answer(final InvocationOnMock invocation) throws Throwable {
	            return value;
	        }
	    };
	    return dummy;
	}
}
