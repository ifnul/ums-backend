
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSpecProfessions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSpecProfessions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSpecProfessions" type="{http://edboservice.ua/}dSpecProfessions" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSpecProfessions", propOrder = {
    "dSpecProfessions"
})
public class ArrayOfDSpecProfessions {

    @XmlElement(nillable = true)
    protected List<DSpecProfessions> dSpecProfessions;

    /**
     * Gets the value of the dSpecProfessions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSpecProfessions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSpecProfessions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSpecProfessions }
     * 
     * 
     */
    public List<DSpecProfessions> getDSpecProfessions() {
        if (dSpecProfessions == null) {
            dSpecProfessions = new ArrayList<DSpecProfessions>();
        }
        return this.dSpecProfessions;
    }

}
