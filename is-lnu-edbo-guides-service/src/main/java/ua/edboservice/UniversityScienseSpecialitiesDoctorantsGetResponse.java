
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
 *         &lt;element name="UniversityScienseSpecialitiesDoctorantsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityScienseSpecialitiesDoctorants" minOccurs="0"/>
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
    "universityScienseSpecialitiesDoctorantsGetResult"
})
@XmlRootElement(name = "UniversityScienseSpecialitiesDoctorantsGetResponse")
public class UniversityScienseSpecialitiesDoctorantsGetResponse {

    @XmlElement(name = "UniversityScienseSpecialitiesDoctorantsGetResult")
    protected ArrayOfDUniversityScienseSpecialitiesDoctorants universityScienseSpecialitiesDoctorantsGetResult;

    /**
     * Gets the value of the universityScienseSpecialitiesDoctorantsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityScienseSpecialitiesDoctorants }
     *     
     */
    public ArrayOfDUniversityScienseSpecialitiesDoctorants getUniversityScienseSpecialitiesDoctorantsGetResult() {
        return universityScienseSpecialitiesDoctorantsGetResult;
    }

    /**
     * Sets the value of the universityScienseSpecialitiesDoctorantsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityScienseSpecialitiesDoctorants }
     *     
     */
    public void setUniversityScienseSpecialitiesDoctorantsGetResult(ArrayOfDUniversityScienseSpecialitiesDoctorants value) {
        this.universityScienseSpecialitiesDoctorantsGetResult = value;
    }

}
