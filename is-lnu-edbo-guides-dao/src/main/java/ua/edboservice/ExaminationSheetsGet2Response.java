
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
 *         &lt;element name="ExaminationSheetsGet2Result" type="{http://edboservice.ua/}ArrayOfDExaminationSheets2" minOccurs="0"/>
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
    "examinationSheetsGet2Result"
})
@XmlRootElement(name = "ExaminationSheetsGet2Response")
public class ExaminationSheetsGet2Response {

    @XmlElement(name = "ExaminationSheetsGet2Result")
    protected ArrayOfDExaminationSheets2 examinationSheetsGet2Result;

    /**
     * Gets the value of the examinationSheetsGet2Result property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDExaminationSheets2 }
     *     
     */
    public ArrayOfDExaminationSheets2 getExaminationSheetsGet2Result() {
        return examinationSheetsGet2Result;
    }

    /**
     * Sets the value of the examinationSheetsGet2Result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDExaminationSheets2 }
     *     
     */
    public void setExaminationSheetsGet2Result(ArrayOfDExaminationSheets2 value) {
        this.examinationSheetsGet2Result = value;
    }

}
