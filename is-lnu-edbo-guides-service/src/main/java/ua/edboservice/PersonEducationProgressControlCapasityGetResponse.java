
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
 *         &lt;element name="PersonEducationProgressControlCapasityGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationProgressControlCapasity" minOccurs="0"/>
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
    "personEducationProgressControlCapasityGetResult"
})
@XmlRootElement(name = "PersonEducationProgressControlCapasityGetResponse")
public class PersonEducationProgressControlCapasityGetResponse {

    @XmlElement(name = "PersonEducationProgressControlCapasityGetResult")
    protected ArrayOfDPersonEducationProgressControlCapasity personEducationProgressControlCapasityGetResult;

    /**
     * Gets the value of the personEducationProgressControlCapasityGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationProgressControlCapasity }
     *     
     */
    public ArrayOfDPersonEducationProgressControlCapasity getPersonEducationProgressControlCapasityGetResult() {
        return personEducationProgressControlCapasityGetResult;
    }

    /**
     * Sets the value of the personEducationProgressControlCapasityGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationProgressControlCapasity }
     *     
     */
    public void setPersonEducationProgressControlCapasityGetResult(ArrayOfDPersonEducationProgressControlCapasity value) {
        this.personEducationProgressControlCapasityGetResult = value;
    }

}
