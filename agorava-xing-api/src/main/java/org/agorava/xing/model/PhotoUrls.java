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

/**
 * A user's Photo URLs
 * 
 * @author Werner Keil
 *
 */
public class PhotoUrls {
    private String large;
    protected String maxiThumb;
    protected String mediumThumb;
    protected String miniThumb;
    protected String thumb;

    /**
     * Gets the value of the large property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLarge() {
        return large;
    }

    /**
     * Sets the value of the large property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLarge(String value) {
        this.large = value;
    }

    /**
     * Gets the value of the maxiThumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxiThumb() {
        return maxiThumb;
    }

    /**
     * Sets the value of the maxiThumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxiThumb(String value) {
        this.maxiThumb = value;
    }

    /**
     * Gets the value of the mediumThumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediumThumb() {
        return mediumThumb;
    }

    /**
     * Sets the value of the mediumThumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediumThumb(String value) {
        this.mediumThumb = value;
    }

    /**
     * Gets the value of the miniThumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiniThumb() {
        return miniThumb;
    }

    /**
     * Sets the value of the miniThumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiniThumb(String value) {
        this.miniThumb = value;
    }

    /**
     * Gets the value of the thumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * Sets the value of the thumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumb(String value) {
        this.thumb = value;
    }

}
