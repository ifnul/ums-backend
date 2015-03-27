
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
 *         &lt;element name="UniversityBuildingAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityBuildingAddResult"
})
@XmlRootElement(name = "UniversityBuildingAddResponse")
public class UniversityBuildingAddResponse {

    @XmlElement(name = "UniversityBuildingAddResult")
    protected int universityBuildingAddResult;

    /**
     * Gets the value of the universityBuildingAddResult property.
     * 
     */
    public int getUniversityBuildingAddResult() {
        return universityBuildingAddResult;
    }

    /**
     * Sets the value of the universityBuildingAddResult property.
     * 
     */
    public void setUniversityBuildingAddResult(int value) {
        this.universityBuildingAddResult = value;
    }

}
