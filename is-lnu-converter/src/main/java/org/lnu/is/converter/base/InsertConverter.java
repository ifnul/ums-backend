package org.lnu.is.converter.base;

import java.util.Date;

import javax.annotation.Resource;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.group.Group;
import org.lnu.is.domain.user.User;
import org.lnu.is.resource.ApiResource;
import org.lnu.is.security.service.SessionService;

/**
 * Class, that is used to make some convertation
 * when insert method (POST) is called.
 * @author ivanursul
 *
 * @param <S> resource type.
 * @param <T> class type.
 */
@Converter("insertConverter")
public class InsertConverter<S extends ApiResource, T extends InformationModel> extends AbstractConverter<S, T> {

	@Resource(name = "sessionService")
	private SessionService sessionService;
	
	@Override
	public T convert(final S source, final T target) {
		
		target.setCreateDate(new Date());
		target.setUpdateDate(new Date());

		target.setActual(1);
		target.setStatus(RowStatus.ACTIVE);

		User user = sessionService.getUser();
		target.setCrtUser(user.getLogin());

		// Adding default user group.
		Group group = sessionService.getDefaultGroup();
		target.setCrtUserGroup(group.getTitle());
		
		return target;
	}

	@Override
	public T convert(final S source) {
		throw new UnsupportedOperationException("Method not allowed");
	}

}
