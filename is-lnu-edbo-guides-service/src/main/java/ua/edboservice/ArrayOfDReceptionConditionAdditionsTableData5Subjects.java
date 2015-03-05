
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDReceptionConditionAdditionsTableData5Subjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDReceptionConditionAdditionsTableData5Subjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dReceptionConditionAdditionsTableData5Subjects" type="{http://edboservice.ua/}dReceptionConditionAdditionsTableData5Subjects" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDReceptionConditionAdditionsTableData5Subjects", propOrder = {
    "dReceptionConditionAdditionsTableData5Subjects"
})
public class ArrayOfDReceptionConditionAdditionsTableData5Subjects {

    @XmlElement(nillable = true)
    protected List<DReceptionConditionAdditionsTableData5Subjects> dReceptionConditionAdditionsTableData5Subjects;

    /**
     * Gets the value of the dReceptionConditionAdditionsTableData5Subjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dReceptionConditionAdditionsTableData5Subjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDReceptionConditionAdditionsTableData5Subjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DReceptionConditionAdditionsTableData5Subjects }
     * 
     * 
     */
    public List<DReceptionConditionAdditionsTableData5Subjects> getDReceptionConditionAdditionsTableData5Subjects() {
        if (dReceptionConditionAdditionsTableData5Subjects == null) {
            dReceptionConditionAdditionsTableData5Subjects = new ArrayList<DReceptionConditionAdditionsTableData5Subjects>();
        }
        return this.dReceptionConditionAdditionsTableData5Subjects;
    }

}
