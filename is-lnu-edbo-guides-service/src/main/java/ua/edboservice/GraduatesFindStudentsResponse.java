
package ua.edboservice;

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
 *         &lt;element name="GraduatesFindStudentsResult" type="{http://edboservice.ua/}ArrayOfDGraduatesFindStudents" minOccurs="0"/>
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
    "graduatesFindStudentsResult"
})
@XmlRootElement(name = "GraduatesFindStudentsResponse")
public class GraduatesFindStudentsResponse {

    @XmlElement(name = "GraduatesFindStudentsResult")
    protected ArrayOfDGraduatesFindStudents graduatesFindStudentsResult;

    /**
     * Gets the value of the graduatesFindStudentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGraduatesFindStudents }
     *     
     */
    public ArrayOfDGraduatesFindStudents getGraduatesFindStudentsResult() {
        return graduatesFindStudentsResult;
    }

    /**
     * Sets the value of the graduatesFindStudentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGraduatesFindStudents }
     *     
     */
    public void setGraduatesFindStudentsResult(ArrayOfDGraduatesFindStudents value) {
        this.graduatesFindStudentsResult = value;
    }

}
