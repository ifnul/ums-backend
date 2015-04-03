
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonAddRet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonAddRet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonAddRet" type="{http://edboservice.ua/}dPersonAddRet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonAddRet", propOrder = {
    "dPersonAddRet"
})
public class ArrayOfDPersonAddRet {

    @XmlElement(nillable = true)
    protected List<DPersonAddRet> dPersonAddRet;

    /**
     * Gets the value of the dPersonAddRet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonAddRet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonAddRet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonAddRet }
     * 
     * 
     */
    public List<DPersonAddRet> getDPersonAddRet() {
        if (dPersonAddRet == null) {
            dPersonAddRet = new ArrayList<DPersonAddRet>();
        }
        return this.dPersonAddRet;
    }

	public void setdPersonAddRet(final List<DPersonAddRet> dPersonAddRet) {
		this.dPersonAddRet = dPersonAddRet;
	}

}
