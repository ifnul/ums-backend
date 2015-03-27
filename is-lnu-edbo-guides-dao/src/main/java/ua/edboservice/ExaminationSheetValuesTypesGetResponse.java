
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
 *         &lt;element name="ExaminationSheetValuesTypesGetResult" type="{http://edboservice.ua/}ArrayOfDExaminationSheetValuesTypes" minOccurs="0"/>
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
    "examinationSheetValuesTypesGetResult"
})
@XmlRootElement(name = "ExaminationSheetValuesTypesGetResponse")
public class ExaminationSheetValuesTypesGetResponse {

    @XmlElement(name = "ExaminationSheetValuesTypesGetResult")
    protected ArrayOfDExaminationSheetValuesTypes examinationSheetValuesTypesGetResult;

    /**
     * Gets the value of the examinationSheetValuesTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDExaminationSheetValuesTypes }
     *     
     */
    public ArrayOfDExaminationSheetValuesTypes getExaminationSheetValuesTypesGetResult() {
        return examinationSheetValuesTypesGetResult;
    }

    /**
     * Sets the value of the examinationSheetValuesTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDExaminationSheetValuesTypes }
     *     
     */
    public void setExaminationSheetValuesTypesGetResult(ArrayOfDExaminationSheetValuesTypes value) {
        this.examinationSheetValuesTypesGetResult = value;
    }

}
