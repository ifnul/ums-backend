
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSpecSpecializationRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSpecSpecializationRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSpecSpecializationRequests" type="{http://edboservice.ua/}dSpecSpecializationRequests" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSpecSpecializationRequests", propOrder = {
    "dSpecSpecializationRequests"
})
public class ArrayOfDSpecSpecializationRequests {

    @XmlElement(nillable = true)
    protected List<DSpecSpecializationRequests> dSpecSpecializationRequests;

    /**
     * Gets the value of the dSpecSpecializationRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSpecSpecializationRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSpecSpecializationRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSpecSpecializationRequests }
     * 
     * 
     */
    public List<DSpecSpecializationRequests> getDSpecSpecializationRequests() {
        if (dSpecSpecializationRequests == null) {
            dSpecSpecializationRequests = new ArrayList<DSpecSpecializationRequests>();
        }
        return this.dSpecSpecializationRequests;
    }

}
