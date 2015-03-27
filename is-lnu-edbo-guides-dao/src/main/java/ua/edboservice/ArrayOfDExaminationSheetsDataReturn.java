
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDExaminationSheetsDataReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDExaminationSheetsDataReturn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dExaminationSheetsDataReturn" type="{http://edboservice.ua/}dExaminationSheetsDataReturn" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDExaminationSheetsDataReturn", propOrder = {
    "dExaminationSheetsDataReturn"
})
public class ArrayOfDExaminationSheetsDataReturn {

    @XmlElement(nillable = true)
    protected List<DExaminationSheetsDataReturn> dExaminationSheetsDataReturn;

    /**
     * Gets the value of the dExaminationSheetsDataReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dExaminationSheetsDataReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDExaminationSheetsDataReturn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DExaminationSheetsDataReturn }
     * 
     * 
     */
    public List<DExaminationSheetsDataReturn> getDExaminationSheetsDataReturn() {
        if (dExaminationSheetsDataReturn == null) {
            dExaminationSheetsDataReturn = new ArrayList<DExaminationSheetsDataReturn>();
        }
        return this.dExaminationSheetsDataReturn;
    }

}
