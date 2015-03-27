
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dEDBOISUOreport_znz1_extExist complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEDBOISUOreport_znz1_extExist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ISUO_ZNZ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="report_year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEDBOISUOreport_znz1_extExist", propOrder = {
    "idISUOZNZ",
    "reportYear"
})
public class DEDBOISUOreportZnz1ExtExist {

    @XmlElement(name = "Id_ISUO_ZNZ")
    protected int idISUOZNZ;
    @XmlElement(name = "report_year")
    protected int reportYear;

    /**
     * Gets the value of the idISUOZNZ property.
     * 
     */
    public int getIdISUOZNZ() {
        return idISUOZNZ;
    }

    /**
     * Sets the value of the idISUOZNZ property.
     * 
     */
    public void setIdISUOZNZ(int value) {
        this.idISUOZNZ = value;
    }

    /**
     * Gets the value of the reportYear property.
     * 
     */
    public int getReportYear() {
        return reportYear;
    }

    /**
     * Sets the value of the reportYear property.
     * 
     */
    public void setReportYear(int value) {
        this.reportYear = value;
    }

}
