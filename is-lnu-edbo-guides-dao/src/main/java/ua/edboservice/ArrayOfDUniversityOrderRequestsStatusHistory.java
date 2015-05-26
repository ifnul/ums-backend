
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityOrderRequestsStatusHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityOrderRequestsStatusHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityOrderRequestsStatusHistory" type="{http://edboservice.ua/}dUniversityOrderRequestsStatusHistory" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityOrderRequestsStatusHistory", propOrder = {
    "dUniversityOrderRequestsStatusHistory"
})
public class ArrayOfDUniversityOrderRequestsStatusHistory {

    @XmlElement(nillable = true)
    protected List<DUniversityOrderRequestsStatusHistory> dUniversityOrderRequestsStatusHistory;

    /**
     * Gets the value of the dUniversityOrderRequestsStatusHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityOrderRequestsStatusHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityOrderRequestsStatusHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityOrderRequestsStatusHistory }
     * 
     * 
     */
    public List<DUniversityOrderRequestsStatusHistory> getDUniversityOrderRequestsStatusHistory() {
        if (dUniversityOrderRequestsStatusHistory == null) {
            dUniversityOrderRequestsStatusHistory = new ArrayList<DUniversityOrderRequestsStatusHistory>();
        }
        return this.dUniversityOrderRequestsStatusHistory;
    }

}
