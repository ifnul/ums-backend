
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
 *         &lt;element name="UniversityFacultetSpecialityValueChangeResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityFacultetSpecialityValueChangeResult"
})
@XmlRootElement(name = "UniversityFacultetSpecialityValueChangeResponse")
public class UniversityFacultetSpecialityValueChangeResponse {

    @XmlElement(name = "UniversityFacultetSpecialityValueChangeResult")
    protected int universityFacultetSpecialityValueChangeResult;

    /**
     * Gets the value of the universityFacultetSpecialityValueChangeResult property.
     * 
     */
    public int getUniversityFacultetSpecialityValueChangeResult() {
        return universityFacultetSpecialityValueChangeResult;
    }

    /**
     * Sets the value of the universityFacultetSpecialityValueChangeResult property.
     * 
     */
    public void setUniversityFacultetSpecialityValueChangeResult(int value) {
        this.universityFacultetSpecialityValueChangeResult = value;
    }

}
