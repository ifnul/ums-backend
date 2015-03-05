
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDGovernmentAwardsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDGovernmentAwardsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dGovernmentAwardsTypes" type="{http://edboservice.ua/}dGovernmentAwardsTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDGovernmentAwardsTypes", propOrder = {
    "dGovernmentAwardsTypes"
})
public class ArrayOfDGovernmentAwardsTypes {

    @XmlElement(nillable = true)
    protected List<DGovernmentAwardsTypes> dGovernmentAwardsTypes;

    /**
     * Gets the value of the dGovernmentAwardsTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dGovernmentAwardsTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDGovernmentAwardsTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DGovernmentAwardsTypes }
     * 
     * 
     */
    public List<DGovernmentAwardsTypes> getDGovernmentAwardsTypes() {
        if (dGovernmentAwardsTypes == null) {
            dGovernmentAwardsTypes = new ArrayList<DGovernmentAwardsTypes>();
        }
        return this.dGovernmentAwardsTypes;
    }

}
