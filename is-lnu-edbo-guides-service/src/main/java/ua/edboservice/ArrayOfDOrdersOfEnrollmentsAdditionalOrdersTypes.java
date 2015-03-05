
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrdersOfEnrollmentsAdditionalOrdersTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrdersOfEnrollmentsAdditionalOrdersTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrdersOfEnrollmentsAdditionalOrdersTypes" type="{http://edboservice.ua/}dOrdersOfEnrollmentsAdditionalOrdersTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrdersOfEnrollmentsAdditionalOrdersTypes", propOrder = {
    "dOrdersOfEnrollmentsAdditionalOrdersTypes"
})
public class ArrayOfDOrdersOfEnrollmentsAdditionalOrdersTypes {

    @XmlElement(nillable = true)
    protected List<DOrdersOfEnrollmentsAdditionalOrdersTypes> dOrdersOfEnrollmentsAdditionalOrdersTypes;

    /**
     * Gets the value of the dOrdersOfEnrollmentsAdditionalOrdersTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrdersOfEnrollmentsAdditionalOrdersTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrdersOfEnrollmentsAdditionalOrdersTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrdersOfEnrollmentsAdditionalOrdersTypes }
     * 
     * 
     */
    public List<DOrdersOfEnrollmentsAdditionalOrdersTypes> getDOrdersOfEnrollmentsAdditionalOrdersTypes() {
        if (dOrdersOfEnrollmentsAdditionalOrdersTypes == null) {
            dOrdersOfEnrollmentsAdditionalOrdersTypes = new ArrayList<DOrdersOfEnrollmentsAdditionalOrdersTypes>();
        }
        return this.dOrdersOfEnrollmentsAdditionalOrdersTypes;
    }

}
