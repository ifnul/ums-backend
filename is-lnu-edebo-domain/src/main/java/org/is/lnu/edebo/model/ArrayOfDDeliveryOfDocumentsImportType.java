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
 * <p>Java class for ArrayOfDDeliveryOfDocumentsImportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDDeliveryOfDocumentsImportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dDeliveryOfDocumentsImportType" type="{http://edboservice.ua/}dDeliveryOfDocumentsImportType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDDeliveryOfDocumentsImportType", propOrder = {
    "dDeliveryOfDocumentsImportType"
})
public class ArrayOfDDeliveryOfDocumentsImportType {

    @XmlElement(nillable = true)
    protected List<DDeliveryOfDocumentsImportType> dDeliveryOfDocumentsImportType;

    /**
     * Gets the value of the dDeliveryOfDocumentsImportType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dDeliveryOfDocumentsImportType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDDeliveryOfDocumentsImportType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DDeliveryOfDocumentsImportType }
     * 
     * 
     */
    public List<DDeliveryOfDocumentsImportType> getDDeliveryOfDocumentsImportType() {
        if (dDeliveryOfDocumentsImportType == null) {
            dDeliveryOfDocumentsImportType = new ArrayList<DDeliveryOfDocumentsImportType>();
        }
        return this.dDeliveryOfDocumentsImportType;
    }

}
