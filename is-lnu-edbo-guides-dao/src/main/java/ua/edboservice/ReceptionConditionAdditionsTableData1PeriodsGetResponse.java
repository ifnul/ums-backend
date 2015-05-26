
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
 *         &lt;element name="ReceptionConditionAdditionsTableData1PeriodsGetResult" type="{http://edboservice.ua/}ArrayOfDReceptionConditionAdditionsTableData1Periods" minOccurs="0"/>
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
    "receptionConditionAdditionsTableData1PeriodsGetResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData1PeriodsGetResponse")
public class ReceptionConditionAdditionsTableData1PeriodsGetResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData1PeriodsGetResult")
    protected ArrayOfDReceptionConditionAdditionsTableData1Periods receptionConditionAdditionsTableData1PeriodsGetResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData1PeriodsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData1Periods }
     *     
     */
    public ArrayOfDReceptionConditionAdditionsTableData1Periods getReceptionConditionAdditionsTableData1PeriodsGetResult() {
        return receptionConditionAdditionsTableData1PeriodsGetResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData1PeriodsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData1Periods }
     *     
     */
    public void setReceptionConditionAdditionsTableData1PeriodsGetResult(ArrayOfDReceptionConditionAdditionsTableData1Periods value) {
        this.receptionConditionAdditionsTableData1PeriodsGetResult = value;
    }

}
