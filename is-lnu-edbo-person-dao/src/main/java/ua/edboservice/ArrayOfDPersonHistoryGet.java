
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonHistoryGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonHistoryGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonHistoryGet" type="{http://edboservice.ua/}dPersonHistoryGet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonHistoryGet", propOrder = {
    "dPersonHistoryGet"
})
public class ArrayOfDPersonHistoryGet {

    @XmlElement(nillable = true)
    protected List<DPersonHistoryGet> dPersonHistoryGet;

    /**
     * Gets the value of the dPersonHistoryGet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonHistoryGet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonHistoryGet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonHistoryGet }
     * 
     * 
     */
    public List<DPersonHistoryGet> getDPersonHistoryGet() {
        if (dPersonHistoryGet == null) {
            dPersonHistoryGet = new ArrayList<DPersonHistoryGet>();
        }
        return this.dPersonHistoryGet;
    }

}
