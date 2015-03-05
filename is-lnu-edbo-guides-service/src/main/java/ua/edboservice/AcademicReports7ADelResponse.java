
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
 *         &lt;element name="AcademicReports7ADelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicReports7ADelResult"
})
@XmlRootElement(name = "AcademicReports7ADelResponse")
public class AcademicReports7ADelResponse {

    @XmlElement(name = "AcademicReports7ADelResult")
    protected int academicReports7ADelResult;

    /**
     * Gets the value of the academicReports7ADelResult property.
     * 
     */
    public int getAcademicReports7ADelResult() {
        return academicReports7ADelResult;
    }

    /**
     * Sets the value of the academicReports7ADelResult property.
     * 
     */
    public void setAcademicReports7ADelResult(int value) {
        this.academicReports7ADelResult = value;
    }

}
