
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
 *         &lt;element name="AcademicCouncilPersonsAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicCouncilPersonsAddResult"
})
@XmlRootElement(name = "AcademicCouncilPersonsAddResponse")
public class AcademicCouncilPersonsAddResponse {

    @XmlElement(name = "AcademicCouncilPersonsAddResult")
    protected int academicCouncilPersonsAddResult;

    /**
     * Gets the value of the academicCouncilPersonsAddResult property.
     * 
     */
    public int getAcademicCouncilPersonsAddResult() {
        return academicCouncilPersonsAddResult;
    }

    /**
     * Sets the value of the academicCouncilPersonsAddResult property.
     * 
     */
    public void setAcademicCouncilPersonsAddResult(int value) {
        this.academicCouncilPersonsAddResult = value;
    }

}
