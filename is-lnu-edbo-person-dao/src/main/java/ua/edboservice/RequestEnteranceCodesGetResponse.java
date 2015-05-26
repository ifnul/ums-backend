
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
 *         &lt;element name="RequestEnteranceCodesGetResult" type="{http://edboservice.ua/}ArrayOfDRequestEnteranceCodes" minOccurs="0"/>
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
    "requestEnteranceCodesGetResult"
})
@XmlRootElement(name = "RequestEnteranceCodesGetResponse")
public class RequestEnteranceCodesGetResponse {

    @XmlElement(name = "RequestEnteranceCodesGetResult")
    protected ArrayOfDRequestEnteranceCodes requestEnteranceCodesGetResult;

    /**
     * Gets the value of the requestEnteranceCodesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDRequestEnteranceCodes }
     *     
     */
    public ArrayOfDRequestEnteranceCodes getRequestEnteranceCodesGetResult() {
        return requestEnteranceCodesGetResult;
    }

    /**
     * Sets the value of the requestEnteranceCodesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDRequestEnteranceCodes }
     *     
     */
    public void setRequestEnteranceCodesGetResult(ArrayOfDRequestEnteranceCodes value) {
        this.requestEnteranceCodesGetResult = value;
    }

}
