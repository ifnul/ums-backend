
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDRequestExaminationCauses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDRequestExaminationCauses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dRequestExaminationCauses" type="{http://edboservice.ua/}dRequestExaminationCauses" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDRequestExaminationCauses", propOrder = {
    "dRequestExaminationCauses"
})
public class ArrayOfDRequestExaminationCauses {

    @XmlElement(nillable = true)
    protected List<DRequestExaminationCauses> dRequestExaminationCauses;

    /**
     * Gets the value of the dRequestExaminationCauses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dRequestExaminationCauses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDRequestExaminationCauses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DRequestExaminationCauses }
     * 
     * 
     */
    public List<DRequestExaminationCauses> getDRequestExaminationCauses() {
        if (dRequestExaminationCauses == null) {
            dRequestExaminationCauses = new ArrayList<DRequestExaminationCauses>();
        }
        return this.dRequestExaminationCauses;
    }

}
