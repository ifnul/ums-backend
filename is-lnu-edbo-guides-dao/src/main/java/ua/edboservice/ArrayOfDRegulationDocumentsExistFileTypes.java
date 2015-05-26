
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDRegulationDocumentsExistFileTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDRegulationDocumentsExistFileTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dRegulationDocumentsExistFileTypes" type="{http://edboservice.ua/}dRegulationDocumentsExistFileTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDRegulationDocumentsExistFileTypes", propOrder = {
    "dRegulationDocumentsExistFileTypes"
})
public class ArrayOfDRegulationDocumentsExistFileTypes {

    @XmlElement(nillable = true)
    protected List<DRegulationDocumentsExistFileTypes> dRegulationDocumentsExistFileTypes;

    /**
     * Gets the value of the dRegulationDocumentsExistFileTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dRegulationDocumentsExistFileTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDRegulationDocumentsExistFileTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DRegulationDocumentsExistFileTypes }
     * 
     * 
     */
    public List<DRegulationDocumentsExistFileTypes> getDRegulationDocumentsExistFileTypes() {
        if (dRegulationDocumentsExistFileTypes == null) {
            dRegulationDocumentsExistFileTypes = new ArrayList<DRegulationDocumentsExistFileTypes>();
        }
        return this.dRegulationDocumentsExistFileTypes;
    }

}
