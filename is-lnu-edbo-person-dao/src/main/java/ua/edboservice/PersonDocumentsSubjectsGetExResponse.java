
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
 *         &lt;element name="PersonDocumentsSubjectsGetExResult" type="{http://edboservice.ua/}ArrayOfDPersonDocumentsSubjectsEx" minOccurs="0"/>
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
    "personDocumentsSubjectsGetExResult"
})
@XmlRootElement(name = "PersonDocumentsSubjectsGetExResponse")
public class PersonDocumentsSubjectsGetExResponse {

    @XmlElement(name = "PersonDocumentsSubjectsGetExResult")
    protected ArrayOfDPersonDocumentsSubjectsEx personDocumentsSubjectsGetExResult;

    /**
     * Gets the value of the personDocumentsSubjectsGetExResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentsSubjectsEx }
     *     
     */
    public ArrayOfDPersonDocumentsSubjectsEx getPersonDocumentsSubjectsGetExResult() {
        return personDocumentsSubjectsGetExResult;
    }

    /**
     * Sets the value of the personDocumentsSubjectsGetExResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentsSubjectsEx }
     *     
     */
    public void setPersonDocumentsSubjectsGetExResult(ArrayOfDPersonDocumentsSubjectsEx value) {
        this.personDocumentsSubjectsGetExResult = value;
    }

}
