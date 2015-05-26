
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
 *         &lt;element name="PersonEducationProgressControlTypeGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationProgressControlType" minOccurs="0"/>
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
    "personEducationProgressControlTypeGetResult"
})
@XmlRootElement(name = "PersonEducationProgressControlTypeGetResponse")
public class PersonEducationProgressControlTypeGetResponse {

    @XmlElement(name = "PersonEducationProgressControlTypeGetResult")
    protected ArrayOfDPersonEducationProgressControlType personEducationProgressControlTypeGetResult;

    /**
     * Gets the value of the personEducationProgressControlTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationProgressControlType }
     *     
     */
    public ArrayOfDPersonEducationProgressControlType getPersonEducationProgressControlTypeGetResult() {
        return personEducationProgressControlTypeGetResult;
    }

    /**
     * Sets the value of the personEducationProgressControlTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationProgressControlType }
     *     
     */
    public void setPersonEducationProgressControlTypeGetResult(ArrayOfDPersonEducationProgressControlType value) {
        this.personEducationProgressControlTypeGetResult = value;
    }

}
