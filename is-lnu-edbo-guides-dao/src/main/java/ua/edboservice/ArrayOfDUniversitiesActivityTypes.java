
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversitiesActivityTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversitiesActivityTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversitiesActivityTypes" type="{http://edboservice.ua/}dUniversitiesActivityTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversitiesActivityTypes", propOrder = {
    "dUniversitiesActivityTypes"
})
public class ArrayOfDUniversitiesActivityTypes {

    @XmlElement(nillable = true)
    protected List<DUniversitiesActivityTypes> dUniversitiesActivityTypes;

    /**
     * Gets the value of the dUniversitiesActivityTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversitiesActivityTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversitiesActivityTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversitiesActivityTypes }
     * 
     * 
     */
    public List<DUniversitiesActivityTypes> getDUniversitiesActivityTypes() {
        if (dUniversitiesActivityTypes == null) {
            dUniversitiesActivityTypes = new ArrayList<DUniversitiesActivityTypes>();
        }
        return this.dUniversitiesActivityTypes;
    }

}
