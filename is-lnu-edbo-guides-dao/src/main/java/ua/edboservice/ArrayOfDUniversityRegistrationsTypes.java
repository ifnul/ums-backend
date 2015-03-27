
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityRegistrationsTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityRegistrationsTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityRegistrationsTypes" type="{http://edboservice.ua/}dUniversityRegistrationsTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityRegistrationsTypes", propOrder = {
    "dUniversityRegistrationsTypes"
})
public class ArrayOfDUniversityRegistrationsTypes {

    @XmlElement(nillable = true)
    protected List<DUniversityRegistrationsTypes> dUniversityRegistrationsTypes;

    /**
     * Gets the value of the dUniversityRegistrationsTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityRegistrationsTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityRegistrationsTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityRegistrationsTypes }
     * 
     * 
     */
    public List<DUniversityRegistrationsTypes> getDUniversityRegistrationsTypes() {
        if (dUniversityRegistrationsTypes == null) {
            dUniversityRegistrationsTypes = new ArrayList<DUniversityRegistrationsTypes>();
        }
        return this.dUniversityRegistrationsTypes;
    }

}
