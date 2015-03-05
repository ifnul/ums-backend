
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDRegulationDocumentTypesGroups complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDRegulationDocumentTypesGroups">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dRegulationDocumentTypesGroups" type="{http://edboservice.ua/}dRegulationDocumentTypesGroups" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDRegulationDocumentTypesGroups", propOrder = {
    "dRegulationDocumentTypesGroups"
})
public class ArrayOfDRegulationDocumentTypesGroups {

    @XmlElement(nillable = true)
    protected List<DRegulationDocumentTypesGroups> dRegulationDocumentTypesGroups;

    /**
     * Gets the value of the dRegulationDocumentTypesGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dRegulationDocumentTypesGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDRegulationDocumentTypesGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DRegulationDocumentTypesGroups }
     * 
     * 
     */
    public List<DRegulationDocumentTypesGroups> getDRegulationDocumentTypesGroups() {
        if (dRegulationDocumentTypesGroups == null) {
            dRegulationDocumentTypesGroups = new ArrayList<DRegulationDocumentTypesGroups>();
        }
        return this.dRegulationDocumentTypesGroups;
    }

}
