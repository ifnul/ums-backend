
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
 *         &lt;element name="PersonEducationsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonEducations" minOccurs="0"/>
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
    "personEducationsGetResult"
})
@XmlRootElement(name = "PersonEducationsGetResponse")
public class PersonEducationsGetResponse {

    @XmlElement(name = "PersonEducationsGetResult")
    protected ArrayOfDPersonEducations personEducationsGetResult;

    /**
     * Gets the value of the personEducationsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducations }
     *     
     */
    public ArrayOfDPersonEducations getPersonEducationsGetResult() {
        return personEducationsGetResult;
    }

    /**
     * Sets the value of the personEducationsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducations }
     *     
     */
    public void setPersonEducationsGetResult(ArrayOfDPersonEducations value) {
        this.personEducationsGetResult = value;
    }

}
