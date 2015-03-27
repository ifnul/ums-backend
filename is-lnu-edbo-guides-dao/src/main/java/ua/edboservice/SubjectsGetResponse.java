
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
 *         &lt;element name="SubjectsGetResult" type="{http://edboservice.ua/}ArrayOfDSubjects" minOccurs="0"/>
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
    "subjectsGetResult"
})
@XmlRootElement(name = "SubjectsGetResponse")
public class SubjectsGetResponse {

    @XmlElement(name = "SubjectsGetResult")
    protected ArrayOfDSubjects subjectsGetResult;

    /**
     * Gets the value of the subjectsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDSubjects }
     *     
     */
    public ArrayOfDSubjects getSubjectsGetResult() {
        return subjectsGetResult;
    }

    /**
     * Sets the value of the subjectsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDSubjects }
     *     
     */
    public void setSubjectsGetResult(ArrayOfDSubjects value) {
        this.subjectsGetResult = value;
    }

}
