
package ua.edboservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dReceptionConditionAdditionsKoeficients complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dReceptionConditionAdditionsKoeficients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_ReceptionConditionAdditionsKoeficients" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ReceptionConditionAddition" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="k1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="k2" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="k3" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="k4" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="k5" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="k6" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="k7" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Id_ReceptionConditionAdditionsKoeficientsTypes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ReceptionConditionAdditionsKoeficientsTypesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dReceptionConditionAdditionsKoeficients", propOrder = {
    "idReceptionConditionAdditionsKoeficients",
    "idReceptionConditionAddition",
    "k1",
    "k2",
    "k3",
    "k4",
    "k5",
    "k6",
    "k7",
    "idReceptionConditionAdditionsKoeficientsTypes",
    "receptionConditionAdditionsKoeficientsTypesName"
})
public class DReceptionConditionAdditionsKoeficients {

    @XmlElement(name = "Id_ReceptionConditionAdditionsKoeficients")
    protected int idReceptionConditionAdditionsKoeficients;
    @XmlElement(name = "Id_ReceptionConditionAddition")
    protected int idReceptionConditionAddition;
    @XmlElement(required = true)
    protected BigDecimal k1;
    @XmlElement(required = true)
    protected BigDecimal k2;
    @XmlElement(required = true)
    protected BigDecimal k3;
    @XmlElement(required = true)
    protected BigDecimal k4;
    @XmlElement(required = true)
    protected BigDecimal k5;
    @XmlElement(required = true)
    protected BigDecimal k6;
    @XmlElement(required = true)
    protected BigDecimal k7;
    @XmlElement(name = "Id_ReceptionConditionAdditionsKoeficientsTypes")
    protected int idReceptionConditionAdditionsKoeficientsTypes;
    @XmlElement(name = "ReceptionConditionAdditionsKoeficientsTypesName")
    protected String receptionConditionAdditionsKoeficientsTypesName;

    /**
     * Gets the value of the idReceptionConditionAdditionsKoeficients property.
     * 
     */
    public int getIdReceptionConditionAdditionsKoeficients() {
        return idReceptionConditionAdditionsKoeficients;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsKoeficients property.
     * 
     */
    public void setIdReceptionConditionAdditionsKoeficients(int value) {
        this.idReceptionConditionAdditionsKoeficients = value;
    }

    /**
     * Gets the value of the idReceptionConditionAddition property.
     * 
     */
    public int getIdReceptionConditionAddition() {
        return idReceptionConditionAddition;
    }

    /**
     * Sets the value of the idReceptionConditionAddition property.
     * 
     */
    public void setIdReceptionConditionAddition(int value) {
        this.idReceptionConditionAddition = value;
    }

    /**
     * Gets the value of the k1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getK1() {
        return k1;
    }

    /**
     * Sets the value of the k1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setK1(BigDecimal value) {
        this.k1 = value;
    }

    /**
     * Gets the value of the k2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getK2() {
        return k2;
    }

    /**
     * Sets the value of the k2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setK2(BigDecimal value) {
        this.k2 = value;
    }

    /**
     * Gets the value of the k3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getK3() {
        return k3;
    }

    /**
     * Sets the value of the k3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setK3(BigDecimal value) {
        this.k3 = value;
    }

    /**
     * Gets the value of the k4 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getK4() {
        return k4;
    }

    /**
     * Sets the value of the k4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setK4(BigDecimal value) {
        this.k4 = value;
    }

    /**
     * Gets the value of the k5 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getK5() {
        return k5;
    }

    /**
     * Sets the value of the k5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setK5(BigDecimal value) {
        this.k5 = value;
    }

    /**
     * Gets the value of the k6 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getK6() {
        return k6;
    }

    /**
     * Sets the value of the k6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setK6(BigDecimal value) {
        this.k6 = value;
    }

    /**
     * Gets the value of the k7 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getK7() {
        return k7;
    }

    /**
     * Sets the value of the k7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setK7(BigDecimal value) {
        this.k7 = value;
    }

    /**
     * Gets the value of the idReceptionConditionAdditionsKoeficientsTypes property.
     * 
     */
    public int getIdReceptionConditionAdditionsKoeficientsTypes() {
        return idReceptionConditionAdditionsKoeficientsTypes;
    }

    /**
     * Sets the value of the idReceptionConditionAdditionsKoeficientsTypes property.
     * 
     */
    public void setIdReceptionConditionAdditionsKoeficientsTypes(int value) {
        this.idReceptionConditionAdditionsKoeficientsTypes = value;
    }

    /**
     * Gets the value of the receptionConditionAdditionsKoeficientsTypesName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceptionConditionAdditionsKoeficientsTypesName() {
        return receptionConditionAdditionsKoeficientsTypesName;
    }

    /**
     * Sets the value of the receptionConditionAdditionsKoeficientsTypesName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceptionConditionAdditionsKoeficientsTypesName(String value) {
        this.receptionConditionAdditionsKoeficientsTypesName = value;
    }

}
