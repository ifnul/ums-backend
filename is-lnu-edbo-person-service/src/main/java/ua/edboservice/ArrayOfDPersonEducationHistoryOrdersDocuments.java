
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonEducationHistoryOrdersDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonEducationHistoryOrdersDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonEducationHistoryOrdersDocuments" type="{http://edboservice.ua/}dPersonEducationHistoryOrdersDocuments" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonEducationHistoryOrdersDocuments", propOrder = {
    "dPersonEducationHistoryOrdersDocuments"
})
public class ArrayOfDPersonEducationHistoryOrdersDocuments {

    @XmlElement(nillable = true)
    protected List<DPersonEducationHistoryOrdersDocuments> dPersonEducationHistoryOrdersDocuments;

    /**
     * Gets the value of the dPersonEducationHistoryOrdersDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonEducationHistoryOrdersDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonEducationHistoryOrdersDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonEducationHistoryOrdersDocuments }
     * 
     * 
     */
    public List<DPersonEducationHistoryOrdersDocuments> getDPersonEducationHistoryOrdersDocuments() {
        if (dPersonEducationHistoryOrdersDocuments == null) {
            dPersonEducationHistoryOrdersDocuments = new ArrayList<DPersonEducationHistoryOrdersDocuments>();
        }
        return this.dPersonEducationHistoryOrdersDocuments;
    }

}
