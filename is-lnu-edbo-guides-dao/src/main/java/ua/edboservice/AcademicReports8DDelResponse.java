
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
 *         &lt;element name="AcademicReports8DDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicReports8DDelResult"
})
@XmlRootElement(name = "AcademicReports8DDelResponse")
public class AcademicReports8DDelResponse {

    @XmlElement(name = "AcademicReports8DDelResult")
    protected int academicReports8DDelResult;

    /**
     * Gets the value of the academicReports8DDelResult property.
     * 
     */
    public int getAcademicReports8DDelResult() {
        return academicReports8DDelResult;
    }

    /**
     * Sets the value of the academicReports8DDelResult property.
     * 
     */
    public void setAcademicReports8DDelResult(int value) {
        this.academicReports8DDelResult = value;
    }

}
