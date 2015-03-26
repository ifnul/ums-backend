
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDGraduatesDataAdditionalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDGraduatesDataAdditionalInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dGraduatesDataAdditionalInfo" type="{http://edboservice.ua/}dGraduatesDataAdditionalInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDGraduatesDataAdditionalInfo", propOrder = {
    "dGraduatesDataAdditionalInfo"
})
public class ArrayOfDGraduatesDataAdditionalInfo {

    @XmlElement(nillable = true)
    protected List<DGraduatesDataAdditionalInfo> dGraduatesDataAdditionalInfo;

    /**
     * Gets the value of the dGraduatesDataAdditionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dGraduatesDataAdditionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDGraduatesDataAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DGraduatesDataAdditionalInfo }
     * 
     * 
     */
    public List<DGraduatesDataAdditionalInfo> getDGraduatesDataAdditionalInfo() {
        if (dGraduatesDataAdditionalInfo == null) {
            dGraduatesDataAdditionalInfo = new ArrayList<DGraduatesDataAdditionalInfo>();
        }
        return this.dGraduatesDataAdditionalInfo;
    }

}
