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
 *         &lt;element name="OrderOfDocumentsGroupsAddResult" type="{http://edboservice.ua/}ArrayOfDOrderOfDocumentsGroupsAddRet" minOccurs="0"/>
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
    "orderOfDocumentsGroupsAddResult"
})
@XmlRootElement(name = "OrderOfDocumentsGroupsAddResponse")
public class OrderOfDocumentsGroupsAddResponse {

    @XmlElement(name = "OrderOfDocumentsGroupsAddResult")
    protected ArrayOfDOrderOfDocumentsGroupsAddRet orderOfDocumentsGroupsAddResult;

    /**
     * Gets the value of the orderOfDocumentsGroupsAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOrderOfDocumentsGroupsAddRet }
     *     
     */
    public ArrayOfDOrderOfDocumentsGroupsAddRet getOrderOfDocumentsGroupsAddResult() {
        return orderOfDocumentsGroupsAddResult;
    }

    /**
     * Sets the value of the orderOfDocumentsGroupsAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOrderOfDocumentsGroupsAddRet }
     *     
     */
    public void setOrderOfDocumentsGroupsAddResult(ArrayOfDOrderOfDocumentsGroupsAddRet value) {
        this.orderOfDocumentsGroupsAddResult = value;
    }

}
