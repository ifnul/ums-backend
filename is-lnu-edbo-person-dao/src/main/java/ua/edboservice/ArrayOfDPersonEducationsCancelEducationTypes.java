
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationsCancelEducationTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationsCancelEducationTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationsCancelEducationTypes" type="{http://edboservice.ua/}dPersonEducationsCancelEducationTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationsCancelEducationTypes", propOrder = {
    "dPersonEducationsCancelEducationTypes"
})
public class ArrayOfDPersonEducationsCancelEducationTypes {

    @XmlElement(nillable = true)
    protected List<DPersonEducationsCancelEducationTypes> dPersonEducationsCancelEducationTypes;

    /**
     * Gets the value of the dPersonEducationsCancelEducationTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationsCancelEducationTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationsCancelEducationTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationsCancelEducationTypes }
     * 
     * 
     */
    public List<DPersonEducationsCancelEducationTypes> getDPersonEducationsCancelEducationTypes() {
        if (dPersonEducationsCancelEducationTypes == null) {
            dPersonEducationsCancelEducationTypes = new ArrayList<DPersonEducationsCancelEducationTypes>();
        }
        return this.dPersonEducationsCancelEducationTypes;
    }

}
