
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonsStudentsGrupsPersonsFind2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonsStudentsGrupsPersonsFind2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonsStudentsGrupsPersonsFind2" type="{http://edboservice.ua/}dPersonsStudentsGrupsPersonsFind2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonsStudentsGrupsPersonsFind2", propOrder = {
    "dPersonsStudentsGrupsPersonsFind2"
})
public class ArrayOfDPersonsStudentsGrupsPersonsFind2 {

    @XmlElement(nillable = true)
    protected List<DPersonsStudentsGrupsPersonsFind2> dPersonsStudentsGrupsPersonsFind2;

    /**
     * Gets the value of the dPersonsStudentsGrupsPersonsFind2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonsStudentsGrupsPersonsFind2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonsStudentsGrupsPersonsFind2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonsStudentsGrupsPersonsFind2 }
     * 
     * 
     */
    public List<DPersonsStudentsGrupsPersonsFind2> getDPersonsStudentsGrupsPersonsFind2() {
        if (dPersonsStudentsGrupsPersonsFind2 == null) {
            dPersonsStudentsGrupsPersonsFind2 = new ArrayList<DPersonsStudentsGrupsPersonsFind2>();
        }
        return this.dPersonsStudentsGrupsPersonsFind2;
    }

}
