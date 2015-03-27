
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
 *         &lt;element name="ProfessionUpStudentsAddResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "professionUpStudentsAddResult"
})
@XmlRootElement(name = "ProfessionUpStudentsAddResponse")
public class ProfessionUpStudentsAddResponse {

    @XmlElement(name = "ProfessionUpStudentsAddResult")
    protected String professionUpStudentsAddResult;

    /**
     * Gets the value of the professionUpStudentsAddResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionUpStudentsAddResult() {
        return professionUpStudentsAddResult;
    }

    /**
     * Sets the value of the professionUpStudentsAddResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionUpStudentsAddResult(String value) {
        this.professionUpStudentsAddResult = value;
    }

}
