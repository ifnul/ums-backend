
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
 *         &lt;element name="GraduatesDataDisciplinesGetResult" type="{http://edboservice.ua/}ArrayOfDGraduatesDataDisciplines" minOccurs="0"/>
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
    "graduatesDataDisciplinesGetResult"
})
@XmlRootElement(name = "GraduatesDataDisciplinesGetResponse")
public class GraduatesDataDisciplinesGetResponse {

    @XmlElement(name = "GraduatesDataDisciplinesGetResult")
    protected ArrayOfDGraduatesDataDisciplines graduatesDataDisciplinesGetResult;

    /**
     * Gets the value of the graduatesDataDisciplinesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGraduatesDataDisciplines }
     *     
     */
    public ArrayOfDGraduatesDataDisciplines getGraduatesDataDisciplinesGetResult() {
        return graduatesDataDisciplinesGetResult;
    }

    /**
     * Sets the value of the graduatesDataDisciplinesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGraduatesDataDisciplines }
     *     
     */
    public void setGraduatesDataDisciplinesGetResult(ArrayOfDGraduatesDataDisciplines value) {
        this.graduatesDataDisciplinesGetResult = value;
    }

}
