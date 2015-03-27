
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
 *         &lt;element name="QualificationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBenefits" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Medals" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_OrderOfDocumentRenewType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "qualificationLevel",
    "isBenefits",
    "medals",
    "idOrderOfDocumentRenewType"
})
@XmlRootElement(name = "OrderOfDocumentsDatasStudentsEdit")
public class OrderOfDocumentsDatasStudentsEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_OrderOfDocumentData")
    protected int idOrderOfDocumentData;
    @XmlElement(name = "QualificationLevel")
    protected String qualificationLevel;
    @XmlElement(name = "IsBenefits")
    protected int isBenefits;
    @XmlElement(name = "Medals")
    protected int medals;
    @XmlElement(name = "Id_OrderOfDocumentRenewType")
    protected int idOrderOfDocumentRenewType;

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
     * Gets the value of the qualificationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationLevel() {
        return qualificationLevel;
    }

    /**
     * Sets the value of the qualificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationLevel(String value) {
        this.qualificationLevel = value;
    }

    /**
     * Gets the value of the isBenefits property.
     * 
     */
    public int getIsBenefits() {
        return isBenefits;
    }

    /**
     * Sets the value of the isBenefits property.
     * 
     */
    public void setIsBenefits(int value) {
        this.isBenefits = value;
    }

    /**
     * Gets the value of the medals property.
     * 
     */
    public int getMedals() {
        return medals;
    }

    /**
     * Sets the value of the medals property.
     * 
     */
    public void setMedals(int value) {
        this.medals = value;
    }

    /**
     * Gets the value of the idOrderOfDocumentRenewType property.
     * 
     */
    public int getIdOrderOfDocumentRenewType() {
        return idOrderOfDocumentRenewType;
    }

    /**
     * Sets the value of the idOrderOfDocumentRenewType property.
     * 
     */
    public void setIdOrderOfDocumentRenewType(int value) {
        this.idOrderOfDocumentRenewType = value;
    }

}
