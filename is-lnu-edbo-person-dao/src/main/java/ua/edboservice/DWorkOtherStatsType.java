
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dWorkOtherStatsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dWorkOtherStatsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_WorkOtherStatType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WorkOtherStatTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkOtherStatTypeDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dWorkOtherStatsType", propOrder = {
    "idWorkOtherStatType",
    "workOtherStatTypeName",
    "workOtherStatTypeDateLastChange"
})
public class DWorkOtherStatsType {

    @XmlElement(name = "Id_WorkOtherStatType")
    protected int idWorkOtherStatType;
    @XmlElement(name = "WorkOtherStatTypeName")
    protected String workOtherStatTypeName;
    @XmlElement(name = "WorkOtherStatTypeDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar workOtherStatTypeDateLastChange;

    /**
     * Gets the value of the idWorkOtherStatType property.
     * 
     */
    public int getIdWorkOtherStatType() {
        return idWorkOtherStatType;
    }

    /**
     * Sets the value of the idWorkOtherStatType property.
     * 
     */
    public void setIdWorkOtherStatType(int value) {
        this.idWorkOtherStatType = value;
    }

    /**
     * Gets the value of the workOtherStatTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOtherStatTypeName() {
        return workOtherStatTypeName;
    }

    /**
     * Sets the value of the workOtherStatTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOtherStatTypeName(String value) {
        this.workOtherStatTypeName = value;
    }

    /**
     * Gets the value of the workOtherStatTypeDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWorkOtherStatTypeDateLastChange() {
        return workOtherStatTypeDateLastChange;
    }

    /**
     * Sets the value of the workOtherStatTypeDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWorkOtherStatTypeDateLastChange(XMLGregorianCalendar value) {
        this.workOtherStatTypeDateLastChange = value;
    }

}
