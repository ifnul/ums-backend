
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
 *         &lt;element name="UniversityLicensesDataDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityLicensesDataDelResult"
})
@XmlRootElement(name = "UniversityLicensesDataDelResponse")
public class UniversityLicensesDataDelResponse {

    @XmlElement(name = "UniversityLicensesDataDelResult")
    protected int universityLicensesDataDelResult;

    /**
     * Gets the value of the universityLicensesDataDelResult property.
     * 
     */
    public int getUniversityLicensesDataDelResult() {
        return universityLicensesDataDelResult;
    }

    /**
     * Sets the value of the universityLicensesDataDelResult property.
     * 
     */
    public void setUniversityLicensesDataDelResult(int value) {
        this.universityLicensesDataDelResult = value;
    }

}
