
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDGetUserPersonRet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDGetUserPersonRet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dGetUserPersonRet" type="{http://edboservice.ua/}dGetUserPersonRet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDGetUserPersonRet", propOrder = {
    "dGetUserPersonRet"
})
public class ArrayOfDGetUserPersonRet {

    @XmlElement(nillable = true)
    protected List<DGetUserPersonRet> dGetUserPersonRet;

    /**
     * Gets the value of the dGetUserPersonRet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dGetUserPersonRet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDGetUserPersonRet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DGetUserPersonRet }
     * 
     * 
     */
    public List<DGetUserPersonRet> getDGetUserPersonRet() {
        if (dGetUserPersonRet == null) {
            dGetUserPersonRet = new ArrayList<DGetUserPersonRet>();
        }
        return this.dGetUserPersonRet;
    }

}
