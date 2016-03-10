
package org.lnu.is.edbo.proxy;

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
 *         &lt;element name="PersonRequestDocumentSubjectsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonRequestDocumentSubjects" minOccurs="0"/>
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
    "personRequestDocumentSubjectsGetResult"
})
@XmlRootElement(name = "PersonRequestDocumentSubjectsGetResponse")
public class PersonRequestDocumentSubjectsGetResponse {

    @XmlElement(name = "PersonRequestDocumentSubjectsGetResult")
    protected ArrayOfDPersonRequestDocumentSubjects personRequestDocumentSubjectsGetResult;

    /**
     * Gets the value of the personRequestDocumentSubjectsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonRequestDocumentSubjects }
     *     
     */
    public ArrayOfDPersonRequestDocumentSubjects getPersonRequestDocumentSubjectsGetResult() {
        return personRequestDocumentSubjectsGetResult;
    }

    /**
     * Sets the value of the personRequestDocumentSubjectsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonRequestDocumentSubjects }
     *     
     */
    public void setPersonRequestDocumentSubjectsGetResult(ArrayOfDPersonRequestDocumentSubjects value) {
        this.personRequestDocumentSubjectsGetResult = value;
    }

}
