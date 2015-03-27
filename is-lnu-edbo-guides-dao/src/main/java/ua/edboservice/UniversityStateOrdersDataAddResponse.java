
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
 *         &lt;element name="UniversityStateOrdersDataAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityStateOrdersDataAddResult"
})
@XmlRootElement(name = "UniversityStateOrdersDataAddResponse")
public class UniversityStateOrdersDataAddResponse {

    @XmlElement(name = "UniversityStateOrdersDataAddResult")
    protected int universityStateOrdersDataAddResult;

    /**
     * Gets the value of the universityStateOrdersDataAddResult property.
     * 
     */
    public int getUniversityStateOrdersDataAddResult() {
        return universityStateOrdersDataAddResult;
    }

    /**
     * Sets the value of the universityStateOrdersDataAddResult property.
     * 
     */
    public void setUniversityStateOrdersDataAddResult(int value) {
        this.universityStateOrdersDataAddResult = value;
    }

}
