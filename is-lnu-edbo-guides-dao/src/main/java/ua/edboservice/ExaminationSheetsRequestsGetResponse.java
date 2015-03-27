
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
 *         &lt;element name="ExaminationSheetsRequestsGetResult" type="{http://edboservice.ua/}ArrayOfDExaminationSheetsRequests" minOccurs="0"/>
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
    "examinationSheetsRequestsGetResult"
})
@XmlRootElement(name = "ExaminationSheetsRequestsGetResponse")
public class ExaminationSheetsRequestsGetResponse {

    @XmlElement(name = "ExaminationSheetsRequestsGetResult")
    protected ArrayOfDExaminationSheetsRequests examinationSheetsRequestsGetResult;

    /**
     * Gets the value of the examinationSheetsRequestsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDExaminationSheetsRequests }
     *     
     */
    public ArrayOfDExaminationSheetsRequests getExaminationSheetsRequestsGetResult() {
        return examinationSheetsRequestsGetResult;
    }

    /**
     * Sets the value of the examinationSheetsRequestsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDExaminationSheetsRequests }
     *     
     */
    public void setExaminationSheetsRequestsGetResult(ArrayOfDExaminationSheetsRequests value) {
        this.examinationSheetsRequestsGetResult = value;
    }

}
