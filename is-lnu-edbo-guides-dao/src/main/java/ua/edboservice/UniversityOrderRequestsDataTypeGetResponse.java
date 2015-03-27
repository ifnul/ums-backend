
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
 *         &lt;element name="UniversityOrderRequestsDataTypeGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityOrderRequestsDataType" minOccurs="0"/>
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
    "universityOrderRequestsDataTypeGetResult"
})
@XmlRootElement(name = "UniversityOrderRequestsDataTypeGetResponse")
public class UniversityOrderRequestsDataTypeGetResponse {

    @XmlElement(name = "UniversityOrderRequestsDataTypeGetResult")
    protected ArrayOfDUniversityOrderRequestsDataType universityOrderRequestsDataTypeGetResult;

    /**
     * Gets the value of the universityOrderRequestsDataTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityOrderRequestsDataType }
     *     
     */
    public ArrayOfDUniversityOrderRequestsDataType getUniversityOrderRequestsDataTypeGetResult() {
        return universityOrderRequestsDataTypeGetResult;
    }

    /**
     * Sets the value of the universityOrderRequestsDataTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityOrderRequestsDataType }
     *     
     */
    public void setUniversityOrderRequestsDataTypeGetResult(ArrayOfDUniversityOrderRequestsDataType value) {
        this.universityOrderRequestsDataTypeGetResult = value;
    }

}
