
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
 *         &lt;element name="UniversityMemorandumsDelResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityMemorandumsDelResult"
})
@XmlRootElement(name = "UniversityMemorandumsDelResponse")
public class UniversityMemorandumsDelResponse {

    @XmlElement(name = "UniversityMemorandumsDelResult")
    protected int universityMemorandumsDelResult;

    /**
     * Gets the value of the universityMemorandumsDelResult property.
     * 
     */
    public int getUniversityMemorandumsDelResult() {
        return universityMemorandumsDelResult;
    }

    /**
     * Sets the value of the universityMemorandumsDelResult property.
     * 
     */
    public void setUniversityMemorandumsDelResult(int value) {
        this.universityMemorandumsDelResult = value;
    }

}
