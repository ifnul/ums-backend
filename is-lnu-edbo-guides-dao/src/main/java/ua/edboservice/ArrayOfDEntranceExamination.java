
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDEntranceExamination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDEntranceExamination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dEntranceExamination" type="{http://edboservice.ua/}dEntranceExamination" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDEntranceExamination", propOrder = {
    "dEntranceExamination"
})
public class ArrayOfDEntranceExamination {

    @XmlElement(nillable = true)
    protected List<DEntranceExamination> dEntranceExamination;

    /**
     * Gets the value of the dEntranceExamination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dEntranceExamination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEntranceExamination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DEntranceExamination }
     * 
     * 
     */
    public List<DEntranceExamination> getDEntranceExamination() {
        if (dEntranceExamination == null) {
            dEntranceExamination = new ArrayList<DEntranceExamination>();
        }
        return this.dEntranceExamination;
    }

}
