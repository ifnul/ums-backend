
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
 *         &lt;element name="UniversityImportDocTypeGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityImportDocType" minOccurs="0"/>
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
    "universityImportDocTypeGetResult"
})
@XmlRootElement(name = "UniversityImportDocTypeGetResponse")
public class UniversityImportDocTypeGetResponse {

    @XmlElement(name = "UniversityImportDocTypeGetResult")
    protected ArrayOfDUniversityImportDocType universityImportDocTypeGetResult;

    /**
     * Gets the value of the universityImportDocTypeGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityImportDocType }
     *     
     */
    public ArrayOfDUniversityImportDocType getUniversityImportDocTypeGetResult() {
        return universityImportDocTypeGetResult;
    }

    /**
     * Sets the value of the universityImportDocTypeGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityImportDocType }
     *     
     */
    public void setUniversityImportDocTypeGetResult(ArrayOfDUniversityImportDocType value) {
        this.universityImportDocTypeGetResult = value;
    }

}
