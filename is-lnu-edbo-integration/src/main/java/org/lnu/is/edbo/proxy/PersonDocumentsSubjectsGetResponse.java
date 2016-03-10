
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
 *         &lt;element name="PersonDocumentsSubjectsGetResult" type="{http://edboservice.ua/}ArrayOfDPersonDocumentsSubjects" minOccurs="0"/>
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
    "personDocumentsSubjectsGetResult"
})
@XmlRootElement(name = "PersonDocumentsSubjectsGetResponse")
public class PersonDocumentsSubjectsGetResponse {

    @XmlElement(name = "PersonDocumentsSubjectsGetResult")
    protected ArrayOfDPersonDocumentsSubjects personDocumentsSubjectsGetResult;

    /**
     * Gets the value of the personDocumentsSubjectsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDPersonDocumentsSubjects }
     *     
     */
    public ArrayOfDPersonDocumentsSubjects getPersonDocumentsSubjectsGetResult() {
        return personDocumentsSubjectsGetResult;
    }

    /**
     * Sets the value of the personDocumentsSubjectsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDPersonDocumentsSubjects }
     *     
     */
    public void setPersonDocumentsSubjectsGetResult(ArrayOfDPersonDocumentsSubjects value) {
        this.personDocumentsSubjectsGetResult = value;
    }

}
