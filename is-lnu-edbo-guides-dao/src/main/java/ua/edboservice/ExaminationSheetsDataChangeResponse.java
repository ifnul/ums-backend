
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
 *         &lt;element name="ExaminationSheetsDataChangeResult" type="{http://edboservice.ua/}ArrayOfDExaminationSheetsDataReturn" minOccurs="0"/>
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
    "examinationSheetsDataChangeResult"
})
@XmlRootElement(name = "ExaminationSheetsDataChangeResponse")
public class ExaminationSheetsDataChangeResponse {

    @XmlElement(name = "ExaminationSheetsDataChangeResult")
    protected ArrayOfDExaminationSheetsDataReturn examinationSheetsDataChangeResult;

    /**
     * Gets the value of the examinationSheetsDataChangeResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDExaminationSheetsDataReturn }
     *     
     */
    public ArrayOfDExaminationSheetsDataReturn getExaminationSheetsDataChangeResult() {
        return examinationSheetsDataChangeResult;
    }

    /**
     * Sets the value of the examinationSheetsDataChangeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDExaminationSheetsDataReturn }
     *     
     */
    public void setExaminationSheetsDataChangeResult(ArrayOfDExaminationSheetsDataReturn value) {
        this.examinationSheetsDataChangeResult = value;
    }

}
