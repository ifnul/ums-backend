
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
 *         &lt;element name="PersonWorkOtherStatsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonWorkOtherStatsGet" minOccurs="0"/>
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
    "personWorkOtherStatsGetResult"
})
@XmlRootElement(name = "PersonWorkOtherStatsGetResponse")
public class PersonWorkOtherStatsGetResponse {

    @XmlElement(name = "PersonWorkOtherStatsGetResult")
    protected ArrayOfDPersonWorkOtherStatsGet personWorkOtherStatsGetResult;

    /**
     * Gets the value of the personWorkOtherStatsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonWorkOtherStatsGet }
     *     
     */
    public ArrayOfDPersonWorkOtherStatsGet getPersonWorkOtherStatsGetResult() {
        return personWorkOtherStatsGetResult;
    }

    /**
     * Sets the value of the personWorkOtherStatsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonWorkOtherStatsGet }
     *     
     */
    public void setPersonWorkOtherStatsGetResult(ArrayOfDPersonWorkOtherStatsGet value) {
        this.personWorkOtherStatsGetResult = value;
    }

}
