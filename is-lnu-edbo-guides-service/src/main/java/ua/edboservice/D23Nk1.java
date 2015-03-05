
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for d23nk_1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="d23nk_1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_23nk_1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_23nkmain" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SpecSpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecDirectionsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecClasifierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="p1_1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_7" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_10" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_11" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_12" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_13" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_14" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_15" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_16" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_17" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="p1_18" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_QualificationGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QualificationGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c1_3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="c1_4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="c1_5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="c1_6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="c1_8" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="c1_9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="c1_10" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="c1_11" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="c1_12" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "d23nk_1", propOrder = {
    "id23Nk1",
    "id23Nkmain",
    "specSpecialityCode",
    "specDirectionsCode",
    "specClasifierCode",
    "specName",
    "p11",
    "p12",
    "p13",
    "p14",
    "p15",
    "p16",
    "p17",
    "p18",
    "p19",
    "p110",
    "p111",
    "p112",
    "p113",
    "p114",
    "p115",
    "p116",
    "p117",
    "p118",
    "idQualificationGroup",
    "qualificationGroupName",
    "c13",
    "c14",
    "c15",
    "c16",
    "c18",
    "c19",
    "c110",
    "c111",
    "c112"
})
public class D23Nk1 {

    @XmlElement(name = "Id_23nk_1")
    protected int id23Nk1;
    @XmlElement(name = "Id_23nkmain")
    protected int id23Nkmain;
    @XmlElement(name = "SpecSpecialityCode")
    protected String specSpecialityCode;
    @XmlElement(name = "SpecDirectionsCode")
    protected String specDirectionsCode;
    @XmlElement(name = "SpecClasifierCode")
    protected String specClasifierCode;
    @XmlElement(name = "SpecName")
    protected String specName;
    @XmlElement(name = "p1_1")
    protected int p11;
    @XmlElement(name = "p1_2")
    protected int p12;
    @XmlElement(name = "p1_3")
    protected int p13;
    @XmlElement(name = "p1_4")
    protected int p14;
    @XmlElement(name = "p1_5")
    protected int p15;
    @XmlElement(name = "p1_6")
    protected int p16;
    @XmlElement(name = "p1_7")
    protected int p17;
    @XmlElement(name = "p1_8")
    protected int p18;
    @XmlElement(name = "p1_9")
    protected int p19;
    @XmlElement(name = "p1_10")
    protected int p110;
    @XmlElement(name = "p1_11")
    protected int p111;
    @XmlElement(name = "p1_12")
    protected int p112;
    @XmlElement(name = "p1_13")
    protected int p113;
    @XmlElement(name = "p1_14")
    protected int p114;
    @XmlElement(name = "p1_15")
    protected int p115;
    @XmlElement(name = "p1_16")
    protected int p116;
    @XmlElement(name = "p1_17")
    protected int p117;
    @XmlElement(name = "p1_18")
    protected int p118;
    @XmlElement(name = "Id_QualificationGroup")
    protected int idQualificationGroup;
    @XmlElement(name = "QualificationGroupName")
    protected String qualificationGroupName;
    @XmlElement(name = "c1_3")
    protected int c13;
    @XmlElement(name = "c1_4")
    protected int c14;
    @XmlElement(name = "c1_5")
    protected int c15;
    @XmlElement(name = "c1_6")
    protected int c16;
    @XmlElement(name = "c1_8")
    protected int c18;
    @XmlElement(name = "c1_9")
    protected int c19;
    @XmlElement(name = "c1_10")
    protected int c110;
    @XmlElement(name = "c1_11")
    protected int c111;
    @XmlElement(name = "c1_12")
    protected int c112;

    /**
     * Gets the value of the id23Nk1 property.
     * 
     */
    public int getId23Nk1() {
        return id23Nk1;
    }

    /**
     * Sets the value of the id23Nk1 property.
     * 
     */
    public void setId23Nk1(int value) {
        this.id23Nk1 = value;
    }

    /**
     * Gets the value of the id23Nkmain property.
     * 
     */
    public int getId23Nkmain() {
        return id23Nkmain;
    }

    /**
     * Sets the value of the id23Nkmain property.
     * 
     */
    public void setId23Nkmain(int value) {
        this.id23Nkmain = value;
    }

    /**
     * Gets the value of the specSpecialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecSpecialityCode() {
        return specSpecialityCode;
    }

    /**
     * Sets the value of the specSpecialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecSpecialityCode(String value) {
        this.specSpecialityCode = value;
    }

    /**
     * Gets the value of the specDirectionsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecDirectionsCode() {
        return specDirectionsCode;
    }

    /**
     * Sets the value of the specDirectionsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecDirectionsCode(String value) {
        this.specDirectionsCode = value;
    }

    /**
     * Gets the value of the specClasifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecClasifierCode() {
        return specClasifierCode;
    }

    /**
     * Sets the value of the specClasifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecClasifierCode(String value) {
        this.specClasifierCode = value;
    }

    /**
     * Gets the value of the specName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecName() {
        return specName;
    }

    /**
     * Sets the value of the specName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecName(String value) {
        this.specName = value;
    }

    /**
     * Gets the value of the p11 property.
     * 
     */
    public int getP11() {
        return p11;
    }

    /**
     * Sets the value of the p11 property.
     * 
     */
    public void setP11(int value) {
        this.p11 = value;
    }

    /**
     * Gets the value of the p12 property.
     * 
     */
    public int getP12() {
        return p12;
    }

    /**
     * Sets the value of the p12 property.
     * 
     */
    public void setP12(int value) {
        this.p12 = value;
    }

    /**
     * Gets the value of the p13 property.
     * 
     */
    public int getP13() {
        return p13;
    }

    /**
     * Sets the value of the p13 property.
     * 
     */
    public void setP13(int value) {
        this.p13 = value;
    }

    /**
     * Gets the value of the p14 property.
     * 
     */
    public int getP14() {
        return p14;
    }

    /**
     * Sets the value of the p14 property.
     * 
     */
    public void setP14(int value) {
        this.p14 = value;
    }

    /**
     * Gets the value of the p15 property.
     * 
     */
    public int getP15() {
        return p15;
    }

    /**
     * Sets the value of the p15 property.
     * 
     */
    public void setP15(int value) {
        this.p15 = value;
    }

    /**
     * Gets the value of the p16 property.
     * 
     */
    public int getP16() {
        return p16;
    }

    /**
     * Sets the value of the p16 property.
     * 
     */
    public void setP16(int value) {
        this.p16 = value;
    }

    /**
     * Gets the value of the p17 property.
     * 
     */
    public int getP17() {
        return p17;
    }

    /**
     * Sets the value of the p17 property.
     * 
     */
    public void setP17(int value) {
        this.p17 = value;
    }

    /**
     * Gets the value of the p18 property.
     * 
     */
    public int getP18() {
        return p18;
    }

    /**
     * Sets the value of the p18 property.
     * 
     */
    public void setP18(int value) {
        this.p18 = value;
    }

    /**
     * Gets the value of the p19 property.
     * 
     */
    public int getP19() {
        return p19;
    }

    /**
     * Sets the value of the p19 property.
     * 
     */
    public void setP19(int value) {
        this.p19 = value;
    }

    /**
     * Gets the value of the p110 property.
     * 
     */
    public int getP110() {
        return p110;
    }

    /**
     * Sets the value of the p110 property.
     * 
     */
    public void setP110(int value) {
        this.p110 = value;
    }

    /**
     * Gets the value of the p111 property.
     * 
     */
    public int getP111() {
        return p111;
    }

    /**
     * Sets the value of the p111 property.
     * 
     */
    public void setP111(int value) {
        this.p111 = value;
    }

    /**
     * Gets the value of the p112 property.
     * 
     */
    public int getP112() {
        return p112;
    }

    /**
     * Sets the value of the p112 property.
     * 
     */
    public void setP112(int value) {
        this.p112 = value;
    }

    /**
     * Gets the value of the p113 property.
     * 
     */
    public int getP113() {
        return p113;
    }

    /**
     * Sets the value of the p113 property.
     * 
     */
    public void setP113(int value) {
        this.p113 = value;
    }

    /**
     * Gets the value of the p114 property.
     * 
     */
    public int getP114() {
        return p114;
    }

    /**
     * Sets the value of the p114 property.
     * 
     */
    public void setP114(int value) {
        this.p114 = value;
    }

    /**
     * Gets the value of the p115 property.
     * 
     */
    public int getP115() {
        return p115;
    }

    /**
     * Sets the value of the p115 property.
     * 
     */
    public void setP115(int value) {
        this.p115 = value;
    }

    /**
     * Gets the value of the p116 property.
     * 
     */
    public int getP116() {
        return p116;
    }

    /**
     * Sets the value of the p116 property.
     * 
     */
    public void setP116(int value) {
        this.p116 = value;
    }

    /**
     * Gets the value of the p117 property.
     * 
     */
    public int getP117() {
        return p117;
    }

    /**
     * Sets the value of the p117 property.
     * 
     */
    public void setP117(int value) {
        this.p117 = value;
    }

    /**
     * Gets the value of the p118 property.
     * 
     */
    public int getP118() {
        return p118;
    }

    /**
     * Sets the value of the p118 property.
     * 
     */
    public void setP118(int value) {
        this.p118 = value;
    }

    /**
     * Gets the value of the idQualificationGroup property.
     * 
     */
    public int getIdQualificationGroup() {
        return idQualificationGroup;
    }

    /**
     * Sets the value of the idQualificationGroup property.
     * 
     */
    public void setIdQualificationGroup(int value) {
        this.idQualificationGroup = value;
    }

    /**
     * Gets the value of the qualificationGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationGroupName() {
        return qualificationGroupName;
    }

    /**
     * Sets the value of the qualificationGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationGroupName(String value) {
        this.qualificationGroupName = value;
    }

    /**
     * Gets the value of the c13 property.
     * 
     */
    public int getC13() {
        return c13;
    }

    /**
     * Sets the value of the c13 property.
     * 
     */
    public void setC13(int value) {
        this.c13 = value;
    }

    /**
     * Gets the value of the c14 property.
     * 
     */
    public int getC14() {
        return c14;
    }

    /**
     * Sets the value of the c14 property.
     * 
     */
    public void setC14(int value) {
        this.c14 = value;
    }

    /**
     * Gets the value of the c15 property.
     * 
     */
    public int getC15() {
        return c15;
    }

    /**
     * Sets the value of the c15 property.
     * 
     */
    public void setC15(int value) {
        this.c15 = value;
    }

    /**
     * Gets the value of the c16 property.
     * 
     */
    public int getC16() {
        return c16;
    }

    /**
     * Sets the value of the c16 property.
     * 
     */
    public void setC16(int value) {
        this.c16 = value;
    }

    /**
     * Gets the value of the c18 property.
     * 
     */
    public int getC18() {
        return c18;
    }

    /**
     * Sets the value of the c18 property.
     * 
     */
    public void setC18(int value) {
        this.c18 = value;
    }

    /**
     * Gets the value of the c19 property.
     * 
     */
    public int getC19() {
        return c19;
    }

    /**
     * Sets the value of the c19 property.
     * 
     */
    public void setC19(int value) {
        this.c19 = value;
    }

    /**
     * Gets the value of the c110 property.
     * 
     */
    public int getC110() {
        return c110;
    }

    /**
     * Sets the value of the c110 property.
     * 
     */
    public void setC110(int value) {
        this.c110 = value;
    }

    /**
     * Gets the value of the c111 property.
     * 
     */
    public int getC111() {
        return c111;
    }

    /**
     * Sets the value of the c111 property.
     * 
     */
    public void setC111(int value) {
        this.c111 = value;
    }

    /**
     * Gets the value of the c112 property.
     * 
     */
    public int getC112() {
        return c112;
    }

    /**
     * Sets the value of the c112 property.
     * 
     */
    public void setC112(int value) {
        this.c112 = value;
    }

}
