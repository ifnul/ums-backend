
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestBenefits2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestBenefits2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestBenefits2" type="{http://edboservice.ua/}dPersonRequestBenefits2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestBenefits2", propOrder = {
    "dPersonRequestBenefits2"
})
public class ArrayOfDPersonRequestBenefits2 {

    @XmlElement(nillable = true)
    protected List<DPersonRequestBenefits2> dPersonRequestBenefits2;

    /**
     * Gets the value of the dPersonRequestBenefits2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestBenefits2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestBenefits2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestBenefits2 }
     * 
     * 
     */
    public List<DPersonRequestBenefits2> getDPersonRequestBenefits2() {
        if (dPersonRequestBenefits2 == null) {
            dPersonRequestBenefits2 = new ArrayList<DPersonRequestBenefits2>();
        }
        return this.dPersonRequestBenefits2;
    }

}
