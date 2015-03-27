
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
 *         &lt;element name="HistoryGetActionInfoResult" type="{http://edboservice.ua/}ArrayOfDHistoryGetActionInfo" minOccurs="0"/>
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
    "historyGetActionInfoResult"
})
@XmlRootElement(name = "HistoryGetActionInfoResponse")
public class HistoryGetActionInfoResponse {

    @XmlElement(name = "HistoryGetActionInfoResult")
    protected ArrayOfDHistoryGetActionInfo historyGetActionInfoResult;

    /**
     * Gets the value of the historyGetActionInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDHistoryGetActionInfo }
     *     
     */
    public ArrayOfDHistoryGetActionInfo getHistoryGetActionInfoResult() {
        return historyGetActionInfoResult;
    }

    /**
     * Sets the value of the historyGetActionInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDHistoryGetActionInfo }
     *     
     */
    public void setHistoryGetActionInfoResult(ArrayOfDHistoryGetActionInfo value) {
        this.historyGetActionInfoResult = value;
    }

}
