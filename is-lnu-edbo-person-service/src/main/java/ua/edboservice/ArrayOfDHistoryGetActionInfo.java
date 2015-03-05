
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDHistoryGetActionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDHistoryGetActionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dHistoryGetActionInfo" type="{http://edboservice.ua/}dHistoryGetActionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDHistoryGetActionInfo", propOrder = {
    "dHistoryGetActionInfo"
})
public class ArrayOfDHistoryGetActionInfo {

    @XmlElement(nillable = true)
    protected List<DHistoryGetActionInfo> dHistoryGetActionInfo;

    /**
     * Gets the value of the dHistoryGetActionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dHistoryGetActionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDHistoryGetActionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DHistoryGetActionInfo }
     * 
     * 
     */
    public List<DHistoryGetActionInfo> getDHistoryGetActionInfo() {
        if (dHistoryGetActionInfo == null) {
            dHistoryGetActionInfo = new ArrayList<DHistoryGetActionInfo>();
        }
        return this.dHistoryGetActionInfo;
    }

}
