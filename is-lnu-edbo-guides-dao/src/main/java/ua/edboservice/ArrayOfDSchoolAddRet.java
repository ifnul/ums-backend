
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDSchoolAddRet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDSchoolAddRet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dSchoolAddRet" type="{http://edboservice.ua/}dSchoolAddRet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDSchoolAddRet", propOrder = {
    "dSchoolAddRet"
})
public class ArrayOfDSchoolAddRet {

    @XmlElement(nillable = true)
    protected List<DSchoolAddRet> dSchoolAddRet;

    /**
     * Gets the value of the dSchoolAddRet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dSchoolAddRet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDSchoolAddRet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DSchoolAddRet }
     * 
     * 
     */
    public List<DSchoolAddRet> getDSchoolAddRet() {
        if (dSchoolAddRet == null) {
            dSchoolAddRet = new ArrayList<DSchoolAddRet>();
        }
        return this.dSchoolAddRet;
    }

}
