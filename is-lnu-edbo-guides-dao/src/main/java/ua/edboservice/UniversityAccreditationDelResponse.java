
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
 *         &lt;element name="UniversityAccreditationDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityAccreditationDelResult"
})
@XmlRootElement(name = "UniversityAccreditationDelResponse")
public class UniversityAccreditationDelResponse {

    @XmlElement(name = "UniversityAccreditationDelResult")
    protected int universityAccreditationDelResult;

    /**
     * Gets the value of the universityAccreditationDelResult property.
     * 
     */
    public int getUniversityAccreditationDelResult() {
        return universityAccreditationDelResult;
    }

    /**
     * Sets the value of the universityAccreditationDelResult property.
     * 
     */
    public void setUniversityAccreditationDelResult(int value) {
        this.universityAccreditationDelResult = value;
    }

}
