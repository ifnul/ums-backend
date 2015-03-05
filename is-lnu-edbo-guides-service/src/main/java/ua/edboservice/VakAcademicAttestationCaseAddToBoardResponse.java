
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
 *         &lt;element name="VakAcademicAttestationCaseAddToBoardResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "vakAcademicAttestationCaseAddToBoardResult"
})
@XmlRootElement(name = "VakAcademicAttestationCaseAddToBoardResponse")
public class VakAcademicAttestationCaseAddToBoardResponse {

    @XmlElement(name = "VakAcademicAttestationCaseAddToBoardResult")
    protected int vakAcademicAttestationCaseAddToBoardResult;

    /**
     * Gets the value of the vakAcademicAttestationCaseAddToBoardResult property.
     * 
     */
    public int getVakAcademicAttestationCaseAddToBoardResult() {
        return vakAcademicAttestationCaseAddToBoardResult;
    }

    /**
     * Sets the value of the vakAcademicAttestationCaseAddToBoardResult property.
     * 
     */
    public void setVakAcademicAttestationCaseAddToBoardResult(int value) {
        this.vakAcademicAttestationCaseAddToBoardResult = value;
    }

}
