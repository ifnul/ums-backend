
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDReceptionConditionAdditionsKoeficientsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDReceptionConditionAdditionsKoeficientsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dReceptionConditionAdditionsKoeficientsTypes" type="{http://edboservice.ua/}dReceptionConditionAdditionsKoeficientsTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDReceptionConditionAdditionsKoeficientsTypes", propOrder = {
    "dReceptionConditionAdditionsKoeficientsTypes"
})
public class ArrayOfDReceptionConditionAdditionsKoeficientsTypes {

    @XmlElement(nillable = true)
    protected List<DReceptionConditionAdditionsKoeficientsTypes> dReceptionConditionAdditionsKoeficientsTypes;

    /**
     * Gets the value of the dReceptionConditionAdditionsKoeficientsTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dReceptionConditionAdditionsKoeficientsTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDReceptionConditionAdditionsKoeficientsTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DReceptionConditionAdditionsKoeficientsTypes }
     * 
     * 
     */
    public List<DReceptionConditionAdditionsKoeficientsTypes> getDReceptionConditionAdditionsKoeficientsTypes() {
        if (dReceptionConditionAdditionsKoeficientsTypes == null) {
            dReceptionConditionAdditionsKoeficientsTypes = new ArrayList<DReceptionConditionAdditionsKoeficientsTypes>();
        }
        return this.dReceptionConditionAdditionsKoeficientsTypes;
    }

}
