//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.27 at 12:51:32 AM EET 
//


package org.is.lnu.edebo.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDDeliveryOfDocumentsDocumentTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDDeliveryOfDocumentsDocumentTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dDeliveryOfDocumentsDocumentTypes" type="{http://edboservice.ua/}dDeliveryOfDocumentsDocumentTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDDeliveryOfDocumentsDocumentTypes", propOrder = {
    "dDeliveryOfDocumentsDocumentTypes"
})
public class ArrayOfDDeliveryOfDocumentsDocumentTypes {

    @XmlElement(nillable = true)
    protected List<DDeliveryOfDocumentsDocumentTypes> dDeliveryOfDocumentsDocumentTypes;

    /**
     * Gets the value of the dDeliveryOfDocumentsDocumentTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dDeliveryOfDocumentsDocumentTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDDeliveryOfDocumentsDocumentTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DDeliveryOfDocumentsDocumentTypes }
     * 
     * 
     */
    public List<DDeliveryOfDocumentsDocumentTypes> getDDeliveryOfDocumentsDocumentTypes() {
        if (dDeliveryOfDocumentsDocumentTypes == null) {
            dDeliveryOfDocumentsDocumentTypes = new ArrayList<DDeliveryOfDocumentsDocumentTypes>();
        }
        return this.dDeliveryOfDocumentsDocumentTypes;
    }

}
