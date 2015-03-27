
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonsStudentsGrupsPersons complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonsStudentsGrupsPersons">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonsStudentsGrupsPersons" type="{http://edboservice.ua/}dPersonsStudentsGrupsPersons" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonsStudentsGrupsPersons", propOrder = {
    "dPersonsStudentsGrupsPersons"
})
public class ArrayOfDPersonsStudentsGrupsPersons {

    @XmlElement(nillable = true)
    protected List<DPersonsStudentsGrupsPersons> dPersonsStudentsGrupsPersons;

    /**
     * Gets the value of the dPersonsStudentsGrupsPersons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonsStudentsGrupsPersons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonsStudentsGrupsPersons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonsStudentsGrupsPersons }
     * 
     * 
     */
    public List<DPersonsStudentsGrupsPersons> getDPersonsStudentsGrupsPersons() {
        if (dPersonsStudentsGrupsPersons == null) {
            dPersonsStudentsGrupsPersons = new ArrayList<DPersonsStudentsGrupsPersons>();
        }
        return this.dPersonsStudentsGrupsPersons;
    }

}
