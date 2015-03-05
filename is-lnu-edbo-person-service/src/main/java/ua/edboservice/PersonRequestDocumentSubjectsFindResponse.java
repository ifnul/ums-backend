
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
 *         &lt;element name="PersonRequestDocumentSubjectsFindResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestDocumentSubjectsFind" minOccurs="0"/>
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
    "personRequestDocumentSubjectsFindResult"
})
@XmlRootElement(name = "PersonRequestDocumentSubjectsFindResponse")
public class PersonRequestDocumentSubjectsFindResponse {

    @XmlElement(name = "PersonRequestDocumentSubjectsFindResult")
    protected ArrayOfDPersonRequestDocumentSubjectsFind personRequestDocumentSubjectsFindResult;

    /**
     * Gets the value of the personRequestDocumentSubjectsFindResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestDocumentSubjectsFind }
     *     
     */
    public ArrayOfDPersonRequestDocumentSubjectsFind getPersonRequestDocumentSubjectsFindResult() {
        return personRequestDocumentSubjectsFindResult;
    }

    /**
     * Sets the value of the personRequestDocumentSubjectsFindResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestDocumentSubjectsFind }
     *     
     */
    public void setPersonRequestDocumentSubjectsFindResult(ArrayOfDPersonRequestDocumentSubjectsFind value) {
        this.personRequestDocumentSubjectsFindResult = value;
    }

}
