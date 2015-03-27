
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PKRowInTable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ActionName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActionName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActionName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessionGUID",
    "pkRowInTable",
    "actionName1",
    "actionName2",
    "actionName3"
})
@XmlRootElement(name = "HistoryGetActionInfo")
public class HistoryGetActionInfo {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "PKRowInTable")
    protected int pkRowInTable;
    @XmlElement(name = "ActionName1")
    protected String actionName1;
    @XmlElement(name = "ActionName2")
    protected String actionName2;
    @XmlElement(name = "ActionName3")
    protected String actionName3;

    /**
     * Gets the value of the sessionGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionGUID() {
        return sessionGUID;
    }

    /**
     * Sets the value of the sessionGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionGUID(String value) {
        this.sessionGUID = value;
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

    /**
     * Gets the value of the actionName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName1() {
        return actionName1;
    }

    /**
     * Sets the value of the actionName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName1(String value) {
        this.actionName1 = value;
    }

    /**
     * Gets the value of the actionName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName2() {
        return actionName2;
    }

    /**
     * Sets the value of the actionName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName2(String value) {
        this.actionName2 = value;
    }

    /**
     * Gets the value of the actionName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName3() {
        return actionName3;
    }

    /**
     * Sets the value of the actionName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName3(String value) {
        this.actionName3 = value;
    }

}
