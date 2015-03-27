
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDWebGovernmentAwards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDWebGovernmentAwards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dWebGovernmentAwards" type="{http://edboservice.ua/}dWebGovernmentAwards" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDWebGovernmentAwards", propOrder = {
    "dWebGovernmentAwards"
})
public class ArrayOfDWebGovernmentAwards {

    @XmlElement(nillable = true)
    protected List<DWebGovernmentAwards> dWebGovernmentAwards;

    /**
     * Gets the value of the dWebGovernmentAwards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dWebGovernmentAwards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDWebGovernmentAwards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DWebGovernmentAwards }
     * 
     * 
     */
    public List<DWebGovernmentAwards> getDWebGovernmentAwards() {
        if (dWebGovernmentAwards == null) {
            dWebGovernmentAwards = new ArrayList<DWebGovernmentAwards>();
        }
        return this.dWebGovernmentAwards;
    }

}
