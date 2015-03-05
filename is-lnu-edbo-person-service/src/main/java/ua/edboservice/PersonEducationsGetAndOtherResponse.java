
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
 *         &lt;element name="PersonEducationsGetAndOtherResult" type="{http://edboservice.ua/}ArrayOfDPersonEducationsAndOther" minOccurs="0"/>
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
    "personEducationsGetAndOtherResult"
})
@XmlRootElement(name = "PersonEducationsGetAndOtherResponse")
public class PersonEducationsGetAndOtherResponse {

    @XmlElement(name = "PersonEducationsGetAndOtherResult")
    protected ArrayOfDPersonEducationsAndOther personEducationsGetAndOtherResult;

    /**
     * Gets the value of the personEducationsGetAndOtherResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonEducationsAndOther }
     *     
     */
    public ArrayOfDPersonEducationsAndOther getPersonEducationsGetAndOtherResult() {
        return personEducationsGetAndOtherResult;
    }

    /**
     * Sets the value of the personEducationsGetAndOtherResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonEducationsAndOther }
     *     
     */
    public void setPersonEducationsGetAndOtherResult(ArrayOfDPersonEducationsAndOther value) {
        this.personEducationsGetAndOtherResult = value;
    }

}
