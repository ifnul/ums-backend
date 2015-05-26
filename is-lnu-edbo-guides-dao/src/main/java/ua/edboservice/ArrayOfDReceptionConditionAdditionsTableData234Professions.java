
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDReceptionConditionAdditionsTableData234Professions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDReceptionConditionAdditionsTableData234Professions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dReceptionConditionAdditionsTableData234Professions" type="{http://edboservice.ua/}dReceptionConditionAdditionsTableData234Professions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDReceptionConditionAdditionsTableData234Professions", propOrder = {
    "dReceptionConditionAdditionsTableData234Professions"
})
public class ArrayOfDReceptionConditionAdditionsTableData234Professions {

    @XmlElement(nillable = true)
    protected List<DReceptionConditionAdditionsTableData234Professions> dReceptionConditionAdditionsTableData234Professions;

    /**
     * Gets the value of the dReceptionConditionAdditionsTableData234Professions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dReceptionConditionAdditionsTableData234Professions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDReceptionConditionAdditionsTableData234Professions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DReceptionConditionAdditionsTableData234Professions }
     * 
     * 
     */
    public List<DReceptionConditionAdditionsTableData234Professions> getDReceptionConditionAdditionsTableData234Professions() {
        if (dReceptionConditionAdditionsTableData234Professions == null) {
            dReceptionConditionAdditionsTableData234Professions = new ArrayList<DReceptionConditionAdditionsTableData234Professions>();
        }
        return this.dReceptionConditionAdditionsTableData234Professions;
    }

}
