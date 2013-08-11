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

package org.agorava.xing.model;

import java.util.Map;

/**
 * Model class representing a company
 * @author Werner Keil
 */
public class Company extends HasName {

	private String title;
	private String companySize;
	private String tag;
	private String url;
	private CareerLevel careerLevel;
	private String beginDate;
	private String description;
	private String endDate;
	private Industry industry;
	private Map<String, String> links;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompanySize() {
		return companySize;
	}

	public void setCompanySize(String companySize) {
		this.companySize = companySize;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public CareerLevel getCareerLevel() {
		return careerLevel;
	}

	public void setCareerLevel(CareerLevel careerLevel) {
		this.careerLevel = careerLevel;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Industry getIndustry() {
		return industry;
	}

	public void setIndustry(Industry industry) {
		this.industry = industry;
	}

	public Map<String, String> getLinks() {
		return links;
	}

	public void setLinks(Map<String, String> links) {
		this.links = links;
	}

	public static enum CareerLevel {
		STUDENT_INTERN, ENTRY_LEVEL, PROFESSIONAL_EXPERIENCED, MANAGER_SUPERVISOR, EXECUTIVE, SENIOR_EXECUTIVE
	}

	public static enum Industry {
		ACADEMIA, ACCOUNTING, AEROSPACE, AGRICULTURE, AIRLINES, ALTERNATIVE_MEDICINE, APPAREL_AND_FASHION, ARCHITECTURE_AND_PLANNING, ARTS_AND_CRAFTS, AUTOMOTIVE, BANKING, BIOTECHNOLOGY, BROADCAST_MEDIA, BUILDING_MATERIALS, BUSINESS_SUPPLIES_AND_EQUIPMENT, CHEMICALS, CIVIC_AND_SOCIAL_ORGANIZATIONS, CIVIL_ENGINEERING, CIVIL_SERVICE, COMPOSITES, COMPUTER_AND_NETWORK_SECURITY, COMPUTER_GAMES, COMPUTER_HARDWARE, COMPUTER_NETWORKING, COMPUTER_SOFTWARE, CONSTRUCTION, CONSULTING, CONSUMER_ELECTRONICS, CONSUMER_GOODS, CONSUMER_SERVICES, COSMETICS, DAYCARE, DEFENSE_MILITARY, DESIGN, EDUCATION, ELEARNING, ELECTRICAL_ENGINEERING, ENERGY, ENTERTAINMENT, ENVIRONMENTAL_SERVICES, EVENTS_SERVICES, FACILITIES_SERVICES, FACILITY_MANAGEMENT, FINANCIAL_SERVICES, FISHERY, FOOD, FUNDRAISING, FURNITURE, GARDENING_LANDSCAPING, GEOLOGY, GLASS_AND_CERAMICS, GRAPHIC_DESIGN, HEALTH_AND_FITNESS, HOSPITALITY, HUMAN_RESOURCES, IMPORT_AND_EXPORT, INDUSTRIAL_AUTOMATION, INFORMATION_SERVICES, INFORMATION_TECHNOLOGY_AND_SERVICES, INSURANCE, INTERNATIONAL_AFFAIRS, INTERNATIONAL_TRADE_AND_DEVELOPMENT, INTERNET, INVESTMENT_BANKING, JOURNALISM, LEGAL_SERVICES, LEISURE_TRAVEL_AND_TOURISM, LIBRARIES, LOGISTICS_AND_SUPPLY_CHAIN, LUXURY_GOODS_AND_JEWELRY, MACHINERY, MANAGEMENT_CONSULTING, MARITIME, MARKETING_AND_ADVERTISING, MARKET_RESEARCH, MECHANICAL_INDUSTRIAL_ENGINEERING, MEDIA_PRODUCTION, MEDICAL_DEVICES, MEDICAL_SERVICES, MEDICINAL_PRODUCTS, METAL_METALWORKING, METROLOGY_CONTROL_ENGINEERING, MINING_AND_METALS, MOTION_PICTURES, MUSEUMS_AND_CULTURAL_INSTITUTIONS, MUSIC, NANOTECHNOLOGY, NON_PROFIT_ORGANIZATION, NURSING_AND_PERSONAL_CARE, OIL_AND_ENERGY, ONLINE_MEDIA, OTHERS, OUTSOURCING_OFFSHORING, PACKAGING_AND_CONTAINERS, PAPER_AND_FOREST_PRODUCTS, PHOTOGRAPHY, PLASTICS, POLITICS, PRINTING, PRINT_MEDIA, PROCESS_MANAGEMENT, PROFESSIONAL_TRAINING_AND_COACHING, PSYCHOLOGY_PSYCHOTHERAPY, PUBLIC_HEALTH, PUBLIC_RELATIONS_AND_COMMUNICATIONS, PUBLISHING, RAILROAD, REAL_ESTATE, RECREATIONAL_FACILITIES_AND_SERVICES, RECYCLING_AND_WASTE_MANAGEMENT, RENEWABLES_AND_ENVIRONMENT, RESEARCH, RESTAURANTS_AND_FOOD_SERVICE, RETAIL, SECURITY_AND_INVESTIGATIONS, SEMICONDUCTORS, SHIPBUILDING, SPORTS, STAFFING_AND_RECRUITING, TAX_ACCOUNTANCY_AUDITING, TELECOMMUNICATION, TEXTILES, THEATER_STAGE_CINEMA, TIMBER, TRAFFIC_ENGINEERING, TRANSLATION_AND_LOCALIZATION, TRANSPORT, VENTURE_CAPITAL_AND_PRIVATE_EQUITY, VETERINARY, WELFARE_AND_COMMUNITY_HEALTH, WHOLESALE, WINE_AND_SPIRITS, WRITING_AND_EDITING, PHARMACEUTICALS
	}
}
