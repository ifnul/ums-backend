
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
 *         &lt;element name="UniversityStructureSpecialitiesHierarcareGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityStructureSpecialitiesHierarcare" minOccurs="0"/>
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
    "universityStructureSpecialitiesHierarcareGetResult"
})
@XmlRootElement(name = "UniversityStructureSpecialitiesHierarcareGetResponse")
public class UniversityStructureSpecialitiesHierarcareGetResponse {

    @XmlElement(name = "UniversityStructureSpecialitiesHierarcareGetResult")
    protected ArrayOfDUniversityStructureSpecialitiesHierarcare universityStructureSpecialitiesHierarcareGetResult;

    /**
     * Gets the value of the universityStructureSpecialitiesHierarcareGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityStructureSpecialitiesHierarcare }
     *     
     */
    public ArrayOfDUniversityStructureSpecialitiesHierarcare getUniversityStructureSpecialitiesHierarcareGetResult() {
        return universityStructureSpecialitiesHierarcareGetResult;
    }

    /**
     * Sets the value of the universityStructureSpecialitiesHierarcareGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityStructureSpecialitiesHierarcare }
     *     
     */
    public void setUniversityStructureSpecialitiesHierarcareGetResult(ArrayOfDUniversityStructureSpecialitiesHierarcare value) {
        this.universityStructureSpecialitiesHierarcareGetResult = value;
    }

}
