
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDExtAttestatsZNOFind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDExtAttestatsZNOFind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dExtAttestatsZNOFind" type="{http://edboservice.ua/}dExtAttestatsZNOFind" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDExtAttestatsZNOFind", propOrder = {
    "dExtAttestatsZNOFind"
})
public class ArrayOfDExtAttestatsZNOFind {

    @XmlElement(nillable = true)
    protected List<DExtAttestatsZNOFind> dExtAttestatsZNOFind;

    /**
     * Gets the value of the dExtAttestatsZNOFind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dExtAttestatsZNOFind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDExtAttestatsZNOFind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DExtAttestatsZNOFind }
     * 
     * 
     */
    public List<DExtAttestatsZNOFind> getDExtAttestatsZNOFind() {
        if (dExtAttestatsZNOFind == null) {
            dExtAttestatsZNOFind = new ArrayList<DExtAttestatsZNOFind>();
        }
        return this.dExtAttestatsZNOFind;
    }

}
