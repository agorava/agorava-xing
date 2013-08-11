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
 * Model class representing a user's education
 * @author Werner Keil
 */
public class EducationalBackground {

	private List<School> schools;
	private List<String> qualifications;

    /**
     * Gets the value of the qualifications property.
     * 
     * @return
     *     possible object is
     *     {@link List<String> }
     *     
     */
    public List<String> getQualifications() {
        return qualifications;
    }

    /**
     * Sets the value of the qualifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<String> }
     *     
     */
    public void setQualifications(List<String> value) {
        this.qualifications = value;
    }

    /**
     * Gets the value of the schools property.
     * 
     * @return
     *     possible object is
     *     {@link List<School> }
     *     
     */
    public List<School> getSchools() {
        return schools;
    }

    /**
     * Sets the value of the schools property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<School> }
     *     
     */
    public void setSchools(List<School> value) {
        this.schools = value;
    }

}
