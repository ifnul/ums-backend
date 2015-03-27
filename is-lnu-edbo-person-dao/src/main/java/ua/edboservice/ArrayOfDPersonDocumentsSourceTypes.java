
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonDocumentsSourceTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonDocumentsSourceTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonDocumentsSourceTypes" type="{http://edboservice.ua/}dPersonDocumentsSourceTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonDocumentsSourceTypes", propOrder = {
    "dPersonDocumentsSourceTypes"
})
public class ArrayOfDPersonDocumentsSourceTypes {

    @XmlElement(nillable = true)
    protected List<DPersonDocumentsSourceTypes> dPersonDocumentsSourceTypes;

    /**
     * Gets the value of the dPersonDocumentsSourceTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonDocumentsSourceTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonDocumentsSourceTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonDocumentsSourceTypes }
     * 
     * 
     */
    public List<DPersonDocumentsSourceTypes> getDPersonDocumentsSourceTypes() {
        if (dPersonDocumentsSourceTypes == null) {
            dPersonDocumentsSourceTypes = new ArrayList<DPersonDocumentsSourceTypes>();
        }
        return this.dPersonDocumentsSourceTypes;
    }

}
