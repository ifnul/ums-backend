
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
 *         &lt;element name="UniversitiesGet3Result" type="{http://edboservice.ua/}ArrayOfDUniversities3" minOccurs="0"/>
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
    "universitiesGet3Result"
})
@XmlRootElement(name = "UniversitiesGet3Response")
public class UniversitiesGet3Response {

    @XmlElement(name = "UniversitiesGet3Result")
    protected ArrayOfDUniversities3 universitiesGet3Result;

    /**
     * Gets the value of the universitiesGet3Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversities3 }
     *     
     */
    public ArrayOfDUniversities3 getUniversitiesGet3Result() {
        return universitiesGet3Result;
    }

    /**
     * Sets the value of the universitiesGet3Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversities3 }
     *     
     */
    public void setUniversitiesGet3Result(ArrayOfDUniversities3 value) {
        this.universitiesGet3Result = value;
    }

}
