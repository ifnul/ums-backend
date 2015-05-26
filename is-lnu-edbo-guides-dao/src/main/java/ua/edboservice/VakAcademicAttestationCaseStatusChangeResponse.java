
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
 *         &lt;element name="VakAcademicAttestationCaseStatusChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "vakAcademicAttestationCaseStatusChangeResult"
})
@XmlRootElement(name = "VakAcademicAttestationCaseStatusChangeResponse")
public class VakAcademicAttestationCaseStatusChangeResponse {

    @XmlElement(name = "VakAcademicAttestationCaseStatusChangeResult")
    protected int vakAcademicAttestationCaseStatusChangeResult;

    /**
     * Gets the value of the vakAcademicAttestationCaseStatusChangeResult property.
     * 
     */
    public int getVakAcademicAttestationCaseStatusChangeResult() {
        return vakAcademicAttestationCaseStatusChangeResult;
    }

    /**
     * Sets the value of the vakAcademicAttestationCaseStatusChangeResult property.
     * 
     */
    public void setVakAcademicAttestationCaseStatusChangeResult(int value) {
        this.vakAcademicAttestationCaseStatusChangeResult = value;
    }

}
