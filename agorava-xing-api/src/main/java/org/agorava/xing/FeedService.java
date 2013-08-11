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

import org.agorava.xing.model.Comment;
import org.agorava.xing.model.Like;
import org.agorava.xing.model.NetworkFeed;

import java.util.List;

/**
 * Interface defining operations that can be performed on a XING Network Feed.
 *
 * @author Werner Keil
 */
public interface FeedService {

	/**
	 * Returns the stream of activities recently performed by the user's network.
	 * @param userId required. ID of the user whose contacts' activities are to 
	 * be returned
	 * @param aggregate optional. If set to true (default) similar activities may
	 * be combined into one. Set this to false if you don't want any aggregation 
	 * at all.
	 * @param since optional. Only returns activities that are newer than the 
	 * specified time stamp (ISO 8601). Can't be combined with until!
	 * @param until optional. Only returns activities that are older than the 
	 * specified time stamp (ISO 8601). Can't be combined with since!
	 */

	List<NetworkFeed> getNetworkFeed(String userId, Boolean aggregate, Long since, Long until);

	/**
	 * Retrieves recent activities for the authenticated user. These activities will not be aggregated. It's always possible to access a user's own feed, but a user might not be allowed to access another user's feed depending on their privacy settings.
	 * @param id required. ID of user whose feed is to be returned
	 * @param since optional. Only returns activities more recent than the specified 
	 * time stamp (ISO 8601). Can't be combined with until!
	 * @param until optional. Only returns activities that are older than the specified 
	 * time stamp (ISO 8601). Can't be combined with since!
	 */

	List<NetworkFeed> getFeed(String id, Long since, Long until);

	/**
	 * Returns a single activity. The response format is the same as the one in the 
	 * network or user feed, even though a single activity will never be aggregated.
	 * @param id required. Activity ID.
	 */

	NetworkFeed getActivity(String id);

	/**
	 * Sharing an activity means recommending it to your network. This will then 
	 * create a new activity for the current user. Only activities with SHARE in 
	 * the possibleActions field can be shared.
	 * @param id required. Activity ID.
	 * @param text optional. The text in the message accompanying the share. The 
	 * maximum field length is 140 characters.
	 */

	void shareActivity(String id, String text);

	/**
	 * Deletes the activity with the given ID. Users can only delete their own 
	 * activities, and only activities with DELETE in the possibleActions field 
	 * can be deleted.
	 * @param id required. Activity ID
	 */

	void deleteActivity(String id);

	/**
	 * Returns a list of comments added to the activity with the given activityId. 
	 * This list is sorted by the creation date of the comments.
	 * @param activityId required. Activity ID
	 * @param limit optional. Restricts the number of comments to be returned. 
	 * This must be a positive number. Default: 10
	 * @param offset optional. Offset. This must be a positive number. Default: 0
	 */

	List<Comment> getComments(String activityId, Long limit, Long offset);

	/**
	 * Creates a comment for a certain activity. Only activities with COMMENT in the 
	 * possibleActions field can be commented on.
	 * @param activityId required 	Activity ID
	 * @param text required. Maximum comment text length: 600 characters
	 */

	void addComment(String activityId, String text);

	/**
	 * Deletes a comment for a certain activity. Users can only delete 
	 * their own comments or comments for activities they own.
	 * @param activityId required 	Activity ID
	 * @param id required. Comment ID
	 */

	void deleteComment(String activityId, String id);

	/**
	 * Returns a list of users who liked a certain activity.
	 * @param activityId required. Activity ID
	 * @param limit optional. Limits the number of likes to be returned.
	 * Must be a positive number. Default: 10
	 * @param offset optional. Offset. Must be a positive number. Default: 0
	 */

	List<Like> getLikes(String activityId, Long limit, Long offset);

	/**
	 * Adds the current user to the list of likes for the given activity. It's only 
	 * possible to like activities which have LIKE in the possibleActions field.
	 * @param activityId required. Activity ID
	 */

	void likeActivity(String activityId);

	/**
	 * Removes a like the current user already added to the given activity. It's only 
	 * possible to like activities which have LIKE in the possibleActions field.
	 * @param activityId required. Activity ID
	 */

	void unlikeActivity(String activityId);
}
