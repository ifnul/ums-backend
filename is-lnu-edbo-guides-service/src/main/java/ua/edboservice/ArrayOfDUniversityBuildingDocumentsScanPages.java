
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityBuildingDocumentsScanPages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityBuildingDocumentsScanPages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityBuildingDocumentsScanPages" type="{http://edboservice.ua/}dUniversityBuildingDocumentsScanPages" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityBuildingDocumentsScanPages", propOrder = {
    "dUniversityBuildingDocumentsScanPages"
})
public class ArrayOfDUniversityBuildingDocumentsScanPages {

    @XmlElement(nillable = true)
    protected List<DUniversityBuildingDocumentsScanPages> dUniversityBuildingDocumentsScanPages;

    /**
     * Gets the value of the dUniversityBuildingDocumentsScanPages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityBuildingDocumentsScanPages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityBuildingDocumentsScanPages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityBuildingDocumentsScanPages }
     * 
     * 
     */
    public List<DUniversityBuildingDocumentsScanPages> getDUniversityBuildingDocumentsScanPages() {
        if (dUniversityBuildingDocumentsScanPages == null) {
            dUniversityBuildingDocumentsScanPages = new ArrayList<DUniversityBuildingDocumentsScanPages>();
        }
        return this.dUniversityBuildingDocumentsScanPages;
    }

}
