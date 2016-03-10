
package org.lnu.is.edbo.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSpecSpecialization complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSpecSpecialization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSpecSpecialization" type="{http://edboservice.ua/}dSpecSpecialization" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSpecSpecialization", propOrder = {
    "dSpecSpecialization"
})
public class ArrayOfDSpecSpecialization {

    @XmlElement(nillable = true)
    protected List<DSpecSpecialization> dSpecSpecialization;

    /**
     * Gets the value of the dSpecSpecialization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSpecSpecialization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSpecSpecialization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSpecSpecialization }
     * 
     * 
     */
    public List<DSpecSpecialization> getDSpecSpecialization() {
        if (dSpecSpecialization == null) {
            dSpecSpecialization = new ArrayList<DSpecSpecialization>();
        }
        return this.dSpecSpecialization;
    }

}
