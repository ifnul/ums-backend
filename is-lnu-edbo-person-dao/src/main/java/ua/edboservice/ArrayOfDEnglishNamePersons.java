
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEnglishNamePersons complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEnglishNamePersons">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEnglishNamePersons" type="{http://edboservice.ua/}dEnglishNamePersons" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEnglishNamePersons", propOrder = {
    "dEnglishNamePersons"
})
public class ArrayOfDEnglishNamePersons {

    @XmlElement(nillable = true)
    protected List<DEnglishNamePersons> dEnglishNamePersons;

    /**
     * Gets the value of the dEnglishNamePersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dEnglishNamePersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEnglishNamePersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEnglishNamePersons }
     * 
     * 
     */
    public List<DEnglishNamePersons> getDEnglishNamePersons() {
        if (dEnglishNamePersons == null) {
            dEnglishNamePersons = new ArrayList<DEnglishNamePersons>();
        }
        return this.dEnglishNamePersons;
    }

}
