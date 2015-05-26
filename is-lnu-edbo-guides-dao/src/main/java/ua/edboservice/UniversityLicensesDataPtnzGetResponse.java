
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
 *         &lt;element name="UniversityLicensesDataPtnzGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesDataPtnzGet" minOccurs="0"/>
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
    "universityLicensesDataPtnzGetResult"
})
@XmlRootElement(name = "UniversityLicensesDataPtnzGetResponse")
public class UniversityLicensesDataPtnzGetResponse {

    @XmlElement(name = "UniversityLicensesDataPtnzGetResult")
    protected ArrayOfDUniversityLicensesDataPtnzGet universityLicensesDataPtnzGetResult;

    /**
     * Gets the value of the universityLicensesDataPtnzGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesDataPtnzGet }
     *     
     */
    public ArrayOfDUniversityLicensesDataPtnzGet getUniversityLicensesDataPtnzGetResult() {
        return universityLicensesDataPtnzGetResult;
    }

    /**
     * Sets the value of the universityLicensesDataPtnzGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesDataPtnzGet }
     *     
     */
    public void setUniversityLicensesDataPtnzGetResult(ArrayOfDUniversityLicensesDataPtnzGet value) {
        this.universityLicensesDataPtnzGetResult = value;
    }

}
