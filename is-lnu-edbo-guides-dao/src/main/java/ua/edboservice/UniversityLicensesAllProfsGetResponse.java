
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
 *         &lt;element name="UniversityLicensesAllProfsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityLicensesAllProfs" minOccurs="0"/>
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
    "universityLicensesAllProfsGetResult"
})
@XmlRootElement(name = "UniversityLicensesAllProfsGetResponse")
public class UniversityLicensesAllProfsGetResponse {

    @XmlElement(name = "UniversityLicensesAllProfsGetResult")
    protected ArrayOfDUniversityLicensesAllProfs universityLicensesAllProfsGetResult;

    /**
     * Gets the value of the universityLicensesAllProfsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityLicensesAllProfs }
     *     
     */
    public ArrayOfDUniversityLicensesAllProfs getUniversityLicensesAllProfsGetResult() {
        return universityLicensesAllProfsGetResult;
    }

    /**
     * Sets the value of the universityLicensesAllProfsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityLicensesAllProfs }
     *     
     */
    public void setUniversityLicensesAllProfsGetResult(ArrayOfDUniversityLicensesAllProfs value) {
        this.universityLicensesAllProfsGetResult = value;
    }

}
