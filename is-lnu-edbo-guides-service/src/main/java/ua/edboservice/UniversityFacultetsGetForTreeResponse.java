
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
 *         &lt;element name="UniversityFacultetsGetForTreeResult" type="{http://edboservice.ua/}ArrayOfDUniversityFacultetsForTree" minOccurs="0"/>
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
    "universityFacultetsGetForTreeResult"
})
@XmlRootElement(name = "UniversityFacultetsGetForTreeResponse")
public class UniversityFacultetsGetForTreeResponse {

    @XmlElement(name = "UniversityFacultetsGetForTreeResult")
    protected ArrayOfDUniversityFacultetsForTree universityFacultetsGetForTreeResult;

    /**
     * Gets the value of the universityFacultetsGetForTreeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityFacultetsForTree }
     *     
     */
    public ArrayOfDUniversityFacultetsForTree getUniversityFacultetsGetForTreeResult() {
        return universityFacultetsGetForTreeResult;
    }

    /**
     * Sets the value of the universityFacultetsGetForTreeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityFacultetsForTree }
     *     
     */
    public void setUniversityFacultetsGetForTreeResult(ArrayOfDUniversityFacultetsForTree value) {
        this.universityFacultetsGetForTreeResult = value;
    }

}
