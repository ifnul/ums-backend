
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
 *         &lt;element name="QueryFiltersGetResult" type="{http://edboservice.ua/}ArrayOfDQueryFilters" minOccurs="0"/>
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
    "queryFiltersGetResult"
})
@XmlRootElement(name = "QueryFiltersGetResponse")
public class QueryFiltersGetResponse {

    @XmlElement(name = "QueryFiltersGetResult")
    protected ArrayOfDQueryFilters queryFiltersGetResult;

    /**
     * Gets the value of the queryFiltersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDQueryFilters }
     *     
     */
    public ArrayOfDQueryFilters getQueryFiltersGetResult() {
        return queryFiltersGetResult;
    }

    /**
     * Sets the value of the queryFiltersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDQueryFilters }
     *     
     */
    public void setQueryFiltersGetResult(ArrayOfDQueryFilters value) {
        this.queryFiltersGetResult = value;
    }

}
