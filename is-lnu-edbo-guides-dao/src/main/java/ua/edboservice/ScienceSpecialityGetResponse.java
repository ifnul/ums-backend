
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
 *         &lt;element name="ScienceSpecialityGetResult" type="{http://edboservice.ua/}ArrayOfDScienceSpeciality" minOccurs="0"/>
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
    "scienceSpecialityGetResult"
})
@XmlRootElement(name = "ScienceSpecialityGetResponse")
public class ScienceSpecialityGetResponse {

    @XmlElement(name = "ScienceSpecialityGetResult")
    protected ArrayOfDScienceSpeciality scienceSpecialityGetResult;

    /**
     * Gets the value of the scienceSpecialityGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDScienceSpeciality }
     *     
     */
    public ArrayOfDScienceSpeciality getScienceSpecialityGetResult() {
        return scienceSpecialityGetResult;
    }

    /**
     * Sets the value of the scienceSpecialityGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDScienceSpeciality }
     *     
     */
    public void setScienceSpecialityGetResult(ArrayOfDScienceSpeciality value) {
        this.scienceSpecialityGetResult = value;
    }

}
