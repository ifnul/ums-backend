
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
 *         &lt;element name="Id_GovernmentAwardsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GovernmentAwardsTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sort" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idGovernmentAwardsTypes",
    "governmentAwardsTypesName",
    "sort"
})
@XmlRootElement(name = "GovernmentAwardsTypesEdit")
public class GovernmentAwardsTypesEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_GovernmentAwardsTypes")
    protected int idGovernmentAwardsTypes;
    @XmlElement(name = "GovernmentAwardsTypesName")
    protected String governmentAwardsTypesName;
    @XmlElement(name = "Sort")
    protected int sort;

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
     * Gets the value of the idGovernmentAwardsTypes property.
     * 
     */
    public int getIdGovernmentAwardsTypes() {
        return idGovernmentAwardsTypes;
    }

    /**
     * Sets the value of the idGovernmentAwardsTypes property.
     * 
     */
    public void setIdGovernmentAwardsTypes(int value) {
        this.idGovernmentAwardsTypes = value;
    }

    /**
     * Gets the value of the governmentAwardsTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentAwardsTypesName() {
        return governmentAwardsTypesName;
    }

    /**
     * Sets the value of the governmentAwardsTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentAwardsTypesName(String value) {
        this.governmentAwardsTypesName = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     */
    public int getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     */
    public void setSort(int value) {
        this.sort = value;
    }

}
