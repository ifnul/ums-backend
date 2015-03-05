
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDOrdersOfEnrollmentsAdditionalOrdersDataCauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDOrdersOfEnrollmentsAdditionalOrdersDataCauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dOrdersOfEnrollmentsAdditionalOrdersDataCauseType" type="{http://edboservice.ua/}dOrdersOfEnrollmentsAdditionalOrdersDataCauseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDOrdersOfEnrollmentsAdditionalOrdersDataCauseType", propOrder = {
    "dOrdersOfEnrollmentsAdditionalOrdersDataCauseType"
})
public class ArrayOfDOrdersOfEnrollmentsAdditionalOrdersDataCauseType {

    @XmlElement(nillable = true)
    protected List<DOrdersOfEnrollmentsAdditionalOrdersDataCauseType> dOrdersOfEnrollmentsAdditionalOrdersDataCauseType;

    /**
     * Gets the value of the dOrdersOfEnrollmentsAdditionalOrdersDataCauseType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dOrdersOfEnrollmentsAdditionalOrdersDataCauseType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDOrdersOfEnrollmentsAdditionalOrdersDataCauseType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DOrdersOfEnrollmentsAdditionalOrdersDataCauseType }
     * 
     * 
     */
    public List<DOrdersOfEnrollmentsAdditionalOrdersDataCauseType> getDOrdersOfEnrollmentsAdditionalOrdersDataCauseType() {
        if (dOrdersOfEnrollmentsAdditionalOrdersDataCauseType == null) {
            dOrdersOfEnrollmentsAdditionalOrdersDataCauseType = new ArrayList<DOrdersOfEnrollmentsAdditionalOrdersDataCauseType>();
        }
        return this.dOrdersOfEnrollmentsAdditionalOrdersDataCauseType;
    }

}
