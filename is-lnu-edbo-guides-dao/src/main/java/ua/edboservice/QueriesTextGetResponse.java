
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
 *         &lt;element name="QueriesTextGetResult" type="{http://edboservice.ua/}ArrayOfDQueriesText" minOccurs="0"/>
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
    "queriesTextGetResult"
})
@XmlRootElement(name = "QueriesTextGetResponse")
public class QueriesTextGetResponse {

    @XmlElement(name = "QueriesTextGetResult")
    protected ArrayOfDQueriesText queriesTextGetResult;

    /**
     * Gets the value of the queriesTextGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDQueriesText }
     *     
     */
    public ArrayOfDQueriesText getQueriesTextGetResult() {
        return queriesTextGetResult;
    }

    /**
     * Sets the value of the queriesTextGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDQueriesText }
     *     
     */
    public void setQueriesTextGetResult(ArrayOfDQueriesText value) {
        this.queriesTextGetResult = value;
    }

}
