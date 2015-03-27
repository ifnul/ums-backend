
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
 *         &lt;element name="AcademicRankTypeGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicRankType" minOccurs="0"/>
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
    "academicRankTypeGetResult"
})
@XmlRootElement(name = "AcademicRankTypeGetResponse")
public class AcademicRankTypeGetResponse {

    @XmlElement(name = "AcademicRankTypeGetResult")
    protected ArrayOfDAcademicRankType academicRankTypeGetResult;

    /**
     * Gets the value of the academicRankTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicRankType }
     *     
     */
    public ArrayOfDAcademicRankType getAcademicRankTypeGetResult() {
        return academicRankTypeGetResult;
    }

    /**
     * Sets the value of the academicRankTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicRankType }
     *     
     */
    public void setAcademicRankTypeGetResult(ArrayOfDAcademicRankType value) {
        this.academicRankTypeGetResult = value;
    }

}
