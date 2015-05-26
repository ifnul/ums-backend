
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonOlympiadsAwards2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonOlympiadsAwards2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonOlympiadsAwards2" type="{http://edboservice.ua/}dPersonOlympiadsAwards2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonOlympiadsAwards2", propOrder = {
    "dPersonOlympiadsAwards2"
})
public class ArrayOfDPersonOlympiadsAwards2 {

    @XmlElement(nillable = true)
    protected List<DPersonOlympiadsAwards2> dPersonOlympiadsAwards2;

    /**
     * Gets the value of the dPersonOlympiadsAwards2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonOlympiadsAwards2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonOlympiadsAwards2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonOlympiadsAwards2 }
     * 
     * 
     */
    public List<DPersonOlympiadsAwards2> getDPersonOlympiadsAwards2() {
        if (dPersonOlympiadsAwards2 == null) {
            dPersonOlympiadsAwards2 = new ArrayList<DPersonOlympiadsAwards2>();
        }
        return this.dPersonOlympiadsAwards2;
    }

}
