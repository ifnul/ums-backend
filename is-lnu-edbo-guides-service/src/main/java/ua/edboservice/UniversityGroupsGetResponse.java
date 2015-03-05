
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
 *         &lt;element name="UniversityGroupsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityGroups" minOccurs="0"/>
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
    "universityGroupsGetResult"
})
@XmlRootElement(name = "UniversityGroupsGetResponse")
public class UniversityGroupsGetResponse {

    @XmlElement(name = "UniversityGroupsGetResult")
    protected ArrayOfDUniversityGroups universityGroupsGetResult;

    /**
     * Gets the value of the universityGroupsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityGroups }
     *     
     */
    public ArrayOfDUniversityGroups getUniversityGroupsGetResult() {
        return universityGroupsGetResult;
    }

    /**
     * Sets the value of the universityGroupsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityGroups }
     *     
     */
    public void setUniversityGroupsGetResult(ArrayOfDUniversityGroups value) {
        this.universityGroupsGetResult = value;
    }

}
