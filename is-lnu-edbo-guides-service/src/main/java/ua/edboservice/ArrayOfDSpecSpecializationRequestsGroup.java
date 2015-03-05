
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSpecSpecializationRequestsGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSpecSpecializationRequestsGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSpecSpecializationRequestsGroup" type="{http://edboservice.ua/}dSpecSpecializationRequestsGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSpecSpecializationRequestsGroup", propOrder = {
    "dSpecSpecializationRequestsGroup"
})
public class ArrayOfDSpecSpecializationRequestsGroup {

    @XmlElement(nillable = true)
    protected List<DSpecSpecializationRequestsGroup> dSpecSpecializationRequestsGroup;

    /**
     * Gets the value of the dSpecSpecializationRequestsGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSpecSpecializationRequestsGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSpecSpecializationRequestsGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSpecSpecializationRequestsGroup }
     * 
     * 
     */
    public List<DSpecSpecializationRequestsGroup> getDSpecSpecializationRequestsGroup() {
        if (dSpecSpecializationRequestsGroup == null) {
            dSpecSpecializationRequestsGroup = new ArrayList<DSpecSpecializationRequestsGroup>();
        }
        return this.dSpecSpecializationRequestsGroup;
    }

}
