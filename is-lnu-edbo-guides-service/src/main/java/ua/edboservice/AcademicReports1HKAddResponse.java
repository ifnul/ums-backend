
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
 *         &lt;element name="AcademicReports1HKAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicReports1HKAddResult"
})
@XmlRootElement(name = "AcademicReports1HKAddResponse")
public class AcademicReports1HKAddResponse {

    @XmlElement(name = "AcademicReports1HKAddResult")
    protected int academicReports1HKAddResult;

    /**
     * Gets the value of the academicReports1HKAddResult property.
     * 
     */
    public int getAcademicReports1HKAddResult() {
        return academicReports1HKAddResult;
    }

    /**
     * Sets the value of the academicReports1HKAddResult property.
     * 
     */
    public void setAcademicReports1HKAddResult(int value) {
        this.academicReports1HKAddResult = value;
    }

}
