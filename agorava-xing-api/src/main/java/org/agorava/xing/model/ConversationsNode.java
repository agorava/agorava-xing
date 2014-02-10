package org.agorava.xing.model;

import java.io.Serializable;

/**
 * Model class containing conversations.
 *
 * @author Tomasz Wojtowicz
 */
public class ConversationsNode implements Serializable {

	private static final long serialVersionUID = -1199849108834415833L;
	private Conversations conversations;

	public ConversationsNode(Conversations conversations) {
		this.conversations = conversations;
	}

	public Conversations getConversations() {
		return conversations;
	}
}
