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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for slideshowFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="slideshowFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="pdf"/>
 *     &lt;enumeration value="ppt"/>
 *     &lt;enumeration value="pps"/>
 *     &lt;enumeration value="odp"/>
 *     &lt;enumeration value="doc"/>
 *     &lt;enumeration value="pot"/>
 *     &lt;enumeration value="txt"/>
 *     &lt;enumeration value="rdf"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlRootElement(name = "slideshowFormat", namespace="")
@XmlType(name = "slideshowFormat")
@XmlEnum
public enum SlideshowFormat {

    @XmlEnumValue("pdf")
    PDF("pdf"),
    @XmlEnumValue("ppt")
    PPT("ppt"),
    @XmlEnumValue("pps")
    PPS("pps"),
    @XmlEnumValue("odp")
    ODP("odp"),
    @XmlEnumValue("doc")
    DOC("doc"),
    @XmlEnumValue("pot")
    POT("pot"),
    @XmlEnumValue("txt")
    TXT("txt"),
    @XmlEnumValue("rdf")
    RDF("rdf");
    private final String value;

    SlideshowFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SlideshowFormat fromValue(String v) {
        for (SlideshowFormat c: SlideshowFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}