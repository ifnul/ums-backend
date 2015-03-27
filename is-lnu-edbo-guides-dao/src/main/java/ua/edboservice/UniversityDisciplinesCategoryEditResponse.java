
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
 *         &lt;element name="UniversityDisciplinesCategoryEditResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityDisciplinesCategoryEditResult"
})
@XmlRootElement(name = "UniversityDisciplinesCategoryEditResponse")
public class UniversityDisciplinesCategoryEditResponse {

    @XmlElement(name = "UniversityDisciplinesCategoryEditResult")
    protected int universityDisciplinesCategoryEditResult;

    /**
     * Gets the value of the universityDisciplinesCategoryEditResult property.
     * 
     */
    public int getUniversityDisciplinesCategoryEditResult() {
        return universityDisciplinesCategoryEditResult;
    }

    /**
     * Sets the value of the universityDisciplinesCategoryEditResult property.
     * 
     */
    public void setUniversityDisciplinesCategoryEditResult(int value) {
        this.universityDisciplinesCategoryEditResult = value;
    }

}
