
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDRequestsGetHistoryChange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDRequestsGetHistoryChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dRequestsGetHistoryChange" type="{http://edboservice.ua/}dRequestsGetHistoryChange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDRequestsGetHistoryChange", propOrder = {
    "dRequestsGetHistoryChange"
})
public class ArrayOfDRequestsGetHistoryChange {

    @XmlElement(nillable = true)
    protected List<DRequestsGetHistoryChange> dRequestsGetHistoryChange;

    /**
     * Gets the value of the dRequestsGetHistoryChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dRequestsGetHistoryChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDRequestsGetHistoryChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DRequestsGetHistoryChange }
     * 
     * 
     */
    public List<DRequestsGetHistoryChange> getDRequestsGetHistoryChange() {
        if (dRequestsGetHistoryChange == null) {
            dRequestsGetHistoryChange = new ArrayList<DRequestsGetHistoryChange>();
        }
        return this.dRequestsGetHistoryChange;
    }

}
