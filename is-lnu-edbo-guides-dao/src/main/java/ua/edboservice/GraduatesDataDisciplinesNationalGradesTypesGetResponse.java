
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
 *         &lt;element name="GraduatesDataDisciplinesNationalGradesTypesGetResult" type="{http://edboservice.ua/}ArrayOfDGraduatesDataDisciplinesNationalGradesTypes" minOccurs="0"/>
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
    "graduatesDataDisciplinesNationalGradesTypesGetResult"
})
@XmlRootElement(name = "GraduatesDataDisciplinesNationalGradesTypesGetResponse")
public class GraduatesDataDisciplinesNationalGradesTypesGetResponse {

    @XmlElement(name = "GraduatesDataDisciplinesNationalGradesTypesGetResult")
    protected ArrayOfDGraduatesDataDisciplinesNationalGradesTypes graduatesDataDisciplinesNationalGradesTypesGetResult;

    /**
     * Gets the value of the graduatesDataDisciplinesNationalGradesTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDGraduatesDataDisciplinesNationalGradesTypes }
     *     
     */
    public ArrayOfDGraduatesDataDisciplinesNationalGradesTypes getGraduatesDataDisciplinesNationalGradesTypesGetResult() {
        return graduatesDataDisciplinesNationalGradesTypesGetResult;
    }

    /**
     * Sets the value of the graduatesDataDisciplinesNationalGradesTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDGraduatesDataDisciplinesNationalGradesTypes }
     *     
     */
    public void setGraduatesDataDisciplinesNationalGradesTypesGetResult(ArrayOfDGraduatesDataDisciplinesNationalGradesTypes value) {
        this.graduatesDataDisciplinesNationalGradesTypesGetResult = value;
    }

}
