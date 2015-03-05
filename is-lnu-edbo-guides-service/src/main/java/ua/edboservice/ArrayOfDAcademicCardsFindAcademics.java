
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicCardsFindAcademics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicCardsFindAcademics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicCardsFindAcademics" type="{http://edboservice.ua/}dAcademicCardsFindAcademics" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicCardsFindAcademics", propOrder = {
    "dAcademicCardsFindAcademics"
})
public class ArrayOfDAcademicCardsFindAcademics {

    @XmlElement(nillable = true)
    protected List<DAcademicCardsFindAcademics> dAcademicCardsFindAcademics;

    /**
     * Gets the value of the dAcademicCardsFindAcademics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicCardsFindAcademics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicCardsFindAcademics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicCardsFindAcademics }
     * 
     * 
     */
    public List<DAcademicCardsFindAcademics> getDAcademicCardsFindAcademics() {
        if (dAcademicCardsFindAcademics == null) {
            dAcademicCardsFindAcademics = new ArrayList<DAcademicCardsFindAcademics>();
        }
        return this.dAcademicCardsFindAcademics;
    }

}
