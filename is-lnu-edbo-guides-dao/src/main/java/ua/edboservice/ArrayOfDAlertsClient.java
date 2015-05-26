
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAlertsClient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAlertsClient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAlertsClient" type="{http://edboservice.ua/}dAlertsClient" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAlertsClient", propOrder = {
    "dAlertsClient"
})
public class ArrayOfDAlertsClient {

    @XmlElement(nillable = true)
    protected List<DAlertsClient> dAlertsClient;

    /**
     * Gets the value of the dAlertsClient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAlertsClient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAlertsClient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAlertsClient }
     * 
     * 
     */
    public List<DAlertsClient> getDAlertsClient() {
        if (dAlertsClient == null) {
            dAlertsClient = new ArrayList<DAlertsClient>();
        }
        return this.dAlertsClient;
    }

}
