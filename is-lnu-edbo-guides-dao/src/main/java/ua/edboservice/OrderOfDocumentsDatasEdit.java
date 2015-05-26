
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
 *         &lt;element name="Id_OrderOfDocumentData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OrderOfDocumentDataDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistBenefits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonPhoto" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idOrderOfDocumentData",
    "orderOfDocumentDataDescription",
    "existBenefits",
    "idPersonPhoto"
})
@XmlRootElement(name = "OrderOfDocumentsDatasEdit")
public class OrderOfDocumentsDatasEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_OrderOfDocumentData")
    protected int idOrderOfDocumentData;
    @XmlElement(name = "OrderOfDocumentDataDescription")
    protected String orderOfDocumentDataDescription;
    @XmlElement(name = "ExistBenefits")
    protected int existBenefits;
    @XmlElement(name = "Id_PersonPhoto")
    protected int idPersonPhoto;

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
     * Gets the value of the idOrderOfDocumentData property.
     * 
     */
    public int getIdOrderOfDocumentData() {
        return idOrderOfDocumentData;
    }

    /**
     * Sets the value of the idOrderOfDocumentData property.
     * 
     */
    public void setIdOrderOfDocumentData(int value) {
        this.idOrderOfDocumentData = value;
    }

    /**
     * Gets the value of the orderOfDocumentDataDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderOfDocumentDataDescription() {
        return orderOfDocumentDataDescription;
    }

    /**
     * Sets the value of the orderOfDocumentDataDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderOfDocumentDataDescription(String value) {
        this.orderOfDocumentDataDescription = value;
    }

    /**
     * Gets the value of the existBenefits property.
     * 
     */
    public int getExistBenefits() {
        return existBenefits;
    }

    /**
     * Sets the value of the existBenefits property.
     * 
     */
    public void setExistBenefits(int value) {
        this.existBenefits = value;
    }

    /**
     * Gets the value of the idPersonPhoto property.
     * 
     */
    public int getIdPersonPhoto() {
        return idPersonPhoto;
    }

    /**
     * Sets the value of the idPersonPhoto property.
     * 
     */
    public void setIdPersonPhoto(int value) {
        this.idPersonPhoto = value;
    }

}
