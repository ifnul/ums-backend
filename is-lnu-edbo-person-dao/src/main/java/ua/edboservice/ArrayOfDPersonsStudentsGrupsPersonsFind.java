
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonsStudentsGrupsPersonsFind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonsStudentsGrupsPersonsFind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonsStudentsGrupsPersonsFind" type="{http://edboservice.ua/}dPersonsStudentsGrupsPersonsFind" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonsStudentsGrupsPersonsFind", propOrder = {
    "dPersonsStudentsGrupsPersonsFind"
})
public class ArrayOfDPersonsStudentsGrupsPersonsFind {

    @XmlElement(nillable = true)
    protected List<DPersonsStudentsGrupsPersonsFind> dPersonsStudentsGrupsPersonsFind;

    /**
     * Gets the value of the dPersonsStudentsGrupsPersonsFind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonsStudentsGrupsPersonsFind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonsStudentsGrupsPersonsFind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonsStudentsGrupsPersonsFind }
     * 
     * 
     */
    public List<DPersonsStudentsGrupsPersonsFind> getDPersonsStudentsGrupsPersonsFind() {
        if (dPersonsStudentsGrupsPersonsFind == null) {
            dPersonsStudentsGrupsPersonsFind = new ArrayList<DPersonsStudentsGrupsPersonsFind>();
        }
        return this.dPersonsStudentsGrupsPersonsFind;
    }

}
