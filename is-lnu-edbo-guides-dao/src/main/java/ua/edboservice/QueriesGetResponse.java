
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
 *         &lt;element name="QueriesGetResult" type="{http://edboservice.ua/}ArrayOfDQueries" minOccurs="0"/>
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
    "queriesGetResult"
})
@XmlRootElement(name = "QueriesGetResponse")
public class QueriesGetResponse {

    @XmlElement(name = "QueriesGetResult")
    protected ArrayOfDQueries queriesGetResult;

    /**
     * Gets the value of the queriesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDQueries }
     *     
     */
    public ArrayOfDQueries getQueriesGetResult() {
        return queriesGetResult;
    }

    /**
     * Sets the value of the queriesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDQueries }
     *     
     */
    public void setQueriesGetResult(ArrayOfDQueries value) {
        this.queriesGetResult = value;
    }

}
