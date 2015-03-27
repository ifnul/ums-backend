
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDReceptionConditionAdditionsTableData234Periods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDReceptionConditionAdditionsTableData234Periods">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dReceptionConditionAdditionsTableData234Periods" type="{http://edboservice.ua/}dReceptionConditionAdditionsTableData234Periods" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDReceptionConditionAdditionsTableData234Periods", propOrder = {
    "dReceptionConditionAdditionsTableData234Periods"
})
public class ArrayOfDReceptionConditionAdditionsTableData234Periods {

    @XmlElement(nillable = true)
    protected List<DReceptionConditionAdditionsTableData234Periods> dReceptionConditionAdditionsTableData234Periods;

    /**
     * Gets the value of the dReceptionConditionAdditionsTableData234Periods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dReceptionConditionAdditionsTableData234Periods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDReceptionConditionAdditionsTableData234Periods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DReceptionConditionAdditionsTableData234Periods }
     * 
     * 
     */
    public List<DReceptionConditionAdditionsTableData234Periods> getDReceptionConditionAdditionsTableData234Periods() {
        if (dReceptionConditionAdditionsTableData234Periods == null) {
            dReceptionConditionAdditionsTableData234Periods = new ArrayList<DReceptionConditionAdditionsTableData234Periods>();
        }
        return this.dReceptionConditionAdditionsTableData234Periods;
    }

}
