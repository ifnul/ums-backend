
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
 *         &lt;element name="AcademicEducationOrdersGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicEducationOrders" minOccurs="0"/>
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
    "academicEducationOrdersGetResult"
})
@XmlRootElement(name = "AcademicEducationOrdersGetResponse")
public class AcademicEducationOrdersGetResponse {

    @XmlElement(name = "AcademicEducationOrdersGetResult")
    protected ArrayOfDAcademicEducationOrders academicEducationOrdersGetResult;

    /**
     * Gets the value of the academicEducationOrdersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicEducationOrders }
     *     
     */
    public ArrayOfDAcademicEducationOrders getAcademicEducationOrdersGetResult() {
        return academicEducationOrdersGetResult;
    }

    /**
     * Sets the value of the academicEducationOrdersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicEducationOrders }
     *     
     */
    public void setAcademicEducationOrdersGetResult(ArrayOfDAcademicEducationOrders value) {
        this.academicEducationOrdersGetResult = value;
    }

}
