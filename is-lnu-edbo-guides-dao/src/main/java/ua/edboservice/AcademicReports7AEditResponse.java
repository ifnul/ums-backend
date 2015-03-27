
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
 *         &lt;element name="AcademicReports7AEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicReports7AEditResult"
})
@XmlRootElement(name = "AcademicReports7AEditResponse")
public class AcademicReports7AEditResponse {

    @XmlElement(name = "AcademicReports7AEditResult")
    protected int academicReports7AEditResult;

    /**
     * Gets the value of the academicReports7AEditResult property.
     * 
     */
    public int getAcademicReports7AEditResult() {
        return academicReports7AEditResult;
    }

    /**
     * Sets the value of the academicReports7AEditResult property.
     * 
     */
    public void setAcademicReports7AEditResult(int value) {
        this.academicReports7AEditResult = value;
    }

}
