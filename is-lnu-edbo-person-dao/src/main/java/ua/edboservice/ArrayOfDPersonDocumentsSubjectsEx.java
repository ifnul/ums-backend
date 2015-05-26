
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonDocumentsSubjectsEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonDocumentsSubjectsEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonDocumentsSubjectsEx" type="{http://edboservice.ua/}dPersonDocumentsSubjectsEx" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonDocumentsSubjectsEx", propOrder = {
    "dPersonDocumentsSubjectsEx"
})
public class ArrayOfDPersonDocumentsSubjectsEx {

    @XmlElement(nillable = true)
    protected List<DPersonDocumentsSubjectsEx> dPersonDocumentsSubjectsEx;

    /**
     * Gets the value of the dPersonDocumentsSubjectsEx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonDocumentsSubjectsEx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonDocumentsSubjectsEx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonDocumentsSubjectsEx }
     * 
     * 
     */
    public List<DPersonDocumentsSubjectsEx> getDPersonDocumentsSubjectsEx() {
        if (dPersonDocumentsSubjectsEx == null) {
            dPersonDocumentsSubjectsEx = new ArrayList<DPersonDocumentsSubjectsEx>();
        }
        return this.dPersonDocumentsSubjectsEx;
    }

}
