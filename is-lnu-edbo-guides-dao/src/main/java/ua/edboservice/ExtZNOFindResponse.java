
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
 *         &lt;element name="ExtZNOFindResult" type="{http://edboservice.ua/}ArrayOfDExtZNO" minOccurs="0"/>
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
    "extZNOFindResult"
})
@XmlRootElement(name = "ExtZNOFindResponse")
public class ExtZNOFindResponse {

    @XmlElement(name = "ExtZNOFindResult")
    protected ArrayOfDExtZNO extZNOFindResult;

    /**
     * Gets the value of the extZNOFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDExtZNO }
     *     
     */
    public ArrayOfDExtZNO getExtZNOFindResult() {
        return extZNOFindResult;
    }

    /**
     * Sets the value of the extZNOFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDExtZNO }
     *     
     */
    public void setExtZNOFindResult(ArrayOfDExtZNO value) {
        this.extZNOFindResult = value;
    }

}
