
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityJuristyialTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityJuristyialTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityJuristyialTypes" type="{http://edboservice.ua/}dUniversityJuristyialTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityJuristyialTypes", propOrder = {
    "dUniversityJuristyialTypes"
})
public class ArrayOfDUniversityJuristyialTypes {

    @XmlElement(nillable = true)
    protected List<DUniversityJuristyialTypes> dUniversityJuristyialTypes;

    /**
     * Gets the value of the dUniversityJuristyialTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityJuristyialTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityJuristyialTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityJuristyialTypes }
     * 
     * 
     */
    public List<DUniversityJuristyialTypes> getDUniversityJuristyialTypes() {
        if (dUniversityJuristyialTypes == null) {
            dUniversityJuristyialTypes = new ArrayList<DUniversityJuristyialTypes>();
        }
        return this.dUniversityJuristyialTypes;
    }

}
