
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
 *         &lt;element name="GUIDSession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "guidSession"
})
@XmlRootElement(name = "GetLastError")
public class GetLastError {

    @XmlElement(name = "GUIDSession")
    protected String guidSession;

    /**
     * Gets the value of the guidSession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUIDSession() {
        return guidSession;
    }

    /**
     * Sets the value of the guidSession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUIDSession(String value) {
        this.guidSession = value;
    }

}
