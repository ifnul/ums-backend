
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
 *         &lt;element name="ExaminationSheetsPersonDataGetResult" type="{http://edboservice.ua/}ArrayOfDExaminationSheetsPersonData" minOccurs="0"/>
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
    "examinationSheetsPersonDataGetResult"
})
@XmlRootElement(name = "ExaminationSheetsPersonDataGetResponse")
public class ExaminationSheetsPersonDataGetResponse {

    @XmlElement(name = "ExaminationSheetsPersonDataGetResult")
    protected ArrayOfDExaminationSheetsPersonData examinationSheetsPersonDataGetResult;

    /**
     * Gets the value of the examinationSheetsPersonDataGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDExaminationSheetsPersonData }
     *     
     */
    public ArrayOfDExaminationSheetsPersonData getExaminationSheetsPersonDataGetResult() {
        return examinationSheetsPersonDataGetResult;
    }

    /**
     * Sets the value of the examinationSheetsPersonDataGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDExaminationSheetsPersonData }
     *     
     */
    public void setExaminationSheetsPersonDataGetResult(ArrayOfDExaminationSheetsPersonData value) {
        this.examinationSheetsPersonDataGetResult = value;
    }

}
