
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
 *         &lt;element name="ReceptionConditionAdditionsForExportGetResult" type="{http://edboservice.ua/}ArrayOfDReceptionConditionAdditionsForExport" minOccurs="0"/>
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
    "receptionConditionAdditionsForExportGetResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsForExportGetResponse")
public class ReceptionConditionAdditionsForExportGetResponse {

    @XmlElement(name = "ReceptionConditionAdditionsForExportGetResult")
    protected ArrayOfDReceptionConditionAdditionsForExport receptionConditionAdditionsForExportGetResult;

    /**
     * Gets the value of the receptionConditionAdditionsForExportGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReceptionConditionAdditionsForExport }
     *     
     */
    public ArrayOfDReceptionConditionAdditionsForExport getReceptionConditionAdditionsForExportGetResult() {
        return receptionConditionAdditionsForExportGetResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsForExportGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReceptionConditionAdditionsForExport }
     *     
     */
    public void setReceptionConditionAdditionsForExportGetResult(ArrayOfDReceptionConditionAdditionsForExport value) {
        this.receptionConditionAdditionsForExportGetResult = value;
    }

}
