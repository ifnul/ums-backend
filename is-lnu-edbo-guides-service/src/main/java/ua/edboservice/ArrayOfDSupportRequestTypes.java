
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSupportRequestTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSupportRequestTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSupportRequestTypes" type="{http://edboservice.ua/}dSupportRequestTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSupportRequestTypes", propOrder = {
    "dSupportRequestTypes"
})
public class ArrayOfDSupportRequestTypes {

    @XmlElement(nillable = true)
    protected List<DSupportRequestTypes> dSupportRequestTypes;

    /**
     * Gets the value of the dSupportRequestTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSupportRequestTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSupportRequestTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSupportRequestTypes }
     * 
     * 
     */
    public List<DSupportRequestTypes> getDSupportRequestTypes() {
        if (dSupportRequestTypes == null) {
            dSupportRequestTypes = new ArrayList<DSupportRequestTypes>();
        }
        return this.dSupportRequestTypes;
    }

}
