
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOlympiadsAwards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOlympiadsAwards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOlympiadsAwards" type="{http://edboservice.ua/}dOlympiadsAwards" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOlympiadsAwards", propOrder = {
    "dOlympiadsAwards"
})
public class ArrayOfDOlympiadsAwards {

    @XmlElement(nillable = true)
    protected List<DOlympiadsAwards> dOlympiadsAwards;

    /**
     * Gets the value of the dOlympiadsAwards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOlympiadsAwards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOlympiadsAwards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOlympiadsAwards }
     * 
     * 
     */
    public List<DOlympiadsAwards> getDOlympiadsAwards() {
        if (dOlympiadsAwards == null) {
            dOlympiadsAwards = new ArrayList<DOlympiadsAwards>();
        }
        return this.dOlympiadsAwards;
    }

}
