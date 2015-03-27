
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
 *         &lt;element name="GetLastErrorResult" type="{http://edboservice.ua/}ArrayOfDLastError" minOccurs="0"/>
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
    "getLastErrorResult"
})
@XmlRootElement(name = "GetLastErrorResponse")
public class GetLastErrorResponse {

    @XmlElement(name = "GetLastErrorResult")
    protected ArrayOfDLastError getLastErrorResult;

    /**
     * Gets the value of the getLastErrorResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDLastError }
     *     
     */
    public ArrayOfDLastError getGetLastErrorResult() {
        return getLastErrorResult;
    }

    /**
     * Sets the value of the getLastErrorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDLastError }
     *     
     */
    public void setGetLastErrorResult(ArrayOfDLastError value) {
        this.getLastErrorResult = value;
    }

}
