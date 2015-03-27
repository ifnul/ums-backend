
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
 *         &lt;element name="PersonWorkHistoryScansPagesGetGetResult" type="{http://edboservice.ua/}ArrayOfDPersonWorkHistoryScansPages" minOccurs="0"/>
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
    "personWorkHistoryScansPagesGetGetResult"
})
@XmlRootElement(name = "PersonWorkHistoryScansPagesGetGetResponse")
public class PersonWorkHistoryScansPagesGetGetResponse {

    @XmlElement(name = "PersonWorkHistoryScansPagesGetGetResult")
    protected ArrayOfDPersonWorkHistoryScansPages personWorkHistoryScansPagesGetGetResult;

    /**
     * Gets the value of the personWorkHistoryScansPagesGetGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonWorkHistoryScansPages }
     *     
     */
    public ArrayOfDPersonWorkHistoryScansPages getPersonWorkHistoryScansPagesGetGetResult() {
        return personWorkHistoryScansPagesGetGetResult;
    }

    /**
     * Sets the value of the personWorkHistoryScansPagesGetGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonWorkHistoryScansPages }
     *     
     */
    public void setPersonWorkHistoryScansPagesGetGetResult(ArrayOfDPersonWorkHistoryScansPages value) {
        this.personWorkHistoryScansPagesGetGetResult = value;
    }

}
