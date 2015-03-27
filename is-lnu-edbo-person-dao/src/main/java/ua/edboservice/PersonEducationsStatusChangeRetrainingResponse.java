
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
 *         &lt;element name="PersonEducationsStatusChangeRetrainingResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChangeRetrainingResult"
})
@XmlRootElement(name = "PersonEducationsStatusChangeRetrainingResponse")
public class PersonEducationsStatusChangeRetrainingResponse {

    @XmlElement(name = "PersonEducationsStatusChangeRetrainingResult")
    protected String personEducationsStatusChangeRetrainingResult;

    /**
     * Gets the value of the personEducationsStatusChangeRetrainingResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangeRetrainingResult() {
        return personEducationsStatusChangeRetrainingResult;
    }

    /**
     * Sets the value of the personEducationsStatusChangeRetrainingResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangeRetrainingResult(String value) {
        this.personEducationsStatusChangeRetrainingResult = value;
    }

}
