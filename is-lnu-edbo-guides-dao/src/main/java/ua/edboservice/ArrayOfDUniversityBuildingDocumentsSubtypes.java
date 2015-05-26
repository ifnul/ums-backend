
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniversityBuildingDocumentsSubtypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniversityBuildingDocumentsSubtypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniversityBuildingDocumentsSubtypes" type="{http://edboservice.ua/}dUniversityBuildingDocumentsSubtypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniversityBuildingDocumentsSubtypes", propOrder = {
    "dUniversityBuildingDocumentsSubtypes"
})
public class ArrayOfDUniversityBuildingDocumentsSubtypes {

    @XmlElement(nillable = true)
    protected List<DUniversityBuildingDocumentsSubtypes> dUniversityBuildingDocumentsSubtypes;

    /**
     * Gets the value of the dUniversityBuildingDocumentsSubtypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniversityBuildingDocumentsSubtypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniversityBuildingDocumentsSubtypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniversityBuildingDocumentsSubtypes }
     * 
     * 
     */
    public List<DUniversityBuildingDocumentsSubtypes> getDUniversityBuildingDocumentsSubtypes() {
        if (dUniversityBuildingDocumentsSubtypes == null) {
            dUniversityBuildingDocumentsSubtypes = new ArrayList<DUniversityBuildingDocumentsSubtypes>();
        }
        return this.dUniversityBuildingDocumentsSubtypes;
    }

}
