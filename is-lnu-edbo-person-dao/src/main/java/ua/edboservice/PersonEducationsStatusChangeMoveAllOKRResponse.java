
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
 *         &lt;element name="PersonEducationsStatusChangeMoveAllOKRResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChangeMoveAllOKRResult"
})
@XmlRootElement(name = "PersonEducationsStatusChangeMoveAllOKRResponse")
public class PersonEducationsStatusChangeMoveAllOKRResponse {

    @XmlElement(name = "PersonEducationsStatusChangeMoveAllOKRResult")
    protected String personEducationsStatusChangeMoveAllOKRResult;

    /**
     * Gets the value of the personEducationsStatusChangeMoveAllOKRResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangeMoveAllOKRResult() {
        return personEducationsStatusChangeMoveAllOKRResult;
    }

    /**
     * Sets the value of the personEducationsStatusChangeMoveAllOKRResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangeMoveAllOKRResult(String value) {
        this.personEducationsStatusChangeMoveAllOKRResult = value;
    }

}
