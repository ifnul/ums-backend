
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestOlympiadsAwardsFull complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestOlympiadsAwardsFull">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestOlympiadsAwardsFull" type="{http://edboservice.ua/}dPersonRequestOlympiadsAwardsFull" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestOlympiadsAwardsFull", propOrder = {
    "dPersonRequestOlympiadsAwardsFull"
})
public class ArrayOfDPersonRequestOlympiadsAwardsFull {

    @XmlElement(nillable = true)
    protected List<DPersonRequestOlympiadsAwardsFull> dPersonRequestOlympiadsAwardsFull;

    /**
     * Gets the value of the dPersonRequestOlympiadsAwardsFull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestOlympiadsAwardsFull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestOlympiadsAwardsFull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestOlympiadsAwardsFull }
     * 
     * 
     */
    public List<DPersonRequestOlympiadsAwardsFull> getDPersonRequestOlympiadsAwardsFull() {
        if (dPersonRequestOlympiadsAwardsFull == null) {
            dPersonRequestOlympiadsAwardsFull = new ArrayList<DPersonRequestOlympiadsAwardsFull>();
        }
        return this.dPersonRequestOlympiadsAwardsFull;
    }

}
