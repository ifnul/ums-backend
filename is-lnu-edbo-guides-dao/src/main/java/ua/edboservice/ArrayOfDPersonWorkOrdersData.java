
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonWorkOrdersData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonWorkOrdersData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonWorkOrdersData" type="{http://edboservice.ua/}dPersonWorkOrdersData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonWorkOrdersData", propOrder = {
    "dPersonWorkOrdersData"
})
public class ArrayOfDPersonWorkOrdersData {

    @XmlElement(nillable = true)
    protected List<DPersonWorkOrdersData> dPersonWorkOrdersData;

    /**
     * Gets the value of the dPersonWorkOrdersData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonWorkOrdersData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonWorkOrdersData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonWorkOrdersData }
     * 
     * 
     */
    public List<DPersonWorkOrdersData> getDPersonWorkOrdersData() {
        if (dPersonWorkOrdersData == null) {
            dPersonWorkOrdersData = new ArrayList<DPersonWorkOrdersData>();
        }
        return this.dPersonWorkOrdersData;
    }

}
