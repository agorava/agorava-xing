/*
 * Copyright 2013 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.agorava.xing.jackson;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.module.SimpleModule;
import org.agorava.xing.model.Actor;
import org.agorava.xing.model.Award;
import org.agorava.xing.model.BirthDate;
import org.agorava.xing.model.BusinessAddress;
import org.agorava.xing.model.Comment;
import org.agorava.xing.model.CommentsNode;
import org.agorava.xing.model.Company;
import org.agorava.xing.model.ContactPaths;
import org.agorava.xing.model.ContactPathsNode;
import org.agorava.xing.model.ContactRequest;
import org.agorava.xing.model.ContactRequests;
import org.agorava.xing.model.Contacts;
import org.agorava.xing.model.ContactsNode;
import org.agorava.xing.model.Conversation;
import org.agorava.xing.model.ConversationNode;
import org.agorava.xing.model.Conversations;
import org.agorava.xing.model.ConversationsNode;
import org.agorava.xing.model.EducationalBackground;
import org.agorava.xing.model.FeedObject;
import org.agorava.xing.model.GeoCode;
import org.agorava.xing.model.Group;
import org.agorava.xing.model.Job;
import org.agorava.xing.model.JobNode;
import org.agorava.xing.model.Jobs;
import org.agorava.xing.model.JobsNode;
import org.agorava.xing.model.Like;
import org.agorava.xing.model.LikesNode;
import org.agorava.xing.model.Message;
import org.agorava.xing.model.MessageNode;
import org.agorava.xing.model.Messages;
import org.agorava.xing.model.MessagesNode;
import org.agorava.xing.model.MetaComment;
import org.agorava.xing.model.MetaLike;
import org.agorava.xing.model.NearbyItems;
import org.agorava.xing.model.NearbyItemsNode;
import org.agorava.xing.model.NearbyUsers;
import org.agorava.xing.model.NetworkActivitiesNode;
import org.agorava.xing.model.NetworkFeed;
import org.agorava.xing.model.Users;
import org.agorava.xing.model.PhotoUrls;
import org.agorava.xing.model.PrivateAddress;
import org.agorava.xing.model.ProfessionalExperience;
import org.agorava.xing.model.Recommendation;
import org.agorava.xing.model.Recommendations;
import org.agorava.xing.model.RecommendationsNode;
import org.agorava.xing.model.School;
import org.agorava.xing.model.SharedContactsNode;
import org.agorava.xing.model.TimeZone;
import org.agorava.xing.model.User;
import org.agorava.xing.model.Visit;
import org.agorava.xing.model.Visits;
import org.agorava.xing.model.XingProfile;
import org.agorava.xing.model.XingProfiles;

import com.twentyzen.webzunder.server.share.model.foursquare.Location;

/**
 * Jackson module for registering mixin annotations against Xing model classes.
 */
public class XingModule extends SimpleModule {

	public XingModule() {
		super("XingModule", new Version(1, 0, 0, null));
	}

	@Override
	public void setupModule(SetupContext context) {
		context.setMixInAnnotations(XingProfile.class, XingProfileMixin.class);
		context.setMixInAnnotations(XingProfiles.class, XingProfilesMixin.class);
		context.setMixInAnnotations(BirthDate.class, BirthDateMixin.class);
		context.setMixInAnnotations(PhotoUrls.class, PhotoUrlsMixin.class);
		context.setMixInAnnotations(BusinessAddress.class, BusinessAddressMixin.class);
		context.setMixInAnnotations(Award.class, AwardMixin.class);
		context.setMixInAnnotations(Company.class, CompanyMixin.class);
		context.setMixInAnnotations(Conversation.class, ConversationMixin.class);
		context.setMixInAnnotations(ConversationNode.class, ConversationNodeMixin.class);
		context.setMixInAnnotations(Conversations.class, ConversationsMixin.class);
		context.setMixInAnnotations(ConversationsNode.class, ConversationsNodeMixin.class);
		context.setMixInAnnotations(Message.class, MessageMixin.class);
		context.setMixInAnnotations(MessageNode.class, MessageNodeMixin.class);
		context.setMixInAnnotations(Messages.class, MessagesMixin.class);
		context.setMixInAnnotations(MessagesNode.class, MessagesNodeMixin.class);
		context.setMixInAnnotations(EducationalBackground.class, EducationalBackgroundMixin.class);
		context.setMixInAnnotations(PrivateAddress.class, PrivateAddressMixin.class);
		context.setMixInAnnotations(ProfessionalExperience.class, ProfessionalExperienceMixin.class);
		context.setMixInAnnotations(School.class, SchoolMixin.class);
		context.setMixInAnnotations(TimeZone.class, TimeZoneMixin.class);
		context.setMixInAnnotations(User.class, UserMixin.class);

		context.setMixInAnnotations(Job.class, JobMixin.class);
		context.setMixInAnnotations(JobNode.class, JobNodeMixin.class);
		context.setMixInAnnotations(Jobs.class, JobsMixin.class);
		context.setMixInAnnotations(JobsNode.class, JobsNodeMixin.class);
		context.setMixInAnnotations(GeoCode.class, GeoCodeMixin.class);
		context.setMixInAnnotations(Location.class, LocationMixin.class);

		context.setMixInAnnotations(Contacts.class, ContactsMixin.class);
		context.setMixInAnnotations(ContactsNode.class, ContactsNodeMixin.class);
		context.setMixInAnnotations(SharedContactsNode.class, SharedContactsNodeMixin.class);

		context.setMixInAnnotations(ContactRequest.class, ContactRequestMixin.class);
		context.setMixInAnnotations(ContactRequests.class, ContactRequestsMixin.class);

		context.setMixInAnnotations(Users.class, UsersMixin.class);
		context.setMixInAnnotations(ContactPaths.class, ContactPathsMixin.class);
		context.setMixInAnnotations(ContactPathsNode.class, ContactPathsNodeMixin.class);

		context.setMixInAnnotations(NetworkActivitiesNode.class, NetworkActivitiesNodeMixin.class);
		context.setMixInAnnotations(NetworkFeed.class, NetworkFeedMixin.class);
		context.setMixInAnnotations(MetaComment.class, MetaCommentMixin.class);
		context.setMixInAnnotations(MetaLike.class, MetaLikeMixin.class);
		context.setMixInAnnotations(Actor.class, ActorMixin.class);
		context.setMixInAnnotations(Group.class, GroupMixin.class);
		context.setMixInAnnotations(FeedObject.class, FeedObjectMixin.class);
		context.setMixInAnnotations(Comment.class, CommentMixin.class);
		context.setMixInAnnotations(CommentsNode.class, CommentsMixin.class);
		context.setMixInAnnotations(Like.class, LikeMixin.class);
		context.setMixInAnnotations(LikesNode.class, LikesNodeMixin.class);
		context.setMixInAnnotations(Visit.class, VisitMixin.class);
		context.setMixInAnnotations(Visits.class, VisitsMixin.class);
		context.setMixInAnnotations(Recommendation.class, RecommendationMixin.class);
		context.setMixInAnnotations(Recommendations.class, RecommendationsMixin.class);
		context.setMixInAnnotations(RecommendationsNode.class, RecommendationsNodeMixin.class);
		context.setMixInAnnotations(NearbyUsers.class, NearbyUsersMixin.class);
		context.setMixInAnnotations(NearbyItems.class, NearbyItems.class);
		context.setMixInAnnotations(NearbyItemsNode.class, NearbyItemsNode.class);
	}
}
