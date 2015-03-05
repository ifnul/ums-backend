
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
 *         &lt;element name="UniversitiesGet2Result" type="{http://edboservice.ua/}ArrayOfDUniversities" minOccurs="0"/>
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
    "universitiesGet2Result"
})
@XmlRootElement(name = "UniversitiesGet2Response")
public class UniversitiesGet2Response {

    @XmlElement(name = "UniversitiesGet2Result")
    protected ArrayOfDUniversities universitiesGet2Result;

    /**
     * Gets the value of the universitiesGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversities }
     *     
     */
    public ArrayOfDUniversities getUniversitiesGet2Result() {
        return universitiesGet2Result;
    }

    /**
     * Sets the value of the universitiesGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversities }
     *     
     */
    public void setUniversitiesGet2Result(ArrayOfDUniversities value) {
        this.universitiesGet2Result = value;
    }

}
