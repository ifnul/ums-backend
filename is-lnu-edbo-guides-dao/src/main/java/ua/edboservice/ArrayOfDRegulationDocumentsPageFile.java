
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDRegulationDocumentsPageFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDRegulationDocumentsPageFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dRegulationDocumentsPageFile" type="{http://edboservice.ua/}dRegulationDocumentsPageFile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDRegulationDocumentsPageFile", propOrder = {
    "dRegulationDocumentsPageFile"
})
public class ArrayOfDRegulationDocumentsPageFile {

    @XmlElement(nillable = true)
    protected List<DRegulationDocumentsPageFile> dRegulationDocumentsPageFile;

    /**
     * Gets the value of the dRegulationDocumentsPageFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dRegulationDocumentsPageFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDRegulationDocumentsPageFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DRegulationDocumentsPageFile }
     * 
     * 
     */
    public List<DRegulationDocumentsPageFile> getDRegulationDocumentsPageFile() {
        if (dRegulationDocumentsPageFile == null) {
            dRegulationDocumentsPageFile = new ArrayList<DRegulationDocumentsPageFile>();
        }
        return this.dRegulationDocumentsPageFile;
    }

}
