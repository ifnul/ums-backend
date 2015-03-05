
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDDictOrderOfDocumentsRegionsDocuments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDDictOrderOfDocumentsRegionsDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dDictOrderOfDocumentsRegionsDocuments" type="{http://edboservice.ua/}dDictOrderOfDocumentsRegionsDocuments" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDDictOrderOfDocumentsRegionsDocuments", propOrder = {
    "dDictOrderOfDocumentsRegionsDocuments"
})
public class ArrayOfDDictOrderOfDocumentsRegionsDocuments {

    @XmlElement(nillable = true)
    protected List<DDictOrderOfDocumentsRegionsDocuments> dDictOrderOfDocumentsRegionsDocuments;

    /**
     * Gets the value of the dDictOrderOfDocumentsRegionsDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dDictOrderOfDocumentsRegionsDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDDictOrderOfDocumentsRegionsDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DDictOrderOfDocumentsRegionsDocuments }
     * 
     * 
     */
    public List<DDictOrderOfDocumentsRegionsDocuments> getDDictOrderOfDocumentsRegionsDocuments() {
        if (dDictOrderOfDocumentsRegionsDocuments == null) {
            dDictOrderOfDocumentsRegionsDocuments = new ArrayList<DDictOrderOfDocumentsRegionsDocuments>();
        }
        return this.dDictOrderOfDocumentsRegionsDocuments;
    }

}
