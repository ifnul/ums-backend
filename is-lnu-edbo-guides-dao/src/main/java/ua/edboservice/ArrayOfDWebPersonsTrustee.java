
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDWebPersonsTrustee complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDWebPersonsTrustee">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dWebPersonsTrustee" type="{http://edboservice.ua/}dWebPersonsTrustee" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDWebPersonsTrustee", propOrder = {
    "dWebPersonsTrustee"
})
public class ArrayOfDWebPersonsTrustee {

    @XmlElement(nillable = true)
    protected List<DWebPersonsTrustee> dWebPersonsTrustee;

    /**
     * Gets the value of the dWebPersonsTrustee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dWebPersonsTrustee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDWebPersonsTrustee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DWebPersonsTrustee }
     * 
     * 
     */
    public List<DWebPersonsTrustee> getDWebPersonsTrustee() {
        if (dWebPersonsTrustee == null) {
            dWebPersonsTrustee = new ArrayList<DWebPersonsTrustee>();
        }
        return this.dWebPersonsTrustee;
    }

}
