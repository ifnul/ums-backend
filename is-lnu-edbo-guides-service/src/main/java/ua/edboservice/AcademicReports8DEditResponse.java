
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
 *         &lt;element name="AcademicReports8DEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicReports8DEditResult"
})
@XmlRootElement(name = "AcademicReports8DEditResponse")
public class AcademicReports8DEditResponse {

    @XmlElement(name = "AcademicReports8DEditResult")
    protected int academicReports8DEditResult;

    /**
     * Gets the value of the academicReports8DEditResult property.
     * 
     */
    public int getAcademicReports8DEditResult() {
        return academicReports8DEditResult;
    }

    /**
     * Sets the value of the academicReports8DEditResult property.
     * 
     */
    public void setAcademicReports8DEditResult(int value) {
        this.academicReports8DEditResult = value;
    }

}
