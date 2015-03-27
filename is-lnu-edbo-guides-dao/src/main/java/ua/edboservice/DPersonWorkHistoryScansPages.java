
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dPersonWorkHistoryScansPages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonWorkHistoryScansPages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonWorkHistoryScans" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonWorkHistoryScansPages", propOrder = {
    "pageNumber",
    "idPersonWorkHistoryScans"
})
public class DPersonWorkHistoryScansPages {

    @XmlElement(name = "PageNumber")
    protected int pageNumber;
    @XmlElement(name = "Id_PersonWorkHistoryScans")
    protected int idPersonWorkHistoryScans;

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Gets the value of the idPersonWorkHistoryScans property.
     * 
     */
    public int getIdPersonWorkHistoryScans() {
        return idPersonWorkHistoryScans;
    }

    /**
     * Sets the value of the idPersonWorkHistoryScans property.
     * 
     */
    public void setIdPersonWorkHistoryScans(int value) {
        this.idPersonWorkHistoryScans = value;
    }

}
