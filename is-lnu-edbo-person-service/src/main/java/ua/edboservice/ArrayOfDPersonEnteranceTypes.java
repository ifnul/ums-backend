
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEnteranceTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEnteranceTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEnteranceTypes" type="{http://edboservice.ua/}dPersonEnteranceTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEnteranceTypes", propOrder = {
    "dPersonEnteranceTypes"
})
public class ArrayOfDPersonEnteranceTypes {

    @XmlElement(nillable = true)
    protected List<DPersonEnteranceTypes> dPersonEnteranceTypes;

    /**
     * Gets the value of the dPersonEnteranceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEnteranceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEnteranceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEnteranceTypes }
     * 
     * 
     */
    public List<DPersonEnteranceTypes> getDPersonEnteranceTypes() {
        if (dPersonEnteranceTypes == null) {
            dPersonEnteranceTypes = new ArrayList<DPersonEnteranceTypes>();
        }
        return this.dPersonEnteranceTypes;
    }

}
