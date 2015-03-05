
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dLastError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dLastError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LastErrorCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dLastError", propOrder = {
    "lastErrorCode",
    "lastErrorDescription"
})
public class DLastError {

    @XmlElement(name = "LastErrorCode")
    protected int lastErrorCode;
    @XmlElement(name = "LastErrorDescription")
    protected String lastErrorDescription;

    /**
     * Gets the value of the lastErrorCode property.
     * 
     */
    public int getLastErrorCode() {
        return lastErrorCode;
    }

    /**
     * Sets the value of the lastErrorCode property.
     * 
     */
    public void setLastErrorCode(int value) {
        this.lastErrorCode = value;
    }

    /**
     * Gets the value of the lastErrorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastErrorDescription() {
        return lastErrorDescription;
    }

    /**
     * Sets the value of the lastErrorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastErrorDescription(String value) {
        this.lastErrorDescription = value;
    }

}
