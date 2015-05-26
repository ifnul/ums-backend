
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
 *         &lt;element name="AcademicYearsAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "academicYearsAddResult"
})
@XmlRootElement(name = "AcademicYearsAddResponse")
public class AcademicYearsAddResponse {

    @XmlElement(name = "AcademicYearsAddResult")
    protected int academicYearsAddResult;

    /**
     * Gets the value of the academicYearsAddResult property.
     * 
     */
    public int getAcademicYearsAddResult() {
        return academicYearsAddResult;
    }

    /**
     * Sets the value of the academicYearsAddResult property.
     * 
     */
    public void setAcademicYearsAddResult(int value) {
        this.academicYearsAddResult = value;
    }

}
