
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
 *         &lt;element name="UniversityBuildingPasportsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityBuildingPasports" minOccurs="0"/>
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
    "universityBuildingPasportsGetResult"
})
@XmlRootElement(name = "UniversityBuildingPasportsGetResponse")
public class UniversityBuildingPasportsGetResponse {

    @XmlElement(name = "UniversityBuildingPasportsGetResult")
    protected ArrayOfDUniversityBuildingPasports universityBuildingPasportsGetResult;

    /**
     * Gets the value of the universityBuildingPasportsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityBuildingPasports }
     *     
     */
    public ArrayOfDUniversityBuildingPasports getUniversityBuildingPasportsGetResult() {
        return universityBuildingPasportsGetResult;
    }

    /**
     * Sets the value of the universityBuildingPasportsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityBuildingPasports }
     *     
     */
    public void setUniversityBuildingPasportsGetResult(ArrayOfDUniversityBuildingPasports value) {
        this.universityBuildingPasportsGetResult = value;
    }

}
