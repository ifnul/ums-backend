
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
 *         &lt;element name="OlympiadsAwardsGetResult" type="{http://edboservice.ua/}ArrayOfDOlympiadsAwards" minOccurs="0"/>
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
    "olympiadsAwardsGetResult"
})
@XmlRootElement(name = "OlympiadsAwardsGetResponse")
public class OlympiadsAwardsGetResponse {

    @XmlElement(name = "OlympiadsAwardsGetResult")
    protected ArrayOfDOlympiadsAwards olympiadsAwardsGetResult;

    /**
     * Gets the value of the olympiadsAwardsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOlympiadsAwards }
     *     
     */
    public ArrayOfDOlympiadsAwards getOlympiadsAwardsGetResult() {
        return olympiadsAwardsGetResult;
    }

    /**
     * Sets the value of the olympiadsAwardsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOlympiadsAwards }
     *     
     */
    public void setOlympiadsAwardsGetResult(ArrayOfDOlympiadsAwards value) {
        this.olympiadsAwardsGetResult = value;
    }

}
