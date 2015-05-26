
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
 *         &lt;element name="Id_GlobalOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOrders" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_Ministers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_UniversityLicensesOrganisations" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idGlobalOrders",
    "numberOrders",
    "dateOrder",
    "idMinisters",
    "idUniversityLicensesOrganisations"
})
@XmlRootElement(name = "GlobalOrdersEdit")
public class GlobalOrdersEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_GlobalOrders")
    protected int idGlobalOrders;
    @XmlElement(name = "NumberOrders")
    protected String numberOrders;
    @XmlElement(name = "DateOrder")
    protected String dateOrder;
    @XmlElement(name = "Id_Ministers")
    protected int idMinisters;
    @XmlElement(name = "Id_UniversityLicensesOrganisations")
    protected int idUniversityLicensesOrganisations;

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
     * Gets the value of the idGlobalOrders property.
     * 
     */
    public int getIdGlobalOrders() {
        return idGlobalOrders;
    }

    /**
     * Sets the value of the idGlobalOrders property.
     * 
     */
    public void setIdGlobalOrders(int value) {
        this.idGlobalOrders = value;
    }

    /**
     * Gets the value of the numberOrders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOrders() {
        return numberOrders;
    }

    /**
     * Sets the value of the numberOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOrders(String value) {
        this.numberOrders = value;
    }

    /**
     * Gets the value of the dateOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOrder() {
        return dateOrder;
    }

    /**
     * Sets the value of the dateOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOrder(String value) {
        this.dateOrder = value;
    }

    /**
     * Gets the value of the idMinisters property.
     * 
     */
    public int getIdMinisters() {
        return idMinisters;
    }

    /**
     * Sets the value of the idMinisters property.
     * 
     */
    public void setIdMinisters(int value) {
        this.idMinisters = value;
    }

    /**
     * Gets the value of the idUniversityLicensesOrganisations property.
     * 
     */
    public int getIdUniversityLicensesOrganisations() {
        return idUniversityLicensesOrganisations;
    }

    /**
     * Sets the value of the idUniversityLicensesOrganisations property.
     * 
     */
    public void setIdUniversityLicensesOrganisations(int value) {
        this.idUniversityLicensesOrganisations = value;
    }

}
