
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
 *         &lt;element name="AcademicReportsSpecGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicReportsSpec" minOccurs="0"/>
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
    "academicReportsSpecGetResult"
})
@XmlRootElement(name = "AcademicReportsSpecGetResponse")
public class AcademicReportsSpecGetResponse {

    @XmlElement(name = "AcademicReportsSpecGetResult")
    protected ArrayOfDAcademicReportsSpec academicReportsSpecGetResult;

    /**
     * Gets the value of the academicReportsSpecGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicReportsSpec }
     *     
     */
    public ArrayOfDAcademicReportsSpec getAcademicReportsSpecGetResult() {
        return academicReportsSpecGetResult;
    }

    /**
     * Sets the value of the academicReportsSpecGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicReportsSpec }
     *     
     */
    public void setAcademicReportsSpecGetResult(ArrayOfDAcademicReportsSpec value) {
        this.academicReportsSpecGetResult = value;
    }

}
