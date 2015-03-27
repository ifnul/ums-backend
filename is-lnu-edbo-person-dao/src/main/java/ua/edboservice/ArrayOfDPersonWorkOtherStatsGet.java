
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonWorkOtherStatsGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonWorkOtherStatsGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonWorkOtherStatsGet" type="{http://edboservice.ua/}dPersonWorkOtherStatsGet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonWorkOtherStatsGet", propOrder = {
    "dPersonWorkOtherStatsGet"
})
public class ArrayOfDPersonWorkOtherStatsGet {

    @XmlElement(nillable = true)
    protected List<DPersonWorkOtherStatsGet> dPersonWorkOtherStatsGet;

    /**
     * Gets the value of the dPersonWorkOtherStatsGet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonWorkOtherStatsGet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonWorkOtherStatsGet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonWorkOtherStatsGet }
     * 
     * 
     */
    public List<DPersonWorkOtherStatsGet> getDPersonWorkOtherStatsGet() {
        if (dPersonWorkOtherStatsGet == null) {
            dPersonWorkOtherStatsGet = new ArrayList<DPersonWorkOtherStatsGet>();
        }
        return this.dPersonWorkOtherStatsGet;
    }

}
