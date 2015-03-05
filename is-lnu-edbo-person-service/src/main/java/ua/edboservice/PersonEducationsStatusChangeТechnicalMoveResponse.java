
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
 *         &lt;element name="PersonEducationsStatusChangeТechnicalMoveResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChange\u0422echnicalMoveResult"
})
@XmlRootElement(name = "PersonEducationsStatusChange\u0422echnicalMoveResponse")
public class PersonEducationsStatusChangeТechnicalMoveResponse {

    @XmlElement(name = "PersonEducationsStatusChange\u0422echnicalMoveResult")
    protected String personEducationsStatusChangeТechnicalMoveResult;

    /**
     * Gets the value of the personEducationsStatusChangeТechnicalMoveResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangeТechnicalMoveResult() {
        return personEducationsStatusChangeТechnicalMoveResult;
    }

    /**
     * Sets the value of the personEducationsStatusChangeТechnicalMoveResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangeТechnicalMoveResult(String value) {
        this.personEducationsStatusChangeТechnicalMoveResult = value;
    }

}
