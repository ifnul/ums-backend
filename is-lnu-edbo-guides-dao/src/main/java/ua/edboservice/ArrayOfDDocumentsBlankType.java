
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDDocumentsBlankType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDDocumentsBlankType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dDocumentsBlankType" type="{http://edboservice.ua/}dDocumentsBlankType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDDocumentsBlankType", propOrder = {
    "dDocumentsBlankType"
})
public class ArrayOfDDocumentsBlankType {

    @XmlElement(nillable = true)
    protected List<DDocumentsBlankType> dDocumentsBlankType;

    /**
     * Gets the value of the dDocumentsBlankType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dDocumentsBlankType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDDocumentsBlankType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DDocumentsBlankType }
     * 
     * 
     */
    public List<DDocumentsBlankType> getDDocumentsBlankType() {
        if (dDocumentsBlankType == null) {
            dDocumentsBlankType = new ArrayList<DDocumentsBlankType>();
        }
        return this.dDocumentsBlankType;
    }

}
