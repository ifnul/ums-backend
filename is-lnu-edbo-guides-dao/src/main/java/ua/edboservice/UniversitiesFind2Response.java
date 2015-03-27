
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
 *         &lt;element name="UniversitiesFind2Result" type="{http://edboservice.ua/}ArrayOfDUniversitiesFind2" minOccurs="0"/>
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
    "universitiesFind2Result"
})
@XmlRootElement(name = "UniversitiesFind2Response")
public class UniversitiesFind2Response {

    @XmlElement(name = "UniversitiesFind2Result")
    protected ArrayOfDUniversitiesFind2 universitiesFind2Result;

    /**
     * Gets the value of the universitiesFind2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversitiesFind2 }
     *     
     */
    public ArrayOfDUniversitiesFind2 getUniversitiesFind2Result() {
        return universitiesFind2Result;
    }

    /**
     * Sets the value of the universitiesFind2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversitiesFind2 }
     *     
     */
    public void setUniversitiesFind2Result(ArrayOfDUniversitiesFind2 value) {
        this.universitiesFind2Result = value;
    }

}
