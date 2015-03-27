
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
 *         &lt;element name="UniversityAcreditatinTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityAcreditatinTypes" minOccurs="0"/>
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
    "universityAcreditatinTypesGetResult"
})
@XmlRootElement(name = "UniversityAcreditatinTypesGetResponse")
public class UniversityAcreditatinTypesGetResponse {

    @XmlElement(name = "UniversityAcreditatinTypesGetResult")
    protected ArrayOfDUniversityAcreditatinTypes universityAcreditatinTypesGetResult;

    /**
     * Gets the value of the universityAcreditatinTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityAcreditatinTypes }
     *     
     */
    public ArrayOfDUniversityAcreditatinTypes getUniversityAcreditatinTypesGetResult() {
        return universityAcreditatinTypesGetResult;
    }

    /**
     * Sets the value of the universityAcreditatinTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityAcreditatinTypes }
     *     
     */
    public void setUniversityAcreditatinTypesGetResult(ArrayOfDUniversityAcreditatinTypes value) {
        this.universityAcreditatinTypesGetResult = value;
    }

}
