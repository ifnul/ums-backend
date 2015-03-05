
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
 *         &lt;element name="UniversityChangesGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityChanges" minOccurs="0"/>
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
    "universityChangesGetResult"
})
@XmlRootElement(name = "UniversityChangesGetResponse")
public class UniversityChangesGetResponse {

    @XmlElement(name = "UniversityChangesGetResult")
    protected ArrayOfDUniversityChanges universityChangesGetResult;

    /**
     * Gets the value of the universityChangesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityChanges }
     *     
     */
    public ArrayOfDUniversityChanges getUniversityChangesGetResult() {
        return universityChangesGetResult;
    }

    /**
     * Sets the value of the universityChangesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityChanges }
     *     
     */
    public void setUniversityChangesGetResult(ArrayOfDUniversityChanges value) {
        this.universityChangesGetResult = value;
    }

}
