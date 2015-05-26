
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDProfessionUpsPersonsFind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDProfessionUpsPersonsFind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dProfessionUpsPersonsFind" type="{http://edboservice.ua/}dProfessionUpsPersonsFind" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDProfessionUpsPersonsFind", propOrder = {
    "dProfessionUpsPersonsFind"
})
public class ArrayOfDProfessionUpsPersonsFind {

    @XmlElement(nillable = true)
    protected List<DProfessionUpsPersonsFind> dProfessionUpsPersonsFind;

    /**
     * Gets the value of the dProfessionUpsPersonsFind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dProfessionUpsPersonsFind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDProfessionUpsPersonsFind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DProfessionUpsPersonsFind }
     * 
     * 
     */
    public List<DProfessionUpsPersonsFind> getDProfessionUpsPersonsFind() {
        if (dProfessionUpsPersonsFind == null) {
            dProfessionUpsPersonsFind = new ArrayList<DProfessionUpsPersonsFind>();
        }
        return this.dProfessionUpsPersonsFind;
    }

}
