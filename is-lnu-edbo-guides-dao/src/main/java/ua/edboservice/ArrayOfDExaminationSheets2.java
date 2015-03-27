
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDExaminationSheets2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDExaminationSheets2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dExaminationSheets2" type="{http://edboservice.ua/}dExaminationSheets2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDExaminationSheets2", propOrder = {
    "dExaminationSheets2"
})
public class ArrayOfDExaminationSheets2 {

    @XmlElement(nillable = true)
    protected List<DExaminationSheets2> dExaminationSheets2;

    /**
     * Gets the value of the dExaminationSheets2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dExaminationSheets2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDExaminationSheets2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DExaminationSheets2 }
     * 
     * 
     */
    public List<DExaminationSheets2> getDExaminationSheets2() {
        if (dExaminationSheets2 == null) {
            dExaminationSheets2 = new ArrayList<DExaminationSheets2>();
        }
        return this.dExaminationSheets2;
    }

}
