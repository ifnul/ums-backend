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
 * <p>Java class for ArrayOfDAcademicReports7AData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicReports7AData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicReports7AData" type="{http://edboservice.ua/}dAcademicReports7AData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicReports7AData", propOrder = {
    "dAcademicReports7AData"
})
public class ArrayOfDAcademicReports7AData {

    @XmlElement(nillable = true)
    protected List<DAcademicReports7AData> dAcademicReports7AData;

    /**
     * Gets the value of the dAcademicReports7AData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicReports7AData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicReports7AData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicReports7AData }
     * 
     * 
     */
    public List<DAcademicReports7AData> getDAcademicReports7AData() {
        if (dAcademicReports7AData == null) {
            dAcademicReports7AData = new ArrayList<DAcademicReports7AData>();
        }
        return this.dAcademicReports7AData;
    }

}
