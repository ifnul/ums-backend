
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDReceptionConditionAdditionsTableData62 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDReceptionConditionAdditionsTableData62">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dReceptionConditionAdditionsTableData62" type="{http://edboservice.ua/}dReceptionConditionAdditionsTableData62" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDReceptionConditionAdditionsTableData62", propOrder = {
    "dReceptionConditionAdditionsTableData62"
})
public class ArrayOfDReceptionConditionAdditionsTableData62 {

    @XmlElement(nillable = true)
    protected List<DReceptionConditionAdditionsTableData62> dReceptionConditionAdditionsTableData62;

    /**
     * Gets the value of the dReceptionConditionAdditionsTableData62 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dReceptionConditionAdditionsTableData62 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDReceptionConditionAdditionsTableData62().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DReceptionConditionAdditionsTableData62 }
     * 
     * 
     */
    public List<DReceptionConditionAdditionsTableData62> getDReceptionConditionAdditionsTableData62() {
        if (dReceptionConditionAdditionsTableData62 == null) {
            dReceptionConditionAdditionsTableData62 = new ArrayList<DReceptionConditionAdditionsTableData62>();
        }
        return this.dReceptionConditionAdditionsTableData62;
    }

}
