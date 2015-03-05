
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniveristyDopUgoda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniveristyDopUgoda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniveristyDopUgoda" type="{http://edboservice.ua/}dUniveristyDopUgoda" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniveristyDopUgoda", propOrder = {
    "dUniveristyDopUgoda"
})
public class ArrayOfDUniveristyDopUgoda {

    @XmlElement(nillable = true)
    protected List<DUniveristyDopUgoda> dUniveristyDopUgoda;

    /**
     * Gets the value of the dUniveristyDopUgoda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniveristyDopUgoda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniveristyDopUgoda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniveristyDopUgoda }
     * 
     * 
     */
    public List<DUniveristyDopUgoda> getDUniveristyDopUgoda() {
        if (dUniveristyDopUgoda == null) {
            dUniveristyDopUgoda = new ArrayList<DUniveristyDopUgoda>();
        }
        return this.dUniveristyDopUgoda;
    }

}
