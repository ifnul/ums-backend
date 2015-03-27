
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDExaminationSheetsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDExaminationSheetsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dExaminationSheetsData" type="{http://edboservice.ua/}dExaminationSheetsData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDExaminationSheetsData", propOrder = {
    "dExaminationSheetsData"
})
public class ArrayOfDExaminationSheetsData {

    @XmlElement(nillable = true)
    protected List<DExaminationSheetsData> dExaminationSheetsData;

    /**
     * Gets the value of the dExaminationSheetsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dExaminationSheetsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDExaminationSheetsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DExaminationSheetsData }
     * 
     * 
     */
    public List<DExaminationSheetsData> getDExaminationSheetsData() {
        if (dExaminationSheetsData == null) {
            dExaminationSheetsData = new ArrayList<DExaminationSheetsData>();
        }
        return this.dExaminationSheetsData;
    }

}
