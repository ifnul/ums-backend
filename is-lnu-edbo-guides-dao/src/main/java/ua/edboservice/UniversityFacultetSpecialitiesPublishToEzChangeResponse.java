
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
 *         &lt;element name="UniversityFacultetSpecialitiesPublishToEzChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityFacultetSpecialitiesPublishToEzChangeResult"
})
@XmlRootElement(name = "UniversityFacultetSpecialitiesPublishToEzChangeResponse")
public class UniversityFacultetSpecialitiesPublishToEzChangeResponse {

    @XmlElement(name = "UniversityFacultetSpecialitiesPublishToEzChangeResult")
    protected int universityFacultetSpecialitiesPublishToEzChangeResult;

    /**
     * Gets the value of the universityFacultetSpecialitiesPublishToEzChangeResult property.
     * 
     */
    public int getUniversityFacultetSpecialitiesPublishToEzChangeResult() {
        return universityFacultetSpecialitiesPublishToEzChangeResult;
    }

    /**
     * Sets the value of the universityFacultetSpecialitiesPublishToEzChangeResult property.
     * 
     */
    public void setUniversityFacultetSpecialitiesPublishToEzChangeResult(int value) {
        this.universityFacultetSpecialitiesPublishToEzChangeResult = value;
    }

}
