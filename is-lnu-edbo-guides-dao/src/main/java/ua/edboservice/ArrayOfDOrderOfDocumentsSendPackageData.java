
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrderOfDocumentsSendPackageData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrderOfDocumentsSendPackageData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrderOfDocumentsSendPackageData" type="{http://edboservice.ua/}dOrderOfDocumentsSendPackageData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrderOfDocumentsSendPackageData", propOrder = {
    "dOrderOfDocumentsSendPackageData"
})
public class ArrayOfDOrderOfDocumentsSendPackageData {

    @XmlElement(nillable = true)
    protected List<DOrderOfDocumentsSendPackageData> dOrderOfDocumentsSendPackageData;

    /**
     * Gets the value of the dOrderOfDocumentsSendPackageData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrderOfDocumentsSendPackageData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrderOfDocumentsSendPackageData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrderOfDocumentsSendPackageData }
     * 
     * 
     */
    public List<DOrderOfDocumentsSendPackageData> getDOrderOfDocumentsSendPackageData() {
        if (dOrderOfDocumentsSendPackageData == null) {
            dOrderOfDocumentsSendPackageData = new ArrayList<DOrderOfDocumentsSendPackageData>();
        }
        return this.dOrderOfDocumentsSendPackageData;
    }

}
