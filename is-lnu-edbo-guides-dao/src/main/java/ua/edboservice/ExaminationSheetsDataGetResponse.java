
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
 *         &lt;element name="ExaminationSheetsDataGetResult" type="{http://edboservice.ua/}ArrayOfDExaminationSheetsData" minOccurs="0"/>
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
    "examinationSheetsDataGetResult"
})
@XmlRootElement(name = "ExaminationSheetsDataGetResponse")
public class ExaminationSheetsDataGetResponse {

    @XmlElement(name = "ExaminationSheetsDataGetResult")
    protected ArrayOfDExaminationSheetsData examinationSheetsDataGetResult;

    /**
     * Gets the value of the examinationSheetsDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDExaminationSheetsData }
     *     
     */
    public ArrayOfDExaminationSheetsData getExaminationSheetsDataGetResult() {
        return examinationSheetsDataGetResult;
    }

    /**
     * Sets the value of the examinationSheetsDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDExaminationSheetsData }
     *     
     */
    public void setExaminationSheetsDataGetResult(ArrayOfDExaminationSheetsData value) {
        this.examinationSheetsDataGetResult = value;
    }

}
