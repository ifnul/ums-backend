
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
 *         &lt;element name="AcademicReports1HKDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicReports1HKDelResult"
})
@XmlRootElement(name = "AcademicReports1HKDelResponse")
public class AcademicReports1HKDelResponse {

    @XmlElement(name = "AcademicReports1HKDelResult")
    protected int academicReports1HKDelResult;

    /**
     * Gets the value of the academicReports1HKDelResult property.
     * 
     */
    public int getAcademicReports1HKDelResult() {
        return academicReports1HKDelResult;
    }

    /**
     * Sets the value of the academicReports1HKDelResult property.
     * 
     */
    public void setAcademicReports1HKDelResult(int value) {
        this.academicReports1HKDelResult = value;
    }

}
