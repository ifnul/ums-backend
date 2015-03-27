
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
 *         &lt;element name="UniversityScienseSpecialitiesAspirantsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityScienseSpecialitiesAspirants" minOccurs="0"/>
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
    "universityScienseSpecialitiesAspirantsGetResult"
})
@XmlRootElement(name = "UniversityScienseSpecialitiesAspirantsGetResponse")
public class UniversityScienseSpecialitiesAspirantsGetResponse {

    @XmlElement(name = "UniversityScienseSpecialitiesAspirantsGetResult")
    protected ArrayOfDUniversityScienseSpecialitiesAspirants universityScienseSpecialitiesAspirantsGetResult;

    /**
     * Gets the value of the universityScienseSpecialitiesAspirantsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityScienseSpecialitiesAspirants }
     *     
     */
    public ArrayOfDUniversityScienseSpecialitiesAspirants getUniversityScienseSpecialitiesAspirantsGetResult() {
        return universityScienseSpecialitiesAspirantsGetResult;
    }

    /**
     * Sets the value of the universityScienseSpecialitiesAspirantsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityScienseSpecialitiesAspirants }
     *     
     */
    public void setUniversityScienseSpecialitiesAspirantsGetResult(ArrayOfDUniversityScienseSpecialitiesAspirants value) {
        this.universityScienseSpecialitiesAspirantsGetResult = value;
    }

}
