
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
 *         &lt;element name="VakAcademicAttestationCaseNumberFillResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "vakAcademicAttestationCaseNumberFillResult"
})
@XmlRootElement(name = "VakAcademicAttestationCaseNumberFillResponse")
public class VakAcademicAttestationCaseNumberFillResponse {

    @XmlElement(name = "VakAcademicAttestationCaseNumberFillResult")
    protected int vakAcademicAttestationCaseNumberFillResult;

    /**
     * Gets the value of the vakAcademicAttestationCaseNumberFillResult property.
     * 
     */
    public int getVakAcademicAttestationCaseNumberFillResult() {
        return vakAcademicAttestationCaseNumberFillResult;
    }

    /**
     * Sets the value of the vakAcademicAttestationCaseNumberFillResult property.
     * 
     */
    public void setVakAcademicAttestationCaseNumberFillResult(int value) {
        this.vakAcademicAttestationCaseNumberFillResult = value;
    }

}
