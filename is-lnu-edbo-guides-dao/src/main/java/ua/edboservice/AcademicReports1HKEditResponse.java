
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
 *         &lt;element name="AcademicReports1HKEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicReports1HKEditResult"
})
@XmlRootElement(name = "AcademicReports1HKEditResponse")
public class AcademicReports1HKEditResponse {

    @XmlElement(name = "AcademicReports1HKEditResult")
    protected int academicReports1HKEditResult;

    /**
     * Gets the value of the academicReports1HKEditResult property.
     * 
     */
    public int getAcademicReports1HKEditResult() {
        return academicReports1HKEditResult;
    }

    /**
     * Sets the value of the academicReports1HKEditResult property.
     * 
     */
    public void setAcademicReports1HKEditResult(int value) {
        this.academicReports1HKEditResult = value;
    }

}
