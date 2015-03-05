
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
 *         &lt;element name="ExaminationSheetExamenTypesGetResult" type="{http://edboservice.ua/}ArrayOfDExaminationSheetExamenTypes" minOccurs="0"/>
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
    "examinationSheetExamenTypesGetResult"
})
@XmlRootElement(name = "ExaminationSheetExamenTypesGetResponse")
public class ExaminationSheetExamenTypesGetResponse {

    @XmlElement(name = "ExaminationSheetExamenTypesGetResult")
    protected ArrayOfDExaminationSheetExamenTypes examinationSheetExamenTypesGetResult;

    /**
     * Gets the value of the examinationSheetExamenTypesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDExaminationSheetExamenTypes }
     *     
     */
    public ArrayOfDExaminationSheetExamenTypes getExaminationSheetExamenTypesGetResult() {
        return examinationSheetExamenTypesGetResult;
    }

    /**
     * Sets the value of the examinationSheetExamenTypesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDExaminationSheetExamenTypes }
     *     
     */
    public void setExaminationSheetExamenTypesGetResult(ArrayOfDExaminationSheetExamenTypes value) {
        this.examinationSheetExamenTypesGetResult = value;
    }

}
