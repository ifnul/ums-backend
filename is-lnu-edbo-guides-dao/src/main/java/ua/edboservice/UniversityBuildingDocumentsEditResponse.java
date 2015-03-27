
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
 *         &lt;element name="UniversityBuildingDocumentsEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityBuildingDocumentsEditResult"
})
@XmlRootElement(name = "UniversityBuildingDocumentsEditResponse")
public class UniversityBuildingDocumentsEditResponse {

    @XmlElement(name = "UniversityBuildingDocumentsEditResult")
    protected int universityBuildingDocumentsEditResult;

    /**
     * Gets the value of the universityBuildingDocumentsEditResult property.
     * 
     */
    public int getUniversityBuildingDocumentsEditResult() {
        return universityBuildingDocumentsEditResult;
    }

    /**
     * Sets the value of the universityBuildingDocumentsEditResult property.
     * 
     */
    public void setUniversityBuildingDocumentsEditResult(int value) {
        this.universityBuildingDocumentsEditResult = value;
    }

}
