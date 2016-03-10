
package org.lnu.is.edbo.proxy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDPersonRequestOlympiadsAwards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDPersonRequestOlympiadsAwards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dPersonRequestOlympiadsAwards" type="{http://edboservice.ua/}dPersonRequestOlympiadsAwards" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDPersonRequestOlympiadsAwards", propOrder = {
    "dPersonRequestOlympiadsAwards"
})
public class ArrayOfDPersonRequestOlympiadsAwards {

    @XmlElement(nillable = true)
    protected List<DPersonRequestOlympiadsAwards> dPersonRequestOlympiadsAwards;

    /**
     * Gets the value of the dPersonRequestOlympiadsAwards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dPersonRequestOlympiadsAwards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDPersonRequestOlympiadsAwards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DPersonRequestOlympiadsAwards }
     * 
     * 
     */
    public List<DPersonRequestOlympiadsAwards> getDPersonRequestOlympiadsAwards() {
        if (dPersonRequestOlympiadsAwards == null) {
            dPersonRequestOlympiadsAwards = new ArrayList<DPersonRequestOlympiadsAwards>();
        }
        return this.dPersonRequestOlympiadsAwards;
    }

}
