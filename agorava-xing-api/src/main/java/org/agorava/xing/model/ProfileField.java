/*
 * Copyright 2014 Agorava
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

package org.agorava.xing.model;

/**
 * Profile Field
 *
 * @author Werner Keil
 */
public enum ProfileField {
    ID, FIRST_NAME, LAST_NAME, DISPLAY_NAME, PAGE_NAME, EMPLOYMENT_STATUS, GENDER, BIRTH_DATE, ACTIVE_EMAIL,
    TIME_ZONE, PREMIUM_SERVICES, BADGES, WANTS, HAVES, INTERESTS, ORGANIZATION_MEMBER, LANGUAGES, 
    PRIVATE_ADDRESS, BUSINESS_ADDRESS, WEB_PROFILE, INSTANT_MESSAGING_ACCOUNTS, PROFESSIONAL_EXPERIENCE,
// TODO from xing.xml: educational_background    
    HEADLINE, LOCATION, INDUSTRY, DISTANCE, RELATION_TO_VIEWER, CURRENT_SHARE, CONNECTIONS,
    NUM_CONNECTIONS, NUM_CONNECTIONS_CAPPED, SUMMARY, SPECIALTIES, PROPOSAL_COMMENTS, ASSOCIATIONS, HONORS,
    POSITIONS, PUBLICATIONS, PATENTS, SKILLS, CERTIFICATIONS, EDUCATIONS, THREE_CURRENT_POSITIONS,
    THREE_PAST_POSITIONS, NUM_RECOMMENDERS, RECOMMENDATIONS_RECEIVED, PHONE_NUMBERS, TWITTER_ACCOUNTS,
    DATE_OF_BIRTH, MAIN_ADDRESS, MEMBER_URL_RESOURCES, PICTURE_URL, SITE_STANDARD_PROFILE_REQUEST_URL,
    API_PUBLIC_PROFILE_REQUEST_URL, SITE_PUBLIC_PROFILE_REQUEST_URL, API_STANDARD_PROFILE_REQUEST, PUBLIC_PROFILE_URL;

    @Override
    public String toString() {
        switch (this) {
            default:
                return this.name().toLowerCase(); //.replace('_', '-');
        }
    }

}
