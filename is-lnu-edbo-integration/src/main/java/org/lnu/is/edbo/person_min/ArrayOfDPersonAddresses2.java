
package org.lnu.is.edbo.person_min;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonAddresses2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonAddresses2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonAddresses2" type="{http://edboservice.ua/}dPersonAddresses2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonAddresses2", propOrder = {
    "dPersonAddresses2"
})
public class ArrayOfDPersonAddresses2 {

    @XmlElement(nillable = true)
    protected List<DPersonAddresses2> dPersonAddresses2;

    /**
     * Gets the value of the dPersonAddresses2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonAddresses2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonAddresses2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonAddresses2 }
     * 
     * 
     */
    public List<DPersonAddresses2> getDPersonAddresses2() {
        if (dPersonAddresses2 == null) {
            dPersonAddresses2 = new ArrayList<DPersonAddresses2>();
        }
        return this.dPersonAddresses2;
    }

}
