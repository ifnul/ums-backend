
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
 *         &lt;element name="PersonEducationsStatusChangeCorrectAcademicYearResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "personEducationsStatusChangeCorrectAcademicYearResult"
})
@XmlRootElement(name = "PersonEducationsStatusChangeCorrectAcademicYearResponse")
public class PersonEducationsStatusChangeCorrectAcademicYearResponse {

    @XmlElement(name = "PersonEducationsStatusChangeCorrectAcademicYearResult")
    protected String personEducationsStatusChangeCorrectAcademicYearResult;

    /**
     * Gets the value of the personEducationsStatusChangeCorrectAcademicYearResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationsStatusChangeCorrectAcademicYearResult() {
        return personEducationsStatusChangeCorrectAcademicYearResult;
    }

    /**
     * Sets the value of the personEducationsStatusChangeCorrectAcademicYearResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationsStatusChangeCorrectAcademicYearResult(String value) {
        this.personEducationsStatusChangeCorrectAcademicYearResult = value;
    }

}
