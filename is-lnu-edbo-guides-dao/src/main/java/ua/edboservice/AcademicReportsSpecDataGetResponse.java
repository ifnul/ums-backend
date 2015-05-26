
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
 *         &lt;element name="AcademicReportsSpecDataGetResult" type="{http://edboservice.ua/}ArrayOfDAcademicReportsSpecData" minOccurs="0"/>
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
    "academicReportsSpecDataGetResult"
})
@XmlRootElement(name = "AcademicReportsSpecDataGetResponse")
public class AcademicReportsSpecDataGetResponse {

    @XmlElement(name = "AcademicReportsSpecDataGetResult")
    protected ArrayOfDAcademicReportsSpecData academicReportsSpecDataGetResult;

    /**
     * Gets the value of the academicReportsSpecDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDAcademicReportsSpecData }
     *     
     */
    public ArrayOfDAcademicReportsSpecData getAcademicReportsSpecDataGetResult() {
        return academicReportsSpecDataGetResult;
    }

    /**
     * Sets the value of the academicReportsSpecDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDAcademicReportsSpecData }
     *     
     */
    public void setAcademicReportsSpecDataGetResult(ArrayOfDAcademicReportsSpecData value) {
        this.academicReportsSpecDataGetResult = value;
    }

}
