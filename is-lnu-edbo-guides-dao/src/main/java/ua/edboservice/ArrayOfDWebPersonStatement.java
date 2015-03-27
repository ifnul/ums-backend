
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDWebPersonStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDWebPersonStatement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dWebPersonStatement" type="{http://edboservice.ua/}dWebPersonStatement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDWebPersonStatement", propOrder = {
    "dWebPersonStatement"
})
public class ArrayOfDWebPersonStatement {

    @XmlElement(nillable = true)
    protected List<DWebPersonStatement> dWebPersonStatement;

    /**
     * Gets the value of the dWebPersonStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dWebPersonStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDWebPersonStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DWebPersonStatement }
     * 
     * 
     */
    public List<DWebPersonStatement> getDWebPersonStatement() {
        if (dWebPersonStatement == null) {
            dWebPersonStatement = new ArrayList<DWebPersonStatement>();
        }
        return this.dWebPersonStatement;
    }

}
