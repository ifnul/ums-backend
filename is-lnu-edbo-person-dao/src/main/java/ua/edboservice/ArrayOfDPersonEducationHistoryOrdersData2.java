
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationHistoryOrdersData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationHistoryOrdersData2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationHistoryOrdersData2" type="{http://edboservice.ua/}dPersonEducationHistoryOrdersData2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationHistoryOrdersData2", propOrder = {
    "dPersonEducationHistoryOrdersData2"
})
public class ArrayOfDPersonEducationHistoryOrdersData2 {

    @XmlElement(nillable = true)
    protected List<DPersonEducationHistoryOrdersData2> dPersonEducationHistoryOrdersData2;

    /**
     * Gets the value of the dPersonEducationHistoryOrdersData2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationHistoryOrdersData2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationHistoryOrdersData2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationHistoryOrdersData2 }
     * 
     * 
     */
    public List<DPersonEducationHistoryOrdersData2> getDPersonEducationHistoryOrdersData2() {
        if (dPersonEducationHistoryOrdersData2 == null) {
            dPersonEducationHistoryOrdersData2 = new ArrayList<DPersonEducationHistoryOrdersData2>();
        }
        return this.dPersonEducationHistoryOrdersData2;
    }

}
