
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonsStudentsGrups2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonsStudentsGrups2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonsStudentsGrups2" type="{http://edboservice.ua/}dPersonsStudentsGrups2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonsStudentsGrups2", propOrder = {
    "dPersonsStudentsGrups2"
})
public class ArrayOfDPersonsStudentsGrups2 {

    @XmlElement(nillable = true)
    protected List<DPersonsStudentsGrups2> dPersonsStudentsGrups2;

    /**
     * Gets the value of the dPersonsStudentsGrups2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonsStudentsGrups2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonsStudentsGrups2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonsStudentsGrups2 }
     * 
     * 
     */
    public List<DPersonsStudentsGrups2> getDPersonsStudentsGrups2() {
        if (dPersonsStudentsGrups2 == null) {
            dPersonsStudentsGrups2 = new ArrayList<DPersonsStudentsGrups2>();
        }
        return this.dPersonsStudentsGrups2;
    }

}
