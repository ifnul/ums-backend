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
 *         &lt;element name="ReceptionConditionAdditionsTableData234GetResult" type="{http://edboservice.ua/}ArrayOfDReceptionConditionAdditionsTableData234" minOccurs="0"/>
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
    "receptionConditionAdditionsTableData234GetResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData234GetResponse")
public class ReceptionConditionAdditionsTableData234GetResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData234GetResult")
    protected ArrayOfDReceptionConditionAdditionsTableData234 receptionConditionAdditionsTableData234GetResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData234GetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData234 }
     *     
     */
    public ArrayOfDReceptionConditionAdditionsTableData234 getReceptionConditionAdditionsTableData234GetResult() {
        return receptionConditionAdditionsTableData234GetResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData234GetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData234 }
     *     
     */
    public void setReceptionConditionAdditionsTableData234GetResult(ArrayOfDReceptionConditionAdditionsTableData234 value) {
        this.receptionConditionAdditionsTableData234GetResult = value;
    }

}
