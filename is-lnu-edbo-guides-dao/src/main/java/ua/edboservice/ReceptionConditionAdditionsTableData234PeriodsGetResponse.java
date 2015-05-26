
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
 *         &lt;element name="ReceptionConditionAdditionsTableData234PeriodsGetResult" type="{http://edboservice.ua/}ArrayOfDReceptionConditionAdditionsTableData234Periods" minOccurs="0"/>
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
    "receptionConditionAdditionsTableData234PeriodsGetResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData234PeriodsGetResponse")
public class ReceptionConditionAdditionsTableData234PeriodsGetResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData234PeriodsGetResult")
    protected ArrayOfDReceptionConditionAdditionsTableData234Periods receptionConditionAdditionsTableData234PeriodsGetResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData234PeriodsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData234Periods }
     *     
     */
    public ArrayOfDReceptionConditionAdditionsTableData234Periods getReceptionConditionAdditionsTableData234PeriodsGetResult() {
        return receptionConditionAdditionsTableData234PeriodsGetResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData234PeriodsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData234Periods }
     *     
     */
    public void setReceptionConditionAdditionsTableData234PeriodsGetResult(ArrayOfDReceptionConditionAdditionsTableData234Periods value) {
        this.receptionConditionAdditionsTableData234PeriodsGetResult = value;
    }

}
