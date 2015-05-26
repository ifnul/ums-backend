
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
 *         &lt;element name="ReceptionConditionAdditionsTableData5GroupsGetResult" type="{http://edboservice.ua/}ArrayOfDReceptionConditionAdditionsTableData5Groups" minOccurs="0"/>
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
    "receptionConditionAdditionsTableData5GroupsGetResult"
})
@XmlRootElement(name = "ReceptionConditionAdditionsTableData5GroupsGetResponse")
public class ReceptionConditionAdditionsTableData5GroupsGetResponse {

    @XmlElement(name = "ReceptionConditionAdditionsTableData5GroupsGetResult")
    protected ArrayOfDReceptionConditionAdditionsTableData5Groups receptionConditionAdditionsTableData5GroupsGetResult;

    /**
     * Gets the value of the receptionConditionAdditionsTableData5GroupsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData5Groups }
     *     
     */
    public ArrayOfDReceptionConditionAdditionsTableData5Groups getReceptionConditionAdditionsTableData5GroupsGetResult() {
        return receptionConditionAdditionsTableData5GroupsGetResult;
    }

    /**
     * Sets the value of the receptionConditionAdditionsTableData5GroupsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDReceptionConditionAdditionsTableData5Groups }
     *     
     */
    public void setReceptionConditionAdditionsTableData5GroupsGetResult(ArrayOfDReceptionConditionAdditionsTableData5Groups value) {
        this.receptionConditionAdditionsTableData5GroupsGetResult = value;
    }

}
