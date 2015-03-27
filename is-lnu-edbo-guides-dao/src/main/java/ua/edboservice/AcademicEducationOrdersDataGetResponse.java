
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
 *         &lt;element name="AcademicEducationOrdersDataGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicEducationOrdersData" minOccurs="0"/>
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
    "academicEducationOrdersDataGetResult"
})
@XmlRootElement(name = "AcademicEducationOrdersDataGetResponse")
public class AcademicEducationOrdersDataGetResponse {

    @XmlElement(name = "AcademicEducationOrdersDataGetResult")
    protected ArrayOfDAcademicEducationOrdersData academicEducationOrdersDataGetResult;

    /**
     * Gets the value of the academicEducationOrdersDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicEducationOrdersData }
     *     
     */
    public ArrayOfDAcademicEducationOrdersData getAcademicEducationOrdersDataGetResult() {
        return academicEducationOrdersDataGetResult;
    }

    /**
     * Sets the value of the academicEducationOrdersDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicEducationOrdersData }
     *     
     */
    public void setAcademicEducationOrdersDataGetResult(ArrayOfDAcademicEducationOrdersData value) {
        this.academicEducationOrdersDataGetResult = value;
    }

}
