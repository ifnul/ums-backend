
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonWorkTariffTypes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonWorkTariffTypes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonWorkTariffTypes" type="{http://edboservice.ua/}dPersonWorkTariffTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonWorkTariffTypes", propOrder = {
    "dPersonWorkTariffTypes"
})
public class ArrayOfDPersonWorkTariffTypes {

    @XmlElement(nillable = true)
    protected List<DPersonWorkTariffTypes> dPersonWorkTariffTypes;

    /**
     * Gets the value of the dPersonWorkTariffTypes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonWorkTariffTypes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonWorkTariffTypes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonWorkTariffTypes }
     * 
     * 
     */
    public List<DPersonWorkTariffTypes> getDPersonWorkTariffTypes() {
        if (dPersonWorkTariffTypes == null) {
            dPersonWorkTariffTypes = new ArrayList<DPersonWorkTariffTypes>();
        }
        return this.dPersonWorkTariffTypes;
    }

}
