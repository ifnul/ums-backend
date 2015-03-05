
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDQualificationsEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDQualificationsEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dQualificationsEx" type="{http://edboservice.ua/}dQualificationsEx" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDQualificationsEx", propOrder = {
    "dQualificationsEx"
})
public class ArrayOfDQualificationsEx {

    @XmlElement(nillable = true)
    protected List<DQualificationsEx> dQualificationsEx;

    /**
     * Gets the value of the dQualificationsEx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dQualificationsEx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDQualificationsEx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DQualificationsEx }
     * 
     * 
     */
    public List<DQualificationsEx> getDQualificationsEx() {
        if (dQualificationsEx == null) {
            dQualificationsEx = new ArrayList<DQualificationsEx>();
        }
        return this.dQualificationsEx;
    }

}
