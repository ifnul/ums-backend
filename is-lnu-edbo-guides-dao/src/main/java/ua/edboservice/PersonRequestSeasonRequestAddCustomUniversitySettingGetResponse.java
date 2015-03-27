
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
 *         &lt;element name="PersonRequestSeasonRequestAddCustomUniversitySettingGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestSeasonRequestAddCustomUniversitySetting" minOccurs="0"/>
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
    "personRequestSeasonRequestAddCustomUniversitySettingGetResult"
})
@XmlRootElement(name = "PersonRequestSeasonRequestAddCustomUniversitySettingGetResponse")
public class PersonRequestSeasonRequestAddCustomUniversitySettingGetResponse {

    @XmlElement(name = "PersonRequestSeasonRequestAddCustomUniversitySettingGetResult")
    protected ArrayOfDPersonRequestSeasonRequestAddCustomUniversitySetting personRequestSeasonRequestAddCustomUniversitySettingGetResult;

    /**
     * Gets the value of the personRequestSeasonRequestAddCustomUniversitySettingGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestSeasonRequestAddCustomUniversitySetting }
     *     
     */
    public ArrayOfDPersonRequestSeasonRequestAddCustomUniversitySetting getPersonRequestSeasonRequestAddCustomUniversitySettingGetResult() {
        return personRequestSeasonRequestAddCustomUniversitySettingGetResult;
    }

    /**
     * Sets the value of the personRequestSeasonRequestAddCustomUniversitySettingGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestSeasonRequestAddCustomUniversitySetting }
     *     
     */
    public void setPersonRequestSeasonRequestAddCustomUniversitySettingGetResult(ArrayOfDPersonRequestSeasonRequestAddCustomUniversitySetting value) {
        this.personRequestSeasonRequestAddCustomUniversitySettingGetResult = value;
    }

}
