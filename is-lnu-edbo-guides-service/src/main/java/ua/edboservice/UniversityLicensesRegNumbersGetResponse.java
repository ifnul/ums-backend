
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
 *         &lt;element name="UniversityLicensesRegNumbersGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesRegNumbers" minOccurs="0"/>
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
    "universityLicensesRegNumbersGetResult"
})
@XmlRootElement(name = "UniversityLicensesRegNumbersGetResponse")
public class UniversityLicensesRegNumbersGetResponse {

    @XmlElement(name = "UniversityLicensesRegNumbersGetResult")
    protected ArrayOfDUniversityLicensesRegNumbers universityLicensesRegNumbersGetResult;

    /**
     * Gets the value of the universityLicensesRegNumbersGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesRegNumbers }
     *     
     */
    public ArrayOfDUniversityLicensesRegNumbers getUniversityLicensesRegNumbersGetResult() {
        return universityLicensesRegNumbersGetResult;
    }

    /**
     * Sets the value of the universityLicensesRegNumbersGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesRegNumbers }
     *     
     */
    public void setUniversityLicensesRegNumbersGetResult(ArrayOfDUniversityLicensesRegNumbers value) {
        this.universityLicensesRegNumbersGetResult = value;
    }

}
