
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDWebPersonStatementData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDWebPersonStatementData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dWebPersonStatementData" type="{http://edboservice.ua/}dWebPersonStatementData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDWebPersonStatementData", propOrder = {
    "dWebPersonStatementData"
})
public class ArrayOfDWebPersonStatementData {

    @XmlElement(nillable = true)
    protected List<DWebPersonStatementData> dWebPersonStatementData;

    /**
     * Gets the value of the dWebPersonStatementData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dWebPersonStatementData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDWebPersonStatementData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DWebPersonStatementData }
     * 
     * 
     */
    public List<DWebPersonStatementData> getDWebPersonStatementData() {
        if (dWebPersonStatementData == null) {
            dWebPersonStatementData = new ArrayList<DWebPersonStatementData>();
        }
        return this.dWebPersonStatementData;
    }

}
