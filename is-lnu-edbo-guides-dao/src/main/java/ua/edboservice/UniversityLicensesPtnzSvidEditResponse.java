
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
 *         &lt;element name="UniversityLicensesPtnzSvidEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityLicensesPtnzSvidEditResult"
})
@XmlRootElement(name = "UniversityLicensesPtnzSvidEditResponse")
public class UniversityLicensesPtnzSvidEditResponse {

    @XmlElement(name = "UniversityLicensesPtnzSvidEditResult")
    protected int universityLicensesPtnzSvidEditResult;

    /**
     * Gets the value of the universityLicensesPtnzSvidEditResult property.
     * 
     */
    public int getUniversityLicensesPtnzSvidEditResult() {
        return universityLicensesPtnzSvidEditResult;
    }

    /**
     * Sets the value of the universityLicensesPtnzSvidEditResult property.
     * 
     */
    public void setUniversityLicensesPtnzSvidEditResult(int value) {
        this.universityLicensesPtnzSvidEditResult = value;
    }

}
