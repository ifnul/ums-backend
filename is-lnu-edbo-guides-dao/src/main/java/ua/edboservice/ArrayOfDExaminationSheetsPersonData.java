
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDExaminationSheetsPersonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDExaminationSheetsPersonData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dExaminationSheetsPersonData" type="{http://edboservice.ua/}dExaminationSheetsPersonData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDExaminationSheetsPersonData", propOrder = {
    "dExaminationSheetsPersonData"
})
public class ArrayOfDExaminationSheetsPersonData {

    @XmlElement(nillable = true)
    protected List<DExaminationSheetsPersonData> dExaminationSheetsPersonData;

    /**
     * Gets the value of the dExaminationSheetsPersonData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dExaminationSheetsPersonData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDExaminationSheetsPersonData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DExaminationSheetsPersonData }
     * 
     * 
     */
    public List<DExaminationSheetsPersonData> getDExaminationSheetsPersonData() {
        if (dExaminationSheetsPersonData == null) {
            dExaminationSheetsPersonData = new ArrayList<DExaminationSheetsPersonData>();
        }
        return this.dExaminationSheetsPersonData;
    }

}
