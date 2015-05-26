
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
 *         &lt;element name="PersonEducationHistoryGet2Result" type="{http://edboservice.ua/}ArrayOfDPersonEducationHistory2" minOccurs="0"/>
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
    "personEducationHistoryGet2Result"
})
@XmlRootElement(name = "PersonEducationHistoryGet2Response")
public class PersonEducationHistoryGet2Response {

    @XmlElement(name = "PersonEducationHistoryGet2Result")
    protected ArrayOfDPersonEducationHistory2 personEducationHistoryGet2Result;

    /**
     * Gets the value of the personEducationHistoryGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationHistory2 }
     *     
     */
    public ArrayOfDPersonEducationHistory2 getPersonEducationHistoryGet2Result() {
        return personEducationHistoryGet2Result;
    }

    /**
     * Sets the value of the personEducationHistoryGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationHistory2 }
     *     
     */
    public void setPersonEducationHistoryGet2Result(ArrayOfDPersonEducationHistory2 value) {
        this.personEducationHistoryGet2Result = value;
    }

}
