/*
 * Copyright 2010 Rajendra Patil
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.10.21 at 04:29:20 AM GMT+05:30 
//


package com.googlecode.slideshare4j.api.response.generated;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumPosts" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NumSlideshows" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NumMembers" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="QueryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Group", namespace="")
@XmlType(name = "Group", propOrder = {
    "name",
    "numPosts",
    "numSlideshows",
    "numMembers",
    "created",
    "queryName",
    "url"
})
public class Group {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "NumPosts")
    protected long numPosts;
    @XmlElement(name = "NumSlideshows")
    protected long numSlideshows;
    @XmlElement(name = "NumMembers")
    protected long numMembers;
    @XmlElement(name = "Created", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected Date created;
    @XmlElement(name = "QueryName", required = true)
    protected String queryName;
    @XmlElement(name = "URL", required = true)
    protected String url;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the numPosts property.
     * 
     */
    public long getNumPosts() {
        return numPosts;
    }

    /**
     * Sets the value of the numPosts property.
     * 
     */
    public void setNumPosts(long value) {
        this.numPosts = value;
    }

    /**
     * Gets the value of the numSlideshows property.
     * 
     */
    public long getNumSlideshows() {
        return numSlideshows;
    }

    /**
     * Sets the value of the numSlideshows property.
     * 
     */
    public void setNumSlideshows(long value) {
        this.numSlideshows = value;
    }

    /**
     * Gets the value of the numMembers property.
     * 
     */
    public long getNumMembers() {
        return numMembers;
    }

    /**
     * Sets the value of the numMembers property.
     * 
     */
    public void setNumMembers(long value) {
        this.numMembers = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(Date value) {
        this.created = value;
    }

    /**
     * Gets the value of the queryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryName() {
        return queryName;
    }

    /**
     * Sets the value of the queryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryName(String value) {
        this.queryName = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
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
    public void setURL(String value) {
        this.url = value;
    }

}