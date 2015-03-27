
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
 *         &lt;element name="AcademicReports8DAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicReports8DAddResult"
})
@XmlRootElement(name = "AcademicReports8DAddResponse")
public class AcademicReports8DAddResponse {

    @XmlElement(name = "AcademicReports8DAddResult")
    protected int academicReports8DAddResult;

    /**
     * Gets the value of the academicReports8DAddResult property.
     * 
     */
    public int getAcademicReports8DAddResult() {
        return academicReports8DAddResult;
    }

    /**
     * Sets the value of the academicReports8DAddResult property.
     * 
     */
    public void setAcademicReports8DAddResult(int value) {
        this.academicReports8DAddResult = value;
    }

}
