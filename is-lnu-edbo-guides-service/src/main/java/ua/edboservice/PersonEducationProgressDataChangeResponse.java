
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
 *         &lt;element name="PersonEducationProgressDataChangeResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationProgressDataChangeResult"
})
@XmlRootElement(name = "PersonEducationProgressDataChangeResponse")
public class PersonEducationProgressDataChangeResponse {

    @XmlElement(name = "PersonEducationProgressDataChangeResult")
    protected String personEducationProgressDataChangeResult;

    /**
     * Gets the value of the personEducationProgressDataChangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressDataChangeResult() {
        return personEducationProgressDataChangeResult;
    }

    /**
     * Sets the value of the personEducationProgressDataChangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressDataChangeResult(String value) {
        this.personEducationProgressDataChangeResult = value;
    }

}
