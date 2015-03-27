
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
 *         &lt;element name="UzLogDataGetResult" type="{http://edboservice.ua/}ArrayOfDUzLogData" minOccurs="0"/>
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
    "uzLogDataGetResult"
})
@XmlRootElement(name = "UzLogDataGetResponse")
public class UzLogDataGetResponse {

    @XmlElement(name = "UzLogDataGetResult")
    protected ArrayOfDUzLogData uzLogDataGetResult;

    /**
     * Gets the value of the uzLogDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUzLogData }
     *     
     */
    public ArrayOfDUzLogData getUzLogDataGetResult() {
        return uzLogDataGetResult;
    }

    /**
     * Sets the value of the uzLogDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUzLogData }
     *     
     */
    public void setUzLogDataGetResult(ArrayOfDUzLogData value) {
        this.uzLogDataGetResult = value;
    }

}
