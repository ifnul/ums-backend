
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
 *         &lt;element name="AcademicCardsFindAcademicsResult" type="{http://edboservice.ua/}ArrayOfDAcademicCardsFindAcademics" minOccurs="0"/>
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
    "academicCardsFindAcademicsResult"
})
@XmlRootElement(name = "AcademicCardsFindAcademicsResponse")
public class AcademicCardsFindAcademicsResponse {

    @XmlElement(name = "AcademicCardsFindAcademicsResult")
    protected ArrayOfDAcademicCardsFindAcademics academicCardsFindAcademicsResult;

    /**
     * Gets the value of the academicCardsFindAcademicsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicCardsFindAcademics }
     *     
     */
    public ArrayOfDAcademicCardsFindAcademics getAcademicCardsFindAcademicsResult() {
        return academicCardsFindAcademicsResult;
    }

    /**
     * Sets the value of the academicCardsFindAcademicsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicCardsFindAcademics }
     *     
     */
    public void setAcademicCardsFindAcademicsResult(ArrayOfDAcademicCardsFindAcademics value) {
        this.academicCardsFindAcademicsResult = value;
    }

}
