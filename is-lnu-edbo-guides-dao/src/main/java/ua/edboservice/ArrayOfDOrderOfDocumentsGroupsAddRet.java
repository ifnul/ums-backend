
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrderOfDocumentsGroupsAddRet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrderOfDocumentsGroupsAddRet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrderOfDocumentsGroupsAddRet" type="{http://edboservice.ua/}dOrderOfDocumentsGroupsAddRet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrderOfDocumentsGroupsAddRet", propOrder = {
    "dOrderOfDocumentsGroupsAddRet"
})
public class ArrayOfDOrderOfDocumentsGroupsAddRet {

    @XmlElement(nillable = true)
    protected List<DOrderOfDocumentsGroupsAddRet> dOrderOfDocumentsGroupsAddRet;

    /**
     * Gets the value of the dOrderOfDocumentsGroupsAddRet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrderOfDocumentsGroupsAddRet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrderOfDocumentsGroupsAddRet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrderOfDocumentsGroupsAddRet }
     * 
     * 
     */
    public List<DOrderOfDocumentsGroupsAddRet> getDOrderOfDocumentsGroupsAddRet() {
        if (dOrderOfDocumentsGroupsAddRet == null) {
            dOrderOfDocumentsGroupsAddRet = new ArrayList<DOrderOfDocumentsGroupsAddRet>();
        }
        return this.dOrderOfDocumentsGroupsAddRet;
    }

}
