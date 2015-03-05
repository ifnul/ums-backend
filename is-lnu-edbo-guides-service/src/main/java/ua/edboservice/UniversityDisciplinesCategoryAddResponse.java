
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
 *         &lt;element name="UniversityDisciplinesCategoryAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityDisciplinesCategoryAddResult"
})
@XmlRootElement(name = "UniversityDisciplinesCategoryAddResponse")
public class UniversityDisciplinesCategoryAddResponse {

    @XmlElement(name = "UniversityDisciplinesCategoryAddResult")
    protected int universityDisciplinesCategoryAddResult;

    /**
     * Gets the value of the universityDisciplinesCategoryAddResult property.
     * 
     */
    public int getUniversityDisciplinesCategoryAddResult() {
        return universityDisciplinesCategoryAddResult;
    }

    /**
     * Sets the value of the universityDisciplinesCategoryAddResult property.
     * 
     */
    public void setUniversityDisciplinesCategoryAddResult(int value) {
        this.universityDisciplinesCategoryAddResult = value;
    }

}
