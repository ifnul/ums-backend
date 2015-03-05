
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSpecProfessionsRang complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSpecProfessionsRang">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSpecProfessionsRang" type="{http://edboservice.ua/}dSpecProfessionsRang" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSpecProfessionsRang", propOrder = {
    "dSpecProfessionsRang"
})
public class ArrayOfDSpecProfessionsRang {

    @XmlElement(nillable = true)
    protected List<DSpecProfessionsRang> dSpecProfessionsRang;

    /**
     * Gets the value of the dSpecProfessionsRang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSpecProfessionsRang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSpecProfessionsRang().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSpecProfessionsRang }
     * 
     * 
     */
    public List<DSpecProfessionsRang> getDSpecProfessionsRang() {
        if (dSpecProfessionsRang == null) {
            dSpecProfessionsRang = new ArrayList<DSpecProfessionsRang>();
        }
        return this.dSpecProfessionsRang;
    }

}
