
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDExtZNOByFIO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDExtZNOByFIO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dExtZNOByFIO" type="{http://edboservice.ua/}dExtZNOByFIO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDExtZNOByFIO", propOrder = {
    "dExtZNOByFIO"
})
public class ArrayOfDExtZNOByFIO {

    @XmlElement(nillable = true)
    protected List<DExtZNOByFIO> dExtZNOByFIO;

    /**
     * Gets the value of the dExtZNOByFIO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dExtZNOByFIO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDExtZNOByFIO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DExtZNOByFIO }
     * 
     * 
     */
    public List<DExtZNOByFIO> getDExtZNOByFIO() {
        if (dExtZNOByFIO == null) {
            dExtZNOByFIO = new ArrayList<DExtZNOByFIO>();
        }
        return this.dExtZNOByFIO;
    }

}
