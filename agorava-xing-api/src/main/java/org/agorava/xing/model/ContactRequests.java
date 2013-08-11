package org.agorava.xing.model;

import java.util.List;

/**
 * A contact list of contact requests
 * @author Werner Keil
 */
public class ContactRequests {

	private List<ContactRequest> contactRequests;

	public ContactRequests(List<ContactRequest> contactRequests) {
		this.contactRequests = contactRequests;
	}

	public List<ContactRequest> getContactRequests() {
		return contactRequests;
	}
}
