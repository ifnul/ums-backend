
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSpecSpecializationAllRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSpecSpecializationAllRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSpecSpecializationAllRequests" type="{http://edboservice.ua/}dSpecSpecializationAllRequests" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSpecSpecializationAllRequests", propOrder = {
    "dSpecSpecializationAllRequests"
})
public class ArrayOfDSpecSpecializationAllRequests {

    @XmlElement(nillable = true)
    protected List<DSpecSpecializationAllRequests> dSpecSpecializationAllRequests;

    /**
     * Gets the value of the dSpecSpecializationAllRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSpecSpecializationAllRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSpecSpecializationAllRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSpecSpecializationAllRequests }
     * 
     * 
     */
    public List<DSpecSpecializationAllRequests> getDSpecSpecializationAllRequests() {
        if (dSpecSpecializationAllRequests == null) {
            dSpecSpecializationAllRequests = new ArrayList<DSpecSpecializationAllRequests>();
        }
        return this.dSpecSpecializationAllRequests;
    }

}
