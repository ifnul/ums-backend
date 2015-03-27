
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
 *         &lt;element name="PersonEducationsStatusChangeRetrainingReturnResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChangeRetrainingReturnResult"
})
@XmlRootElement(name = "PersonEducationsStatusChangeRetrainingReturnResponse")
public class PersonEducationsStatusChangeRetrainingReturnResponse {

    @XmlElement(name = "PersonEducationsStatusChangeRetrainingReturnResult")
    protected String personEducationsStatusChangeRetrainingReturnResult;

    /**
     * Gets the value of the personEducationsStatusChangeRetrainingReturnResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangeRetrainingReturnResult() {
        return personEducationsStatusChangeRetrainingReturnResult;
    }

    /**
     * Sets the value of the personEducationsStatusChangeRetrainingReturnResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangeRetrainingReturnResult(String value) {
        this.personEducationsStatusChangeRetrainingReturnResult = value;
    }

}
