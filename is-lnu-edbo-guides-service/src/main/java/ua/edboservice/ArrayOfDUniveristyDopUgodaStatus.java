
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDUniveristyDopUgodaStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDUniveristyDopUgodaStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dUniveristyDopUgodaStatus" type="{http://edboservice.ua/}dUniveristyDopUgodaStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDUniveristyDopUgodaStatus", propOrder = {
    "dUniveristyDopUgodaStatus"
})
public class ArrayOfDUniveristyDopUgodaStatus {

    @XmlElement(nillable = true)
    protected List<DUniveristyDopUgodaStatus> dUniveristyDopUgodaStatus;

    /**
     * Gets the value of the dUniveristyDopUgodaStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dUniveristyDopUgodaStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDUniveristyDopUgodaStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DUniveristyDopUgodaStatus }
     * 
     * 
     */
    public List<DUniveristyDopUgodaStatus> getDUniveristyDopUgodaStatus() {
        if (dUniveristyDopUgodaStatus == null) {
            dUniveristyDopUgodaStatus = new ArrayList<DUniveristyDopUgodaStatus>();
        }
        return this.dUniveristyDopUgodaStatus;
    }

}
