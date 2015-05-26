
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonHistoryGet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonHistoryGet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_UserActionsHistory" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ActionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OldValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateStartAction" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PKRowInTable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonHistoryGet", propOrder = {
    "idUserActionsHistory",
    "actionName",
    "oldValue",
    "newValue",
    "dateStartAction",
    "pkRowInTable"
})
public class DPersonHistoryGet {

    @XmlElement(name = "Id_UserActionsHistory")
    protected int idUserActionsHistory;
    @XmlElement(name = "ActionName")
    protected String actionName;
    @XmlElement(name = "OldValue")
    protected String oldValue;
    @XmlElement(name = "NewValue")
    protected String newValue;
    @XmlElement(name = "DateStartAction", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateStartAction;
    @XmlElement(name = "PKRowInTable")
    protected int pkRowInTable;

    /**
     * Gets the value of the idUserActionsHistory property.
     * 
     */
    public int getIdUserActionsHistory() {
        return idUserActionsHistory;
    }

    /**
     * Sets the value of the idUserActionsHistory property.
     * 
     */
    public void setIdUserActionsHistory(int value) {
        this.idUserActionsHistory = value;
    }

    /**
     * Gets the value of the actionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Sets the value of the actionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

    /**
     * Gets the value of the oldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldValue() {
        return oldValue;
    }

    /**
     * Sets the value of the oldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldValue(String value) {
        this.oldValue = value;
    }

    /**
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewValue(String value) {
        this.newValue = value;
    }

    /**
     * Gets the value of the dateStartAction property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateStartAction() {
        return dateStartAction;
    }

    /**
     * Sets the value of the dateStartAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateStartAction(XMLGregorianCalendar value) {
        this.dateStartAction = value;
    }

    /**
     * Gets the value of the pkRowInTable property.
     * 
     */
    public int getPKRowInTable() {
        return pkRowInTable;
    }

    /**
     * Sets the value of the pkRowInTable property.
     * 
     */
    public void setPKRowInTable(int value) {
        this.pkRowInTable = value;
    }

}
