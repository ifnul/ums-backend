
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestBenefitsFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestBenefitsFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestBenefitsFull" type="{http://edboservice.ua/}dPersonRequestBenefitsFull" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestBenefitsFull", propOrder = {
    "dPersonRequestBenefitsFull"
})
public class ArrayOfDPersonRequestBenefitsFull {

    @XmlElement(nillable = true)
    protected List<DPersonRequestBenefitsFull> dPersonRequestBenefitsFull;

    /**
     * Gets the value of the dPersonRequestBenefitsFull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestBenefitsFull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestBenefitsFull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestBenefitsFull }
     * 
     * 
     */
    public List<DPersonRequestBenefitsFull> getDPersonRequestBenefitsFull() {
        if (dPersonRequestBenefitsFull == null) {
            dPersonRequestBenefitsFull = new ArrayList<DPersonRequestBenefitsFull>();
        }
        return this.dPersonRequestBenefitsFull;
    }

}
