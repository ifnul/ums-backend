
package org.lnu.is.edbo.proxy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dPersonRequestBenefits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dPersonRequestBenefits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_PersonRequestBenefit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonRequest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_PersonBenefit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonRequestBenefitDateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Id_Person" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Benefit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BenefitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_BenefitGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BenefitsGroupsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonCodeU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dPersonRequestBenefits", propOrder = {
    "idPersonRequestBenefit",
    "idPersonRequest",
    "idPersonBenefit",
    "personRequestBenefitDateLastChange",
    "idPerson",
    "idBenefit",
    "benefitName",
    "idBenefitGroup",
    "benefitsGroupsName",
    "personCodeU"
})
public class DPersonRequestBenefits {

    @XmlElement(name = "Id_PersonRequestBenefit")
    protected int idPersonRequestBenefit;
    @XmlElement(name = "Id_PersonRequest")
    protected int idPersonRequest;
    @XmlElement(name = "Id_PersonBenefit")
    protected int idPersonBenefit;
    @XmlElement(name = "PersonRequestBenefitDateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar personRequestBenefitDateLastChange;
    @XmlElement(name = "Id_Person")
    protected int idPerson;
    @XmlElement(name = "Id_Benefit")
    protected int idBenefit;
    @XmlElement(name = "BenefitName")
    protected String benefitName;
    @XmlElement(name = "Id_BenefitGroup")
    protected int idBenefitGroup;
    @XmlElement(name = "BenefitsGroupsName")
    protected String benefitsGroupsName;
    @XmlElement(name = "PersonCodeU")
    protected String personCodeU;

    /**
     * Gets the value of the idPersonRequestBenefit property.
     * 
     */
    public int getIdPersonRequestBenefit() {
        return idPersonRequestBenefit;
    }

    /**
     * Sets the value of the idPersonRequestBenefit property.
     * 
     */
    public void setIdPersonRequestBenefit(int value) {
        this.idPersonRequestBenefit = value;
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
     * Gets the value of the idPersonBenefit property.
     * 
     */
    public int getIdPersonBenefit() {
        return idPersonBenefit;
    }

    /**
     * Sets the value of the idPersonBenefit property.
     * 
     */
    public void setIdPersonBenefit(int value) {
        this.idPersonBenefit = value;
    }

    /**
     * Gets the value of the personRequestBenefitDateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonRequestBenefitDateLastChange() {
        return personRequestBenefitDateLastChange;
    }

    /**
     * Sets the value of the personRequestBenefitDateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonRequestBenefitDateLastChange(XMLGregorianCalendar value) {
        this.personRequestBenefitDateLastChange = value;
    }

    /**
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the idBenefit property.
     * 
     */
    public int getIdBenefit() {
        return idBenefit;
    }

    /**
     * Sets the value of the idBenefit property.
     * 
     */
    public void setIdBenefit(int value) {
        this.idBenefit = value;
    }

    /**
     * Gets the value of the benefitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitName() {
        return benefitName;
    }

    /**
     * Sets the value of the benefitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitName(String value) {
        this.benefitName = value;
    }

    /**
     * Gets the value of the idBenefitGroup property.
     * 
     */
    public int getIdBenefitGroup() {
        return idBenefitGroup;
    }

    /**
     * Sets the value of the idBenefitGroup property.
     * 
     */
    public void setIdBenefitGroup(int value) {
        this.idBenefitGroup = value;
    }

    /**
     * Gets the value of the benefitsGroupsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenefitsGroupsName() {
        return benefitsGroupsName;
    }

    /**
     * Sets the value of the benefitsGroupsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenefitsGroupsName(String value) {
        this.benefitsGroupsName = value;
    }

    /**
     * Gets the value of the personCodeU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCodeU() {
        return personCodeU;
    }

    /**
     * Sets the value of the personCodeU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCodeU(String value) {
        this.personCodeU = value;
    }

}
