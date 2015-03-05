
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonsStudentsGrupsPersonsAdditional2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonsStudentsGrupsPersonsAdditional2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonsStudentsGrupsPersonsAdditional2" type="{http://edboservice.ua/}dPersonsStudentsGrupsPersonsAdditional2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonsStudentsGrupsPersonsAdditional2", propOrder = {
    "dPersonsStudentsGrupsPersonsAdditional2"
})
public class ArrayOfDPersonsStudentsGrupsPersonsAdditional2 {

    @XmlElement(nillable = true)
    protected List<DPersonsStudentsGrupsPersonsAdditional2> dPersonsStudentsGrupsPersonsAdditional2;

    /**
     * Gets the value of the dPersonsStudentsGrupsPersonsAdditional2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonsStudentsGrupsPersonsAdditional2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonsStudentsGrupsPersonsAdditional2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonsStudentsGrupsPersonsAdditional2 }
     * 
     * 
     */
    public List<DPersonsStudentsGrupsPersonsAdditional2> getDPersonsStudentsGrupsPersonsAdditional2() {
        if (dPersonsStudentsGrupsPersonsAdditional2 == null) {
            dPersonsStudentsGrupsPersonsAdditional2 = new ArrayList<DPersonsStudentsGrupsPersonsAdditional2>();
        }
        return this.dPersonsStudentsGrupsPersonsAdditional2;
    }

}
