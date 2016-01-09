/*
 * Copyright 2016 Agorava
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

import org.agorava.xing.function.HasName;

/**
 * Award a user has won
 * 
 * @author Werner Keil
 *
 */
@SuppressWarnings("serial")
public class Award extends HasName {

    private String url;
    private int dateAwarded;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the dateAwarded property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getDateAwarded() {
        return dateAwarded;
    }

    /**
     * Sets the value of the dateAwarded property.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setDateAwarded(int value) {
        this.dateAwarded = value;
    }

}
