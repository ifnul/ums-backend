
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonGovernmentAwardsGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonGovernmentAwardsGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonGovernmentAwardsGet" type="{http://edboservice.ua/}dPersonGovernmentAwardsGet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonGovernmentAwardsGet", propOrder = {
    "dPersonGovernmentAwardsGet"
})
public class ArrayOfDPersonGovernmentAwardsGet {

    @XmlElement(nillable = true)
    protected List<DPersonGovernmentAwardsGet> dPersonGovernmentAwardsGet;

    /**
     * Gets the value of the dPersonGovernmentAwardsGet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonGovernmentAwardsGet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonGovernmentAwardsGet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonGovernmentAwardsGet }
     * 
     * 
     */
    public List<DPersonGovernmentAwardsGet> getDPersonGovernmentAwardsGet() {
        if (dPersonGovernmentAwardsGet == null) {
            dPersonGovernmentAwardsGet = new ArrayList<DPersonGovernmentAwardsGet>();
        }
        return this.dPersonGovernmentAwardsGet;
    }

}
