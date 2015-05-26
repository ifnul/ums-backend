
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
 *         &lt;element name="UniversityLicensesDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityLicensesDelResult"
})
@XmlRootElement(name = "UniversityLicensesDelResponse")
public class UniversityLicensesDelResponse {

    @XmlElement(name = "UniversityLicensesDelResult")
    protected int universityLicensesDelResult;

    /**
     * Gets the value of the universityLicensesDelResult property.
     * 
     */
    public int getUniversityLicensesDelResult() {
        return universityLicensesDelResult;
    }

    /**
     * Sets the value of the universityLicensesDelResult property.
     * 
     */
    public void setUniversityLicensesDelResult(int value) {
        this.universityLicensesDelResult = value;
    }

}
