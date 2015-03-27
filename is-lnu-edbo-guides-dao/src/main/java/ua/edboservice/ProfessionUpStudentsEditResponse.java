
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
 *         &lt;element name="ProfessionUpStudentsEditResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "professionUpStudentsEditResult"
})
@XmlRootElement(name = "ProfessionUpStudentsEditResponse")
public class ProfessionUpStudentsEditResponse {

    @XmlElement(name = "ProfessionUpStudentsEditResult")
    protected String professionUpStudentsEditResult;

    /**
     * Gets the value of the professionUpStudentsEditResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionUpStudentsEditResult() {
        return professionUpStudentsEditResult;
    }

    /**
     * Sets the value of the professionUpStudentsEditResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionUpStudentsEditResult(String value) {
        this.professionUpStudentsEditResult = value;
    }

}
