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
 *         &lt;element name="VakAcademicAttestationCaseGetResult" type="{http://edboservice.ua/}ArrayOfDVakAcademicAttestationCase" minOccurs="0"/>
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
    "vakAcademicAttestationCaseGetResult"
})
@XmlRootElement(name = "VakAcademicAttestationCaseGetResponse")
public class VakAcademicAttestationCaseGetResponse {

    @XmlElement(name = "VakAcademicAttestationCaseGetResult")
    protected ArrayOfDVakAcademicAttestationCase vakAcademicAttestationCaseGetResult;

    /**
     * Gets the value of the vakAcademicAttestationCaseGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDVakAcademicAttestationCase }
     *     
     */
    public ArrayOfDVakAcademicAttestationCase getVakAcademicAttestationCaseGetResult() {
        return vakAcademicAttestationCaseGetResult;
    }

    /**
     * Sets the value of the vakAcademicAttestationCaseGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDVakAcademicAttestationCase }
     *     
     */
    public void setVakAcademicAttestationCaseGetResult(ArrayOfDVakAcademicAttestationCase value) {
        this.vakAcademicAttestationCaseGetResult = value;
    }

}
