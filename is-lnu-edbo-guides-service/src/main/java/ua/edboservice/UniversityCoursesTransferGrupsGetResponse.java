
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
 *         &lt;element name="UniversityCoursesTransferGrupsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityCoursesTransferGrups" minOccurs="0"/>
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
    "universityCoursesTransferGrupsGetResult"
})
@XmlRootElement(name = "UniversityCoursesTransferGrupsGetResponse")
public class UniversityCoursesTransferGrupsGetResponse {

    @XmlElement(name = "UniversityCoursesTransferGrupsGetResult")
    protected ArrayOfDUniversityCoursesTransferGrups universityCoursesTransferGrupsGetResult;

    /**
     * Gets the value of the universityCoursesTransferGrupsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityCoursesTransferGrups }
     *     
     */
    public ArrayOfDUniversityCoursesTransferGrups getUniversityCoursesTransferGrupsGetResult() {
        return universityCoursesTransferGrupsGetResult;
    }

    /**
     * Sets the value of the universityCoursesTransferGrupsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityCoursesTransferGrups }
     *     
     */
    public void setUniversityCoursesTransferGrupsGetResult(ArrayOfDUniversityCoursesTransferGrups value) {
        this.universityCoursesTransferGrupsGetResult = value;
    }

}
