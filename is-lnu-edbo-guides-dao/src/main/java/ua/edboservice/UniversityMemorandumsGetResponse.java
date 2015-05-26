
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
 *         &lt;element name="UniversityMemorandumsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityMemorandums" minOccurs="0"/>
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
    "universityMemorandumsGetResult"
})
@XmlRootElement(name = "UniversityMemorandumsGetResponse")
public class UniversityMemorandumsGetResponse {

    @XmlElement(name = "UniversityMemorandumsGetResult")
    protected ArrayOfDUniversityMemorandums universityMemorandumsGetResult;

    /**
     * Gets the value of the universityMemorandumsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityMemorandums }
     *     
     */
    public ArrayOfDUniversityMemorandums getUniversityMemorandumsGetResult() {
        return universityMemorandumsGetResult;
    }

    /**
     * Sets the value of the universityMemorandumsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityMemorandums }
     *     
     */
    public void setUniversityMemorandumsGetResult(ArrayOfDUniversityMemorandums value) {
        this.universityMemorandumsGetResult = value;
    }

}
