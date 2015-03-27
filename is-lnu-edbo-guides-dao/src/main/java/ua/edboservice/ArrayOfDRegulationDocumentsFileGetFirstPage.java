
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDRegulationDocumentsFileGetFirstPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDRegulationDocumentsFileGetFirstPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dRegulationDocumentsFileGetFirstPage" type="{http://edboservice.ua/}dRegulationDocumentsFileGetFirstPage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDRegulationDocumentsFileGetFirstPage", propOrder = {
    "dRegulationDocumentsFileGetFirstPage"
})
public class ArrayOfDRegulationDocumentsFileGetFirstPage {

    @XmlElement(nillable = true)
    protected List<DRegulationDocumentsFileGetFirstPage> dRegulationDocumentsFileGetFirstPage;

    /**
     * Gets the value of the dRegulationDocumentsFileGetFirstPage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dRegulationDocumentsFileGetFirstPage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDRegulationDocumentsFileGetFirstPage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DRegulationDocumentsFileGetFirstPage }
     * 
     * 
     */
    public List<DRegulationDocumentsFileGetFirstPage> getDRegulationDocumentsFileGetFirstPage() {
        if (dRegulationDocumentsFileGetFirstPage == null) {
            dRegulationDocumentsFileGetFirstPage = new ArrayList<DRegulationDocumentsFileGetFirstPage>();
        }
        return this.dRegulationDocumentsFileGetFirstPage;
    }

}
