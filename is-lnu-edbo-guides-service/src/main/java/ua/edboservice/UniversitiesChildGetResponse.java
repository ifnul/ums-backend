
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
 *         &lt;element name="UniversitiesChildGetResult" type="{http://edboservice.ua/}ArrayOfDUniversitiesChild" minOccurs="0"/>
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
    "universitiesChildGetResult"
})
@XmlRootElement(name = "UniversitiesChildGetResponse")
public class UniversitiesChildGetResponse {

    @XmlElement(name = "UniversitiesChildGetResult")
    protected ArrayOfDUniversitiesChild universitiesChildGetResult;

    /**
     * Gets the value of the universitiesChildGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversitiesChild }
     *     
     */
    public ArrayOfDUniversitiesChild getUniversitiesChildGetResult() {
        return universitiesChildGetResult;
    }

    /**
     * Sets the value of the universitiesChildGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversitiesChild }
     *     
     */
    public void setUniversitiesChildGetResult(ArrayOfDUniversitiesChild value) {
        this.universitiesChildGetResult = value;
    }

}
