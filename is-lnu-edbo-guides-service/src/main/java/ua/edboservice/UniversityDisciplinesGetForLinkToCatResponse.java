
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
 *         &lt;element name="UniversityDisciplinesGetForLinkToCatResult" type="{http://edboservice.ua/}ArrayOfDUniversityDisciplineForLinkToCat" minOccurs="0"/>
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
    "universityDisciplinesGetForLinkToCatResult"
})
@XmlRootElement(name = "UniversityDisciplinesGetForLinkToCatResponse")
public class UniversityDisciplinesGetForLinkToCatResponse {

    @XmlElement(name = "UniversityDisciplinesGetForLinkToCatResult")
    protected ArrayOfDUniversityDisciplineForLinkToCat universityDisciplinesGetForLinkToCatResult;

    /**
     * Gets the value of the universityDisciplinesGetForLinkToCatResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityDisciplineForLinkToCat }
     *     
     */
    public ArrayOfDUniversityDisciplineForLinkToCat getUniversityDisciplinesGetForLinkToCatResult() {
        return universityDisciplinesGetForLinkToCatResult;
    }

    /**
     * Sets the value of the universityDisciplinesGetForLinkToCatResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityDisciplineForLinkToCat }
     *     
     */
    public void setUniversityDisciplinesGetForLinkToCatResult(ArrayOfDUniversityDisciplineForLinkToCat value) {
        this.universityDisciplinesGetForLinkToCatResult = value;
    }

}
