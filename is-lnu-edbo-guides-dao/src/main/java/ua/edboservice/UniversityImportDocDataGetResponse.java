
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
 *         &lt;element name="UniversityImportDocDataGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityImportDocData" minOccurs="0"/>
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
    "universityImportDocDataGetResult"
})
@XmlRootElement(name = "UniversityImportDocDataGetResponse")
public class UniversityImportDocDataGetResponse {

    @XmlElement(name = "UniversityImportDocDataGetResult")
    protected ArrayOfDUniversityImportDocData universityImportDocDataGetResult;

    /**
     * Gets the value of the universityImportDocDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityImportDocData }
     *     
     */
    public ArrayOfDUniversityImportDocData getUniversityImportDocDataGetResult() {
        return universityImportDocDataGetResult;
    }

    /**
     * Sets the value of the universityImportDocDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityImportDocData }
     *     
     */
    public void setUniversityImportDocDataGetResult(ArrayOfDUniversityImportDocData value) {
        this.universityImportDocDataGetResult = value;
    }

}
