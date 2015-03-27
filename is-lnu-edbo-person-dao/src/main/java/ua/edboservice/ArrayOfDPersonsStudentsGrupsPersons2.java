
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonsStudentsGrupsPersons2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonsStudentsGrupsPersons2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonsStudentsGrupsPersons2" type="{http://edboservice.ua/}dPersonsStudentsGrupsPersons2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonsStudentsGrupsPersons2", propOrder = {
    "dPersonsStudentsGrupsPersons2"
})
public class ArrayOfDPersonsStudentsGrupsPersons2 {

    @XmlElement(nillable = true)
    protected List<DPersonsStudentsGrupsPersons2> dPersonsStudentsGrupsPersons2;

    /**
     * Gets the value of the dPersonsStudentsGrupsPersons2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonsStudentsGrupsPersons2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonsStudentsGrupsPersons2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonsStudentsGrupsPersons2 }
     * 
     * 
     */
    public List<DPersonsStudentsGrupsPersons2> getDPersonsStudentsGrupsPersons2() {
        if (dPersonsStudentsGrupsPersons2 == null) {
            dPersonsStudentsGrupsPersons2 = new ArrayList<DPersonsStudentsGrupsPersons2>();
        }
        return this.dPersonsStudentsGrupsPersons2;
    }

}
