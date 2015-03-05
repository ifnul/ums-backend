
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
 *         &lt;element name="OlympiadsGetResult" type="{http://edboservice.ua/}ArrayOfDOlympiads" minOccurs="0"/>
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
    "olympiadsGetResult"
})
@XmlRootElement(name = "OlympiadsGetResponse")
public class OlympiadsGetResponse {

    @XmlElement(name = "OlympiadsGetResult")
    protected ArrayOfDOlympiads olympiadsGetResult;

    /**
     * Gets the value of the olympiadsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOlympiads }
     *     
     */
    public ArrayOfDOlympiads getOlympiadsGetResult() {
        return olympiadsGetResult;
    }

    /**
     * Sets the value of the olympiadsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOlympiads }
     *     
     */
    public void setOlympiadsGetResult(ArrayOfDOlympiads value) {
        this.olympiadsGetResult = value;
    }

}
