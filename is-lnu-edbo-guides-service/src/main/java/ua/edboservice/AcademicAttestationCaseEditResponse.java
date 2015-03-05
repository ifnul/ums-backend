
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
 *         &lt;element name="AcademicAttestationCaseEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicAttestationCaseEditResult"
})
@XmlRootElement(name = "AcademicAttestationCaseEditResponse")
public class AcademicAttestationCaseEditResponse {

    @XmlElement(name = "AcademicAttestationCaseEditResult")
    protected int academicAttestationCaseEditResult;

    /**
     * Gets the value of the academicAttestationCaseEditResult property.
     * 
     */
    public int getAcademicAttestationCaseEditResult() {
        return academicAttestationCaseEditResult;
    }

    /**
     * Sets the value of the academicAttestationCaseEditResult property.
     * 
     */
    public void setAcademicAttestationCaseEditResult(int value) {
        this.academicAttestationCaseEditResult = value;
    }

}
