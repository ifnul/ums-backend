
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
 *         &lt;element name="PersonDocumentsSubjectsFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonDocumentsSubjectsFull" minOccurs="0"/>
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
    "personDocumentsSubjectsFullGetResult"
})
@XmlRootElement(name = "PersonDocumentsSubjectsFullGetResponse")
public class PersonDocumentsSubjectsFullGetResponse {

    @XmlElement(name = "PersonDocumentsSubjectsFullGetResult")
    protected ArrayOfDPersonDocumentsSubjectsFull personDocumentsSubjectsFullGetResult;

    /**
     * Gets the value of the personDocumentsSubjectsFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentsSubjectsFull }
     *     
     */
    public ArrayOfDPersonDocumentsSubjectsFull getPersonDocumentsSubjectsFullGetResult() {
        return personDocumentsSubjectsFullGetResult;
    }

    /**
     * Sets the value of the personDocumentsSubjectsFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentsSubjectsFull }
     *     
     */
    public void setPersonDocumentsSubjectsFullGetResult(ArrayOfDPersonDocumentsSubjectsFull value) {
        this.personDocumentsSubjectsFullGetResult = value;
    }

}
