/*
 * Copyright 2013 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.agorava.xing;

import org.agorava.xing.model.ContactPaths;
import org.agorava.xing.model.ContactRequests;
import org.agorava.xing.model.Contacts;
import org.agorava.xing.model.Tags;

/**
 * Interface defining operations that can be performed on XING Contacts.
 *
 * @author Werner Keil
 */
public interface ContactService {

	/**
	 * Returns the requested user's contacts. The nested user data this call returns are 
	 * the same as the get user details call. You can't request more than 100 contacts at 
	 * once (see limit parameter), but you can perform several requests in parallel. If 
	 * you execute this call with limit=0, it will tell you how many contacts the user
	 * has without returning any user data.
	 * If the current user doesn't have access to the requested user's contacts, the 
	 * value for the user's key will be null (not an empty list!).
	 * By default this call can only access the contacts of your direct contacts, i.e. 
	 * second-level contacts. If you need further access, please get in touch with us.
	 * @param userId required. ID of the user whose contacts are to be returned
	 * @param limit optional. Limits the number of contacts to be returned. Must be zero 
	 * or a positive number. Default: 10, Maximum: 100
	 * @param offset optional. Offset. Must be zero or a positive number. Default: 0
	 * @param orderBy optional. Field that determines the ascending order of the returned 
	 * list. Currently only supports "last_name". Defaults to "id"
	 */
	Contacts getContacts(String userId, Integer limit, Integer offset);

	/**
	 * Retrieve all tags the user has assigned to a contact.
	 * @param contactId required. ID of the users contact.
	 * @param userId required. ID of the user who assigned the tags.
	 */
	Tags retriveAssignedTags(String contactId, String userId);

	/**
	 * Returns the list of contacts who are direct contacts of both the given and the 
	 * current user. The nested user data this call returns are the same as the get user 
	 * details call. You can't request more than 100 shared contacts at once (see limit 
	 * parameter), but you can perform several requests in parallel. If you execute this 
	 * call with limit=0, it will tell you how many contacts the user has without returning 
	 * any user data.
	 * If the current user doesn't have access to the requested user's contacts, he isn't
	 * allowed to see how many contacts he has in common with the requested user. In 
	 * contrast to the get contacts call, this call will fail and return a 403 message 
	 * instead.
	 * @param userId required. ID of user whose contacts to return
	 * @param limit optional. Limits the number of contacts to be returned. Must be zero 
	 * or a positive number. Default: 10, Maximum: 100
	 * @param offset optional. Offset. Must be zero or a positive number. Default: 0
	 * @param orderBy optional. Field that determines the ascending order of the returned 
	 * list. Currently only supports "last_name". Defaults to "id"
	 */
	Contacts getSharedContacts(String userId, Integer limit, Integer offset, String orderBy);
	
	/**
	 * Get the shortest contact path(s) between a user and any other XING user.
	 * @param otherUserId required. ID of any other XING user
	 * @param userId required. ID of the user whose bookmarks are to be returned
	 * @param allPaths optional. Specifies whether this call returns just one 
	 * contact path (default) or all contact paths. Possible values are true or 
	 * false. Default: false
	 */
	ContactPaths getContactPath(String otherUserId, String userId, Boolean allPaths);
	
	/**
	 * Lists all pending incoming contact requests the specified user 
	 * has received from other users.
	 * @param userId required. ID of the user whose incoming contact requests are to be returned
	 * @param limit optional. Restricts the number of contact requests to be returned. This must be a positive number. Default: 10
	 * @param offset optional. Offset. This must be a positive number. Default: 0
	 * @param userFields optional. List of user attributes to return. If this parameter is not used, only the ID will be returned. For a list of available profile fields, please refer to the example response below. All top-level attributes (e.g. id, page_name, photo_urls,...) are valid fields. It is also possible to get an even more detailed response, e.g photo_urls.medium or professional_experience.primary_company.name
	 */
	ContactRequests getContactRequests(String userId, Integer limit, Integer offset);

	/**
	 * Lists all pending contact requests the specified user has sent.
	 * @param userId required. ID of the user whose sent contact requests are to be returned
	 * @param limit optional. Restricts the number of contact requests to be returned. 
	 * This must be a positive number. Default: 10
	 * @param offset optional. Offset. This must be a positive number. Default: 0
	 */
	ContactRequests getSentContactRequests(String userId, Integer limit, Integer offset);

	/**
	 * Initiates a contact request between the current user (sender) and the specified user (recipient).
	 * @param userId required. ID of the user receiving the contact request
	 * @param message optional. Message attached to the contact request
	 */
	void initiateContactRequest(String userId, String message);

	/**
	 * Accepts an incoming contact request.
	 * @param id required Sender ID
	 * @param userId required. Recipient ID
	 */
	void acceptContactRequest(String id, String userId);

	/**
	 * Denies an incoming contact request or revokes an initiated contact request.
	 * @param id required. Sender ID
	 * @param user_id required. Recipient ID
	 */
	void revokeOrDenyContactRequest(String id, String userId);
}
