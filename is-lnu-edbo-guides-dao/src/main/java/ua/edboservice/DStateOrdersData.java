
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dStateOrdersData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dStateOrdersData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_StateOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_StateOrdersTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_User" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumDoc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StateOrdersTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id_StateOrdersData" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ExternalUniversity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ExternalUniversityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OsnovaZarah" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndastryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndastryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LicenseDenna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LicenseZaoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VipuskDenna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VipuskZaoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PriyomDenna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PriyomZaoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VartDenna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="VartZaoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PropDenna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PropZaoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PlanDenna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PlanZaoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FactDenna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FactZaoch" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dStateOrdersData", propOrder = {
    "idStateOrder",
    "idStateOrdersTypes",
    "year",
    "idUser",
    "numDoc",
    "stateOrdersTypeName",
    "fio",
    "idStateOrdersData",
    "idExternalUniversity",
    "externalUniversityName",
    "osnovaZarah",
    "indastryCode",
    "indastryName",
    "specDirCode",
    "specDirName",
    "licenseDenna",
    "licenseZaoch",
    "vipuskDenna",
    "vipuskZaoch",
    "priyomDenna",
    "priyomZaoch",
    "vartDenna",
    "vartZaoch",
    "propDenna",
    "propZaoch",
    "planDenna",
    "planZaoch",
    "factDenna",
    "factZaoch"
})
public class DStateOrdersData {

    @XmlElement(name = "Id_StateOrder")
    protected int idStateOrder;
    @XmlElement(name = "Id_StateOrdersTypes")
    protected int idStateOrdersTypes;
    @XmlElement(name = "Year")
    protected int year;
    @XmlElement(name = "Id_User")
    protected int idUser;
    @XmlElement(name = "NumDoc")
    protected int numDoc;
    @XmlElement(name = "StateOrdersTypeName")
    protected String stateOrdersTypeName;
    @XmlElement(name = "FIO")
    protected String fio;
    @XmlElement(name = "Id_StateOrdersData")
    protected int idStateOrdersData;
    @XmlElement(name = "Id_ExternalUniversity")
    protected int idExternalUniversity;
    @XmlElement(name = "ExternalUniversityName")
    protected String externalUniversityName;
    @XmlElement(name = "OsnovaZarah")
    protected String osnovaZarah;
    @XmlElement(name = "IndastryCode")
    protected String indastryCode;
    @XmlElement(name = "IndastryName")
    protected String indastryName;
    @XmlElement(name = "SpecDirCode")
    protected String specDirCode;
    @XmlElement(name = "SpecDirName")
    protected String specDirName;
    @XmlElement(name = "LicenseDenna")
    protected int licenseDenna;
    @XmlElement(name = "LicenseZaoch")
    protected int licenseZaoch;
    @XmlElement(name = "VipuskDenna")
    protected int vipuskDenna;
    @XmlElement(name = "VipuskZaoch")
    protected int vipuskZaoch;
    @XmlElement(name = "PriyomDenna")
    protected int priyomDenna;
    @XmlElement(name = "PriyomZaoch")
    protected int priyomZaoch;
    @XmlElement(name = "VartDenna")
    protected int vartDenna;
    @XmlElement(name = "VartZaoch")
    protected int vartZaoch;
    @XmlElement(name = "PropDenna")
    protected int propDenna;
    @XmlElement(name = "PropZaoch")
    protected int propZaoch;
    @XmlElement(name = "PlanDenna")
    protected int planDenna;
    @XmlElement(name = "PlanZaoch")
    protected int planZaoch;
    @XmlElement(name = "FactDenna")
    protected int factDenna;
    @XmlElement(name = "FactZaoch")
    protected int factZaoch;

    /**
     * Gets the value of the idStateOrder property.
     * 
     */
    public int getIdStateOrder() {
        return idStateOrder;
    }

    /**
     * Sets the value of the idStateOrder property.
     * 
     */
    public void setIdStateOrder(int value) {
        this.idStateOrder = value;
    }

    /**
     * Gets the value of the idStateOrdersTypes property.
     * 
     */
    public int getIdStateOrdersTypes() {
        return idStateOrdersTypes;
    }

    /**
     * Sets the value of the idStateOrdersTypes property.
     * 
     */
    public void setIdStateOrdersTypes(int value) {
        this.idStateOrdersTypes = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

    /**
     * Gets the value of the idUser property.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets the value of the idUser property.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

    /**
     * Gets the value of the numDoc property.
     * 
     */
    public int getNumDoc() {
        return numDoc;
    }

    /**
     * Sets the value of the numDoc property.
     * 
     */
    public void setNumDoc(int value) {
        this.numDoc = value;
    }

    /**
     * Gets the value of the stateOrdersTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateOrdersTypeName() {
        return stateOrdersTypeName;
    }

    /**
     * Sets the value of the stateOrdersTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateOrdersTypeName(String value) {
        this.stateOrdersTypeName = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIO(String value) {
        this.fio = value;
    }

    /**
     * Gets the value of the idStateOrdersData property.
     * 
     */
    public int getIdStateOrdersData() {
        return idStateOrdersData;
    }

    /**
     * Sets the value of the idStateOrdersData property.
     * 
     */
    public void setIdStateOrdersData(int value) {
        this.idStateOrdersData = value;
    }

    /**
     * Gets the value of the idExternalUniversity property.
     * 
     */
    public int getIdExternalUniversity() {
        return idExternalUniversity;
    }

    /**
     * Sets the value of the idExternalUniversity property.
     * 
     */
    public void setIdExternalUniversity(int value) {
        this.idExternalUniversity = value;
    }

    /**
     * Gets the value of the externalUniversityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalUniversityName() {
        return externalUniversityName;
    }

    /**
     * Sets the value of the externalUniversityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalUniversityName(String value) {
        this.externalUniversityName = value;
    }

    /**
     * Gets the value of the osnovaZarah property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsnovaZarah() {
        return osnovaZarah;
    }

    /**
     * Sets the value of the osnovaZarah property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsnovaZarah(String value) {
        this.osnovaZarah = value;
    }

    /**
     * Gets the value of the indastryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndastryCode() {
        return indastryCode;
    }

    /**
     * Sets the value of the indastryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndastryCode(String value) {
        this.indastryCode = value;
    }

    /**
     * Gets the value of the indastryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndastryName() {
        return indastryName;
    }

    /**
     * Sets the value of the indastryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndastryName(String value) {
        this.indastryName = value;
    }

    /**
     * Gets the value of the specDirCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirCode() {
        return specDirCode;
    }

    /**
     * Sets the value of the specDirCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirCode(String value) {
        this.specDirCode = value;
    }

    /**
     * Gets the value of the specDirName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirName() {
        return specDirName;
    }

    /**
     * Sets the value of the specDirName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirName(String value) {
        this.specDirName = value;
    }

    /**
     * Gets the value of the licenseDenna property.
     * 
     */
    public int getLicenseDenna() {
        return licenseDenna;
    }

    /**
     * Sets the value of the licenseDenna property.
     * 
     */
    public void setLicenseDenna(int value) {
        this.licenseDenna = value;
    }

    /**
     * Gets the value of the licenseZaoch property.
     * 
     */
    public int getLicenseZaoch() {
        return licenseZaoch;
    }

    /**
     * Sets the value of the licenseZaoch property.
     * 
     */
    public void setLicenseZaoch(int value) {
        this.licenseZaoch = value;
    }

    /**
     * Gets the value of the vipuskDenna property.
     * 
     */
    public int getVipuskDenna() {
        return vipuskDenna;
    }

    /**
     * Sets the value of the vipuskDenna property.
     * 
     */
    public void setVipuskDenna(int value) {
        this.vipuskDenna = value;
    }

    /**
     * Gets the value of the vipuskZaoch property.
     * 
     */
    public int getVipuskZaoch() {
        return vipuskZaoch;
    }

    /**
     * Sets the value of the vipuskZaoch property.
     * 
     */
    public void setVipuskZaoch(int value) {
        this.vipuskZaoch = value;
    }

    /**
     * Gets the value of the priyomDenna property.
     * 
     */
    public int getPriyomDenna() {
        return priyomDenna;
    }

    /**
     * Sets the value of the priyomDenna property.
     * 
     */
    public void setPriyomDenna(int value) {
        this.priyomDenna = value;
    }

    /**
     * Gets the value of the priyomZaoch property.
     * 
     */
    public int getPriyomZaoch() {
        return priyomZaoch;
    }

    /**
     * Sets the value of the priyomZaoch property.
     * 
     */
    public void setPriyomZaoch(int value) {
        this.priyomZaoch = value;
    }

    /**
     * Gets the value of the vartDenna property.
     * 
     */
    public int getVartDenna() {
        return vartDenna;
    }

    /**
     * Sets the value of the vartDenna property.
     * 
     */
    public void setVartDenna(int value) {
        this.vartDenna = value;
    }

    /**
     * Gets the value of the vartZaoch property.
     * 
     */
    public int getVartZaoch() {
        return vartZaoch;
    }

    /**
     * Sets the value of the vartZaoch property.
     * 
     */
    public void setVartZaoch(int value) {
        this.vartZaoch = value;
    }

    /**
     * Gets the value of the propDenna property.
     * 
     */
    public int getPropDenna() {
        return propDenna;
    }

    /**
     * Sets the value of the propDenna property.
     * 
     */
    public void setPropDenna(int value) {
        this.propDenna = value;
    }

    /**
     * Gets the value of the propZaoch property.
     * 
     */
    public int getPropZaoch() {
        return propZaoch;
    }

    /**
     * Sets the value of the propZaoch property.
     * 
     */
    public void setPropZaoch(int value) {
        this.propZaoch = value;
    }

    /**
     * Gets the value of the planDenna property.
     * 
     */
    public int getPlanDenna() {
        return planDenna;
    }

    /**
     * Sets the value of the planDenna property.
     * 
     */
    public void setPlanDenna(int value) {
        this.planDenna = value;
    }

    /**
     * Gets the value of the planZaoch property.
     * 
     */
    public int getPlanZaoch() {
        return planZaoch;
    }

    /**
     * Sets the value of the planZaoch property.
     * 
     */
    public void setPlanZaoch(int value) {
        this.planZaoch = value;
    }

    /**
     * Gets the value of the factDenna property.
     * 
     */
    public int getFactDenna() {
        return factDenna;
    }

    /**
     * Sets the value of the factDenna property.
     * 
     */
    public void setFactDenna(int value) {
        this.factDenna = value;
    }

    /**
     * Gets the value of the factZaoch property.
     * 
     */
    public int getFactZaoch() {
        return factZaoch;
    }

    /**
     * Sets the value of the factZaoch property.
     * 
     */
    public void setFactZaoch(int value) {
        this.factZaoch = value;
    }

}
