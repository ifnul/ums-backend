
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
 *         &lt;element name="UniversityLicensesDataGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesData" minOccurs="0"/>
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
    "universityLicensesDataGetResult"
})
@XmlRootElement(name = "UniversityLicensesDataGetResponse")
public class UniversityLicensesDataGetResponse {

    @XmlElement(name = "UniversityLicensesDataGetResult")
    protected ArrayOfDUniversityLicensesData universityLicensesDataGetResult;

    /**
     * Gets the value of the universityLicensesDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesData }
     *     
     */
    public ArrayOfDUniversityLicensesData getUniversityLicensesDataGetResult() {
        return universityLicensesDataGetResult;
    }

    /**
     * Sets the value of the universityLicensesDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesData }
     *     
     */
    public void setUniversityLicensesDataGetResult(ArrayOfDUniversityLicensesData value) {
        this.universityLicensesDataGetResult = value;
    }

}
