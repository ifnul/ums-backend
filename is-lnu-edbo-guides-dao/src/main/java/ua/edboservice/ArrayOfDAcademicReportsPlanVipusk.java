
package ua.edboservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDAcademicReportsPlanVipusk complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDAcademicReportsPlanVipusk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dAcademicReportsPlanVipusk" type="{http://edboservice.ua/}dAcademicReportsPlanVipusk" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDAcademicReportsPlanVipusk", propOrder = {
    "dAcademicReportsPlanVipusk"
})
public class ArrayOfDAcademicReportsPlanVipusk {

    @XmlElement(nillable = true)
    protected List<DAcademicReportsPlanVipusk> dAcademicReportsPlanVipusk;

    /**
     * Gets the value of the dAcademicReportsPlanVipusk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dAcademicReportsPlanVipusk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDAcademicReportsPlanVipusk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DAcademicReportsPlanVipusk }
     * 
     * 
     */
    public List<DAcademicReportsPlanVipusk> getDAcademicReportsPlanVipusk() {
        if (dAcademicReportsPlanVipusk == null) {
            dAcademicReportsPlanVipusk = new ArrayList<DAcademicReportsPlanVipusk>();
        }
        return this.dAcademicReportsPlanVipusk;
    }

}
