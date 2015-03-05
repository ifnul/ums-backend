
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
 *         &lt;element name="ExtZNOFindByFIOResult" type="{http://edboservice.ua/}ArrayOfDExtZNOByFIO" minOccurs="0"/>
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
    "extZNOFindByFIOResult"
})
@XmlRootElement(name = "ExtZNOFindByFIOResponse")
public class ExtZNOFindByFIOResponse {

    @XmlElement(name = "ExtZNOFindByFIOResult")
    protected ArrayOfDExtZNOByFIO extZNOFindByFIOResult;

    /**
     * Gets the value of the extZNOFindByFIOResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDExtZNOByFIO }
     *     
     */
    public ArrayOfDExtZNOByFIO getExtZNOFindByFIOResult() {
        return extZNOFindByFIOResult;
    }

    /**
     * Sets the value of the extZNOFindByFIOResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDExtZNOByFIO }
     *     
     */
    public void setExtZNOFindByFIOResult(ArrayOfDExtZNOByFIO value) {
        this.extZNOFindByFIOResult = value;
    }

}
