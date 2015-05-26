package org.lnu.is.converter.broadcasting;

import java.util.ArrayList;
import java.util.List;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.broadcasting.BroadcastingMessage;
import org.lnu.is.domain.group.Group;
import org.lnu.is.resource.broadcasting.BroadcastingMessageResource;

/**
 * Broadcasting Resource Converter.
 * @author ivanursul
 *
 */
@Converter("broadcastingResourceConverter")
public class BroadcastingResourceConverter extends AbstractConverter<BroadcastingMessageResource, BroadcastingMessage> {

	@Override
	public BroadcastingMessage convert(final BroadcastingMessageResource source, final BroadcastingMessage target) {
		
		target.setContent(source.getContent());
		target.setTopic(source.getTopic());
		target.setRecipients(source.getRecipients());
 		
		if (source.getGroups() != null) {
			List<Group> groups = convertGroups(source);
			target.setGroups(groups);
		}
		
		return target;
	}
	
	/**
	 * Method for converting list of groups.
	 * @param source
	 * @return groups.
	 */
	private List<Group> convertGroups(final BroadcastingMessageResource source) {
		List<Group> groups = new ArrayList<Group>();
		
		for (Long groupId: source.getGroups()) {
			Group group = new Group();
			group.setId(groupId);
			groups.add(group);
		}
		return groups;
	}

	@Override
	public BroadcastingMessage convert(final BroadcastingMessageResource source) {
		return convert(source, new BroadcastingMessage());
	}

}
