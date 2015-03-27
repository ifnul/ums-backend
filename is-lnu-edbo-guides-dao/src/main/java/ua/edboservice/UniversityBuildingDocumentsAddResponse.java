
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
 *         &lt;element name="UniversityBuildingDocumentsAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityBuildingDocumentsAddResult"
})
@XmlRootElement(name = "UniversityBuildingDocumentsAddResponse")
public class UniversityBuildingDocumentsAddResponse {

    @XmlElement(name = "UniversityBuildingDocumentsAddResult")
    protected int universityBuildingDocumentsAddResult;

    /**
     * Gets the value of the universityBuildingDocumentsAddResult property.
     * 
     */
    public int getUniversityBuildingDocumentsAddResult() {
        return universityBuildingDocumentsAddResult;
    }

    /**
     * Sets the value of the universityBuildingDocumentsAddResult property.
     * 
     */
    public void setUniversityBuildingDocumentsAddResult(int value) {
        this.universityBuildingDocumentsAddResult = value;
    }

}
