
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDDeliveryOfDocumentsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDDeliveryOfDocumentsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dDeliveryOfDocumentsData" type="{http://edboservice.ua/}dDeliveryOfDocumentsData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDDeliveryOfDocumentsData", propOrder = {
    "dDeliveryOfDocumentsData"
})
public class ArrayOfDDeliveryOfDocumentsData {

    @XmlElement(nillable = true)
    protected List<DDeliveryOfDocumentsData> dDeliveryOfDocumentsData;

    /**
     * Gets the value of the dDeliveryOfDocumentsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dDeliveryOfDocumentsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDDeliveryOfDocumentsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DDeliveryOfDocumentsData }
     * 
     * 
     */
    public List<DDeliveryOfDocumentsData> getDDeliveryOfDocumentsData() {
        if (dDeliveryOfDocumentsData == null) {
            dDeliveryOfDocumentsData = new ArrayList<DDeliveryOfDocumentsData>();
        }
        return this.dDeliveryOfDocumentsData;
    }

}
