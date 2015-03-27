
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
 *         &lt;element name="PersonEducationProgressTypeGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationProgressType" minOccurs="0"/>
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
    "personEducationProgressTypeGetResult"
})
@XmlRootElement(name = "PersonEducationProgressTypeGetResponse")
public class PersonEducationProgressTypeGetResponse {

    @XmlElement(name = "PersonEducationProgressTypeGetResult")
    protected ArrayOfDPersonEducationProgressType personEducationProgressTypeGetResult;

    /**
     * Gets the value of the personEducationProgressTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationProgressType }
     *     
     */
    public ArrayOfDPersonEducationProgressType getPersonEducationProgressTypeGetResult() {
        return personEducationProgressTypeGetResult;
    }

    /**
     * Sets the value of the personEducationProgressTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationProgressType }
     *     
     */
    public void setPersonEducationProgressTypeGetResult(ArrayOfDPersonEducationProgressType value) {
        this.personEducationProgressTypeGetResult = value;
    }

}
