
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDReceptionConditionAdditionsTableData234 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDReceptionConditionAdditionsTableData234">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dReceptionConditionAdditionsTableData234" type="{http://edboservice.ua/}dReceptionConditionAdditionsTableData234" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDReceptionConditionAdditionsTableData234", propOrder = {
    "dReceptionConditionAdditionsTableData234"
})
public class ArrayOfDReceptionConditionAdditionsTableData234 {

    @XmlElement(nillable = true)
    protected List<DReceptionConditionAdditionsTableData234> dReceptionConditionAdditionsTableData234;

    /**
     * Gets the value of the dReceptionConditionAdditionsTableData234 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dReceptionConditionAdditionsTableData234 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDReceptionConditionAdditionsTableData234().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DReceptionConditionAdditionsTableData234 }
     * 
     * 
     */
    public List<DReceptionConditionAdditionsTableData234> getDReceptionConditionAdditionsTableData234() {
        if (dReceptionConditionAdditionsTableData234 == null) {
            dReceptionConditionAdditionsTableData234 = new ArrayList<DReceptionConditionAdditionsTableData234>();
        }
        return this.dReceptionConditionAdditionsTableData234;
    }

}
