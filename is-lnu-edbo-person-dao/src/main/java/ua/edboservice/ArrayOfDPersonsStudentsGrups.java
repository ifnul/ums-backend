
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonsStudentsGrups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonsStudentsGrups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonsStudentsGrups" type="{http://edboservice.ua/}dPersonsStudentsGrups" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonsStudentsGrups", propOrder = {
    "dPersonsStudentsGrups"
})
public class ArrayOfDPersonsStudentsGrups {

    @XmlElement(nillable = true)
    protected List<DPersonsStudentsGrups> dPersonsStudentsGrups;

    /**
     * Gets the value of the dPersonsStudentsGrups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonsStudentsGrups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonsStudentsGrups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonsStudentsGrups }
     * 
     * 
     */
    public List<DPersonsStudentsGrups> getDPersonsStudentsGrups() {
        if (dPersonsStudentsGrups == null) {
            dPersonsStudentsGrups = new ArrayList<DPersonsStudentsGrups>();
        }
        return this.dPersonsStudentsGrups;
    }

}
