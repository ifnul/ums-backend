
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDGlobalRishen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDGlobalRishen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dGlobalRishen" type="{http://edboservice.ua/}dGlobalRishen" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDGlobalRishen", propOrder = {
    "dGlobalRishen"
})
public class ArrayOfDGlobalRishen {

    @XmlElement(nillable = true)
    protected List<DGlobalRishen> dGlobalRishen;

    /**
     * Gets the value of the dGlobalRishen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dGlobalRishen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDGlobalRishen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DGlobalRishen }
     * 
     * 
     */
    public List<DGlobalRishen> getDGlobalRishen() {
        if (dGlobalRishen == null) {
            dGlobalRishen = new ArrayList<DGlobalRishen>();
        }
        return this.dGlobalRishen;
    }

}
