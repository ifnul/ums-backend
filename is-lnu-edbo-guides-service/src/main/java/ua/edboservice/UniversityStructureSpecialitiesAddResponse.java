
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
 *         &lt;element name="UniversityStructureSpecialitiesAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityStructureSpecialitiesAddResult"
})
@XmlRootElement(name = "UniversityStructureSpecialitiesAddResponse")
public class UniversityStructureSpecialitiesAddResponse {

    @XmlElement(name = "UniversityStructureSpecialitiesAddResult")
    protected int universityStructureSpecialitiesAddResult;

    /**
     * Gets the value of the universityStructureSpecialitiesAddResult property.
     * 
     */
    public int getUniversityStructureSpecialitiesAddResult() {
        return universityStructureSpecialitiesAddResult;
    }

    /**
     * Sets the value of the universityStructureSpecialitiesAddResult property.
     * 
     */
    public void setUniversityStructureSpecialitiesAddResult(int value) {
        this.universityStructureSpecialitiesAddResult = value;
    }

}
