
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationPaymentTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationPaymentTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationPaymentTypes" type="{http://edboservice.ua/}dPersonEducationPaymentTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationPaymentTypes", propOrder = {
    "dPersonEducationPaymentTypes"
})
public class ArrayOfDPersonEducationPaymentTypes {

    @XmlElement(nillable = true)
    protected List<DPersonEducationPaymentTypes> dPersonEducationPaymentTypes;

    /**
     * Gets the value of the dPersonEducationPaymentTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationPaymentTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationPaymentTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationPaymentTypes }
     * 
     * 
     */
    public List<DPersonEducationPaymentTypes> getDPersonEducationPaymentTypes() {
        if (dPersonEducationPaymentTypes == null) {
            dPersonEducationPaymentTypes = new ArrayList<DPersonEducationPaymentTypes>();
        }
        return this.dPersonEducationPaymentTypes;
    }

}
