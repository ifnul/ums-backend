
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonBenefits2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonBenefits2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonBenefits2" type="{http://edboservice.ua/}dPersonBenefits2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonBenefits2", propOrder = {
    "dPersonBenefits2"
})
public class ArrayOfDPersonBenefits2 {

    @XmlElement(nillable = true)
    protected List<DPersonBenefits2> dPersonBenefits2;

    /**
     * Gets the value of the dPersonBenefits2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonBenefits2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonBenefits2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonBenefits2 }
     * 
     * 
     */
    public List<DPersonBenefits2> getDPersonBenefits2() {
        if (dPersonBenefits2 == null) {
            dPersonBenefits2 = new ArrayList<DPersonBenefits2>();
        }
        return this.dPersonBenefits2;
    }

}
