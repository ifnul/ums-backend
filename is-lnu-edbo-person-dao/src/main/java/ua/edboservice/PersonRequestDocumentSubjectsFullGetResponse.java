
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
 *         &lt;element name="PersonRequestDocumentSubjectsFullGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestDocumentSubjectsFull" minOccurs="0"/>
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
    "personRequestDocumentSubjectsFullGetResult"
})
@XmlRootElement(name = "PersonRequestDocumentSubjectsFullGetResponse")
public class PersonRequestDocumentSubjectsFullGetResponse {

    @XmlElement(name = "PersonRequestDocumentSubjectsFullGetResult")
    protected ArrayOfDPersonRequestDocumentSubjectsFull personRequestDocumentSubjectsFullGetResult;

    /**
     * Gets the value of the personRequestDocumentSubjectsFullGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestDocumentSubjectsFull }
     *     
     */
    public ArrayOfDPersonRequestDocumentSubjectsFull getPersonRequestDocumentSubjectsFullGetResult() {
        return personRequestDocumentSubjectsFullGetResult;
    }

    /**
     * Sets the value of the personRequestDocumentSubjectsFullGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestDocumentSubjectsFull }
     *     
     */
    public void setPersonRequestDocumentSubjectsFullGetResult(ArrayOfDPersonRequestDocumentSubjectsFull value) {
        this.personRequestDocumentSubjectsFullGetResult = value;
    }

}
