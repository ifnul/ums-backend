
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
 *         &lt;element name="AcademicReportsSpecDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicReportsSpecDelResult"
})
@XmlRootElement(name = "AcademicReportsSpecDelResponse")
public class AcademicReportsSpecDelResponse {

    @XmlElement(name = "AcademicReportsSpecDelResult")
    protected int academicReportsSpecDelResult;

    /**
     * Gets the value of the academicReportsSpecDelResult property.
     * 
     */
    public int getAcademicReportsSpecDelResult() {
        return academicReportsSpecDelResult;
    }

    /**
     * Sets the value of the academicReportsSpecDelResult property.
     * 
     */
    public void setAcademicReportsSpecDelResult(int value) {
        this.academicReportsSpecDelResult = value;
    }

}
