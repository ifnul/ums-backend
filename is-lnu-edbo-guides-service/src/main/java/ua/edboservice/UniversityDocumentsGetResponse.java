
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
 *         &lt;element name="UniversityDocumentsGetResult" type="{http://edboservice.ua/}ArrayOfDUniversityDocuments" minOccurs="0"/>
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
    "universityDocumentsGetResult"
})
@XmlRootElement(name = "UniversityDocumentsGetResponse")
public class UniversityDocumentsGetResponse {

    @XmlElement(name = "UniversityDocumentsGetResult")
    protected ArrayOfDUniversityDocuments universityDocumentsGetResult;

    /**
     * Gets the value of the universityDocumentsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUniversityDocuments }
     *     
     */
    public ArrayOfDUniversityDocuments getUniversityDocumentsGetResult() {
        return universityDocumentsGetResult;
    }

    /**
     * Sets the value of the universityDocumentsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUniversityDocuments }
     *     
     */
    public void setUniversityDocumentsGetResult(ArrayOfDUniversityDocuments value) {
        this.universityDocumentsGetResult = value;
    }

}
