
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
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OriginalDocumentsAdd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsNeedHostel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodeOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsBudget" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsContract" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsHigherEducation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SkipDocumentValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_LanguageEx" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ForeignType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IsForeignWay" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idPersonRequest",
    "originalDocumentsAdd",
    "isNeedHostel",
    "codeOfBusiness",
    "isBudget",
    "isContract",
    "isHigherEducation",
    "skipDocumentValue",
    "idLanguageEx",
    "idForeignType",
    "isForeignWay"
})
@XmlRootElement(name = "PersonRequestEdit2")
public class PersonRequestEdit2 {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "OriginalDocumentsAdd")
    protected int originalDocumentsAdd;
    @XmlElement(name = "IsNeedHostel")
    protected int isNeedHostel;
    @XmlElement(name = "CodeOfBusiness")
    protected String codeOfBusiness;
    @XmlElement(name = "IsBudget")
    protected int isBudget;
    @XmlElement(name = "IsContract")
    protected int isContract;
    @XmlElement(name = "IsHigherEducation")
    protected int isHigherEducation;
    @XmlElement(name = "SkipDocumentValue")
    protected int skipDocumentValue;
    @XmlElement(name = "Id_LanguageEx")
    protected int idLanguageEx;
    @XmlElement(name = "Id_ForeignType")
    protected int idForeignType;
    @XmlElement(name = "IsForeignWay")
    protected int isForeignWay;

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
     * Gets the value of the idPersonRequest property.
     * 
     */
    public int getIdPersonRequest() {
        return idPersonRequest;
    }

    /**
     * Sets the value of the idPersonRequest property.
     * 
     */
    public void setIdPersonRequest(int value) {
        this.idPersonRequest = value;
    }

    /**
     * Gets the value of the originalDocumentsAdd property.
     * 
     */
    public int getOriginalDocumentsAdd() {
        return originalDocumentsAdd;
    }

    /**
     * Sets the value of the originalDocumentsAdd property.
     * 
     */
    public void setOriginalDocumentsAdd(int value) {
        this.originalDocumentsAdd = value;
    }

    /**
     * Gets the value of the isNeedHostel property.
     * 
     */
    public int getIsNeedHostel() {
        return isNeedHostel;
    }

    /**
     * Sets the value of the isNeedHostel property.
     * 
     */
    public void setIsNeedHostel(int value) {
        this.isNeedHostel = value;
    }

    /**
     * Gets the value of the codeOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeOfBusiness() {
        return codeOfBusiness;
    }

    /**
     * Sets the value of the codeOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeOfBusiness(String value) {
        this.codeOfBusiness = value;
    }

    /**
     * Gets the value of the isBudget property.
     * 
     */
    public int getIsBudget() {
        return isBudget;
    }

    /**
     * Sets the value of the isBudget property.
     * 
     */
    public void setIsBudget(int value) {
        this.isBudget = value;
    }

    /**
     * Gets the value of the isContract property.
     * 
     */
    public int getIsContract() {
        return isContract;
    }

    /**
     * Sets the value of the isContract property.
     * 
     */
    public void setIsContract(int value) {
        this.isContract = value;
    }

    /**
     * Gets the value of the isHigherEducation property.
     * 
     */
    public int getIsHigherEducation() {
        return isHigherEducation;
    }

    /**
     * Sets the value of the isHigherEducation property.
     * 
     */
    public void setIsHigherEducation(int value) {
        this.isHigherEducation = value;
    }

    /**
     * Gets the value of the skipDocumentValue property.
     * 
     */
    public int getSkipDocumentValue() {
        return skipDocumentValue;
    }

    /**
     * Sets the value of the skipDocumentValue property.
     * 
     */
    public void setSkipDocumentValue(int value) {
        this.skipDocumentValue = value;
    }

    /**
     * Gets the value of the idLanguageEx property.
     * 
     */
    public int getIdLanguageEx() {
        return idLanguageEx;
    }

    /**
     * Sets the value of the idLanguageEx property.
     * 
     */
    public void setIdLanguageEx(int value) {
        this.idLanguageEx = value;
    }

    /**
     * Gets the value of the idForeignType property.
     * 
     */
    public int getIdForeignType() {
        return idForeignType;
    }

    /**
     * Sets the value of the idForeignType property.
     * 
     */
    public void setIdForeignType(int value) {
        this.idForeignType = value;
    }

    /**
     * Gets the value of the isForeignWay property.
     * 
     */
    public int getIsForeignWay() {
        return isForeignWay;
    }

    /**
     * Sets the value of the isForeignWay property.
     * 
     */
    public void setIsForeignWay(int value) {
        this.isForeignWay = value;
    }

}
