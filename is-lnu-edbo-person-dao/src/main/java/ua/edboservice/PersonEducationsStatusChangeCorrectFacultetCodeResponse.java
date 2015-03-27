
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
 *         &lt;element name="PersonEducationsStatusChangeCorrectFacultetCodeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChangeCorrectFacultetCodeResult"
})
@XmlRootElement(name = "PersonEducationsStatusChangeCorrectFacultetCodeResponse")
public class PersonEducationsStatusChangeCorrectFacultetCodeResponse {

    @XmlElement(name = "PersonEducationsStatusChangeCorrectFacultetCodeResult")
    protected String personEducationsStatusChangeCorrectFacultetCodeResult;

    /**
     * Gets the value of the personEducationsStatusChangeCorrectFacultetCodeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangeCorrectFacultetCodeResult() {
        return personEducationsStatusChangeCorrectFacultetCodeResult;
    }

    /**
     * Sets the value of the personEducationsStatusChangeCorrectFacultetCodeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangeCorrectFacultetCodeResult(String value) {
        this.personEducationsStatusChangeCorrectFacultetCodeResult = value;
    }

}
