
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dReceptionConditionAdditionsTableData234Periods complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReceptionConditionAdditionsTableData234Periods">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData234Periods" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReceptionConditionAdditionsTableData234" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DurYears" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DurMonths" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReceptionConditionAdditionsTableData234Periods", propOrder = {
    "idReceptionConditionAdditionsTableData234Periods",
    "idReceptionConditionAdditionsTableData234",
    "durYears",
    "durMonths",
    "comments"
})
public class DReceptionConditionAdditionsTableData234Periods {

    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData234Periods")
    protected int idReceptionConditionAdditionsTableData234Periods;
    @XmlElement(name = "Id_ReceptionConditionAdditionsTableData234")
    protected int idReceptionConditionAdditionsTableData234;
    @XmlElement(name = "DurYears")
    protected int durYears;
    @XmlElement(name = "DurMonths")
    protected int durMonths;
    @XmlElement(name = "Comments")
    protected String comments;

    /**
     * Gets the value of the idReceptionConditionAdditionsTableData234Periods property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData234Periods() {
        return idReceptionConditionAdditionsTableData234Periods;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData234Periods property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData234Periods(int value) {
        this.idReceptionConditionAdditionsTableData234Periods = value;
    }

    /**
     * Gets the value of the idReceptionConditionAdditionsTableData234 property.
     * 
     */
    public int getIdReceptionConditionAdditionsTableData234() {
        return idReceptionConditionAdditionsTableData234;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsTableData234 property.
     * 
     */
    public void setIdReceptionConditionAdditionsTableData234(int value) {
        this.idReceptionConditionAdditionsTableData234 = value;
    }

    /**
     * Gets the value of the durYears property.
     * 
     */
    public int getDurYears() {
        return durYears;
    }

    /**
     * Sets the value of the durYears property.
     * 
     */
    public void setDurYears(int value) {
        this.durYears = value;
    }

    /**
     * Gets the value of the durMonths property.
     * 
     */
    public int getDurMonths() {
        return durMonths;
    }

    /**
     * Sets the value of the durMonths property.
     * 
     */
    public void setDurMonths(int value) {
        this.durMonths = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
