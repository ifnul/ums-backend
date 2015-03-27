
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationHistoryOrdersRequestsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationHistoryOrdersRequestsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationHistoryOrdersRequestsTypes" type="{http://edboservice.ua/}dPersonEducationHistoryOrdersRequestsTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationHistoryOrdersRequestsTypes", propOrder = {
    "dPersonEducationHistoryOrdersRequestsTypes"
})
public class ArrayOfDPersonEducationHistoryOrdersRequestsTypes {

    @XmlElement(nillable = true)
    protected List<DPersonEducationHistoryOrdersRequestsTypes> dPersonEducationHistoryOrdersRequestsTypes;

    /**
     * Gets the value of the dPersonEducationHistoryOrdersRequestsTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationHistoryOrdersRequestsTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationHistoryOrdersRequestsTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationHistoryOrdersRequestsTypes }
     * 
     * 
     */
    public List<DPersonEducationHistoryOrdersRequestsTypes> getDPersonEducationHistoryOrdersRequestsTypes() {
        if (dPersonEducationHistoryOrdersRequestsTypes == null) {
            dPersonEducationHistoryOrdersRequestsTypes = new ArrayList<DPersonEducationHistoryOrdersRequestsTypes>();
        }
        return this.dPersonEducationHistoryOrdersRequestsTypes;
    }

}
