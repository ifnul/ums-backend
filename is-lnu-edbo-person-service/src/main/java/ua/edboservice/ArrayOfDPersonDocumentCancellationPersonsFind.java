
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonDocumentCancellationPersonsFind complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonDocumentCancellationPersonsFind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonDocumentCancellationPersonsFind" type="{http://edboservice.ua/}dPersonDocumentCancellationPersonsFind" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonDocumentCancellationPersonsFind", propOrder = {
    "dPersonDocumentCancellationPersonsFind"
})
public class ArrayOfDPersonDocumentCancellationPersonsFind {

    @XmlElement(nillable = true)
    protected List<DPersonDocumentCancellationPersonsFind> dPersonDocumentCancellationPersonsFind;

    /**
     * Gets the value of the dPersonDocumentCancellationPersonsFind property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonDocumentCancellationPersonsFind property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonDocumentCancellationPersonsFind().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonDocumentCancellationPersonsFind }
     * 
     * 
     */
    public List<DPersonDocumentCancellationPersonsFind> getDPersonDocumentCancellationPersonsFind() {
        if (dPersonDocumentCancellationPersonsFind == null) {
            dPersonDocumentCancellationPersonsFind = new ArrayList<DPersonDocumentCancellationPersonsFind>();
        }
        return this.dPersonDocumentCancellationPersonsFind;
    }

}
