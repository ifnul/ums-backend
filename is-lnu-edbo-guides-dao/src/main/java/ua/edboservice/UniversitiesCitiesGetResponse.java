
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
 *         &lt;element name="UniversitiesCitiesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversitiesCities" minOccurs="0"/>
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
    "universitiesCitiesGetResult"
})
@XmlRootElement(name = "UniversitiesCitiesGetResponse")
public class UniversitiesCitiesGetResponse {

    @XmlElement(name = "UniversitiesCitiesGetResult")
    protected ArrayOfDUniversitiesCities universitiesCitiesGetResult;

    /**
     * Gets the value of the universitiesCitiesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversitiesCities }
     *     
     */
    public ArrayOfDUniversitiesCities getUniversitiesCitiesGetResult() {
        return universitiesCitiesGetResult;
    }

    /**
     * Sets the value of the universitiesCitiesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversitiesCities }
     *     
     */
    public void setUniversitiesCitiesGetResult(ArrayOfDUniversitiesCities value) {
        this.universitiesCitiesGetResult = value;
    }

}
