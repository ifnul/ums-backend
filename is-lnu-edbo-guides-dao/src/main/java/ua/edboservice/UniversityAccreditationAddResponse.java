
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
 *         &lt;element name="UniversityAccreditationAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityAccreditationAddResult"
})
@XmlRootElement(name = "UniversityAccreditationAddResponse")
public class UniversityAccreditationAddResponse {

    @XmlElement(name = "UniversityAccreditationAddResult")
    protected int universityAccreditationAddResult;

    /**
     * Gets the value of the universityAccreditationAddResult property.
     * 
     */
    public int getUniversityAccreditationAddResult() {
        return universityAccreditationAddResult;
    }

    /**
     * Sets the value of the universityAccreditationAddResult property.
     * 
     */
    public void setUniversityAccreditationAddResult(int value) {
        this.universityAccreditationAddResult = value;
    }

}
