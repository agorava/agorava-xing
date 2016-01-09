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

import java.util.List;

/**
 * Model class representing a user's professional experience
 * @author Werner Keil
 */
public class ProfessionalExperience {

	private Company primaryCompany;
	private List<Company> nonPrimaryCompanies;
//	private List<Award> awards;

    /**
     * Gets the value of the primaryCompany property.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getPrimaryCompany() {
        return primaryCompany;
    }

    /**
     * Sets the value of the primaryCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setPrimaryCompany(Company value) {
        this.primaryCompany = value;
    }

    /**
     * Gets the value of the nonPrimaryCompanies property.
     * 
     * @return
     *     possible object is
     *     {@link List<Company> }
     *     
     */
    public List<Company> getNonPrimaryCompanies() {
        return nonPrimaryCompanies;
    }

    /**
     * Sets the value of the nonPrimaryCompanies property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<Company> }
     *     
     */
    public void setNonPrimaryCompanies(List<Company> value) {
        this.nonPrimaryCompanies = value;
    }

    /**
     * Gets the value of the awards property.
     * 
     * @return
     *     possible object is
     *     {@link List<Award> }
     *     
     */
//    public List<Award> getAwards() { FIXME try to add awards again (maybe type diff was only problem?)
//        return awards;
//    }

    /**
     * Sets the value of the awards property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<Award> }
     *     
     */
//    public void setAwards(List<Award> value) {
//        this.awards = value;
//    }

}
