
package org.lnu.is.edbo.person_min;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonOlympiadsAwards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonOlympiadsAwards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonOlympiadsAwards" type="{http://edboservice.ua/}dPersonOlympiadsAwards" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonOlympiadsAwards", propOrder = {
    "dPersonOlympiadsAwards"
})
public class ArrayOfDPersonOlympiadsAwards {

    @XmlElement(nillable = true)
    protected List<DPersonOlympiadsAwards> dPersonOlympiadsAwards;

    /**
     * Gets the value of the dPersonOlympiadsAwards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonOlympiadsAwards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonOlympiadsAwards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonOlympiadsAwards }
     * 
     * 
     */
    public List<DPersonOlympiadsAwards> getDPersonOlympiadsAwards() {
        if (dPersonOlympiadsAwards == null) {
            dPersonOlympiadsAwards = new ArrayList<DPersonOlympiadsAwards>();
        }
        return this.dPersonOlympiadsAwards;
    }

}
