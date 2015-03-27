
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAlertsDetaisText complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAlertsDetaisText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAlertsDetaisText" type="{http://edboservice.ua/}dAlertsDetaisText" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAlertsDetaisText", propOrder = {
    "dAlertsDetaisText"
})
public class ArrayOfDAlertsDetaisText {

    @XmlElement(nillable = true)
    protected List<DAlertsDetaisText> dAlertsDetaisText;

    /**
     * Gets the value of the dAlertsDetaisText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAlertsDetaisText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAlertsDetaisText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAlertsDetaisText }
     * 
     * 
     */
    public List<DAlertsDetaisText> getDAlertsDetaisText() {
        if (dAlertsDetaisText == null) {
            dAlertsDetaisText = new ArrayList<DAlertsDetaisText>();
        }
        return this.dAlertsDetaisText;
    }

}
