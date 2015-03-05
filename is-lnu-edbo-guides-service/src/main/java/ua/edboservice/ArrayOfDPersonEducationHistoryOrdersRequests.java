
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationHistoryOrdersRequests complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationHistoryOrdersRequests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationHistoryOrdersRequests" type="{http://edboservice.ua/}dPersonEducationHistoryOrdersRequests" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationHistoryOrdersRequests", propOrder = {
    "dPersonEducationHistoryOrdersRequests"
})
public class ArrayOfDPersonEducationHistoryOrdersRequests {

    @XmlElement(nillable = true)
    protected List<DPersonEducationHistoryOrdersRequests> dPersonEducationHistoryOrdersRequests;

    /**
     * Gets the value of the dPersonEducationHistoryOrdersRequests property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationHistoryOrdersRequests property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationHistoryOrdersRequests().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationHistoryOrdersRequests }
     * 
     * 
     */
    public List<DPersonEducationHistoryOrdersRequests> getDPersonEducationHistoryOrdersRequests() {
        if (dPersonEducationHistoryOrdersRequests == null) {
            dPersonEducationHistoryOrdersRequests = new ArrayList<DPersonEducationHistoryOrdersRequests>();
        }
        return this.dPersonEducationHistoryOrdersRequests;
    }

}
