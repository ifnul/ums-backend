
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDExtZNO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDExtZNO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dExtZNO" type="{http://edboservice.ua/}dExtZNO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDExtZNO", propOrder = {
    "dExtZNO"
})
public class ArrayOfDExtZNO {

    @XmlElement(nillable = true)
    protected List<DExtZNO> dExtZNO;

    /**
     * Gets the value of the dExtZNO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dExtZNO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDExtZNO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DExtZNO }
     * 
     * 
     */
    public List<DExtZNO> getDExtZNO() {
        if (dExtZNO == null) {
            dExtZNO = new ArrayList<DExtZNO>();
        }
        return this.dExtZNO;
    }

}
