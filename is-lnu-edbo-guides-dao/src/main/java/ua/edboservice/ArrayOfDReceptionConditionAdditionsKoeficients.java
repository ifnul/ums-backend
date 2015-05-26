
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDReceptionConditionAdditionsKoeficients complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDReceptionConditionAdditionsKoeficients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dReceptionConditionAdditionsKoeficients" type="{http://edboservice.ua/}dReceptionConditionAdditionsKoeficients" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDReceptionConditionAdditionsKoeficients", propOrder = {
    "dReceptionConditionAdditionsKoeficients"
})
public class ArrayOfDReceptionConditionAdditionsKoeficients {

    @XmlElement(nillable = true)
    protected List<DReceptionConditionAdditionsKoeficients> dReceptionConditionAdditionsKoeficients;

    /**
     * Gets the value of the dReceptionConditionAdditionsKoeficients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dReceptionConditionAdditionsKoeficients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDReceptionConditionAdditionsKoeficients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DReceptionConditionAdditionsKoeficients }
     * 
     * 
     */
    public List<DReceptionConditionAdditionsKoeficients> getDReceptionConditionAdditionsKoeficients() {
        if (dReceptionConditionAdditionsKoeficients == null) {
            dReceptionConditionAdditionsKoeficients = new ArrayList<DReceptionConditionAdditionsKoeficients>();
        }
        return this.dReceptionConditionAdditionsKoeficients;
    }

}
