//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.27 at 12:51:32 AM EET 
//


package org.is.lnu.edebo.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniversitiesHistoryGetResult" type="{http://edboservice.ua/}ArrayOfDUniversitiesHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "universitiesHistoryGetResult"
})
@XmlRootElement(name = "UniversitiesHistoryGetResponse")
public class UniversitiesHistoryGetResponse {

    @XmlElement(name = "UniversitiesHistoryGetResult")
    protected ArrayOfDUniversitiesHistory universitiesHistoryGetResult;

    /**
     * Gets the value of the universitiesHistoryGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversitiesHistory }
     *     
     */
    public ArrayOfDUniversitiesHistory getUniversitiesHistoryGetResult() {
        return universitiesHistoryGetResult;
    }

    /**
     * Sets the value of the universitiesHistoryGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversitiesHistory }
     *     
     */
    public void setUniversitiesHistoryGetResult(ArrayOfDUniversitiesHistory value) {
        this.universitiesHistoryGetResult = value;
    }

}
