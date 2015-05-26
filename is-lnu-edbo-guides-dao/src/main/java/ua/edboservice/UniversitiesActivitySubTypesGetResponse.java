
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
 *         &lt;element name="UniversitiesActivitySubTypesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversitiesActivitySubTypes" minOccurs="0"/>
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
    "universitiesActivitySubTypesGetResult"
})
@XmlRootElement(name = "UniversitiesActivitySubTypesGetResponse")
public class UniversitiesActivitySubTypesGetResponse {

    @XmlElement(name = "UniversitiesActivitySubTypesGetResult")
    protected ArrayOfDUniversitiesActivitySubTypes universitiesActivitySubTypesGetResult;

    /**
     * Gets the value of the universitiesActivitySubTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversitiesActivitySubTypes }
     *     
     */
    public ArrayOfDUniversitiesActivitySubTypes getUniversitiesActivitySubTypesGetResult() {
        return universitiesActivitySubTypesGetResult;
    }

    /**
     * Sets the value of the universitiesActivitySubTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversitiesActivitySubTypes }
     *     
     */
    public void setUniversitiesActivitySubTypesGetResult(ArrayOfDUniversitiesActivitySubTypes value) {
        this.universitiesActivitySubTypesGetResult = value;
    }

}
