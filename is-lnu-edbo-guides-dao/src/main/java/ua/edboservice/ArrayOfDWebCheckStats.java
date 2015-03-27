
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDWebCheckStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDWebCheckStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dWebCheckStats" type="{http://edboservice.ua/}dWebCheckStats" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDWebCheckStats", propOrder = {
    "dWebCheckStats"
})
public class ArrayOfDWebCheckStats {

    @XmlElement(nillable = true)
    protected List<DWebCheckStats> dWebCheckStats;

    /**
     * Gets the value of the dWebCheckStats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dWebCheckStats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDWebCheckStats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DWebCheckStats }
     * 
     * 
     */
    public List<DWebCheckStats> getDWebCheckStats() {
        if (dWebCheckStats == null) {
            dWebCheckStats = new ArrayList<DWebCheckStats>();
        }
        return this.dWebCheckStats;
    }

}
