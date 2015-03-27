
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dEDBOISUOreport_rvk77 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dEDBOISUOreport_rvk77">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_EDBO_report_rvk77" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id_ISUO_report_rvk77" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="UniversityKode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="report_year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="section_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="row_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="C1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="C2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="C3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="C4" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="C5" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="C6" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="C7" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="S1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authority_tree_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_ISUO_ZNZ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dEDBOISUOreport_rvk77", propOrder = {
    "idEDBOReportRvk77",
    "idISUOReportRvk77",
    "universityKode",
    "reportYear",
    "sectionId",
    "rowId",
    "c1",
    "c2",
    "c3",
    "c4",
    "c5",
    "c6",
    "c7",
    "s1",
    "authorityTreeId",
    "idISUOZNZ"
})
public class DEDBOISUOreportRvk77 {

    @XmlElement(name = "id_EDBO_report_rvk77")
    protected int idEDBOReportRvk77;
    @XmlElement(name = "id_ISUO_report_rvk77")
    protected int idISUOReportRvk77;
    @XmlElement(name = "UniversityKode")
    protected String universityKode;
    @XmlElement(name = "report_year")
    protected int reportYear;
    @XmlElement(name = "section_id")
    protected int sectionId;
    @XmlElement(name = "row_id")
    protected int rowId;
    @XmlElement(name = "C1")
    protected int c1;
    @XmlElement(name = "C2")
    protected int c2;
    @XmlElement(name = "C3")
    protected int c3;
    @XmlElement(name = "C4")
    protected int c4;
    @XmlElement(name = "C5")
    protected int c5;
    @XmlElement(name = "C6")
    protected int c6;
    @XmlElement(name = "C7")
    protected int c7;
    @XmlElement(name = "S1")
    protected String s1;
    @XmlElement(name = "authority_tree_id")
    protected int authorityTreeId;
    @XmlElement(name = "Id_ISUO_ZNZ")
    protected int idISUOZNZ;

    /**
     * Gets the value of the idEDBOReportRvk77 property.
     * 
     */
    public int getIdEDBOReportRvk77() {
        return idEDBOReportRvk77;
    }

    /**
     * Sets the value of the idEDBOReportRvk77 property.
     * 
     */
    public void setIdEDBOReportRvk77(int value) {
        this.idEDBOReportRvk77 = value;
    }

    /**
     * Gets the value of the idISUOReportRvk77 property.
     * 
     */
    public int getIdISUOReportRvk77() {
        return idISUOReportRvk77;
    }

    /**
     * Sets the value of the idISUOReportRvk77 property.
     * 
     */
    public void setIdISUOReportRvk77(int value) {
        this.idISUOReportRvk77 = value;
    }

    /**
     * Gets the value of the universityKode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversityKode() {
        return universityKode;
    }

    /**
     * Sets the value of the universityKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversityKode(String value) {
        this.universityKode = value;
    }

    /**
     * Gets the value of the reportYear property.
     * 
     */
    public int getReportYear() {
        return reportYear;
    }

    /**
     * Sets the value of the reportYear property.
     * 
     */
    public void setReportYear(int value) {
        this.reportYear = value;
    }

    /**
     * Gets the value of the sectionId property.
     * 
     */
    public int getSectionId() {
        return sectionId;
    }

    /**
     * Sets the value of the sectionId property.
     * 
     */
    public void setSectionId(int value) {
        this.sectionId = value;
    }

    /**
     * Gets the value of the rowId property.
     * 
     */
    public int getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     */
    public void setRowId(int value) {
        this.rowId = value;
    }

    /**
     * Gets the value of the c1 property.
     * 
     */
    public int getC1() {
        return c1;
    }

    /**
     * Sets the value of the c1 property.
     * 
     */
    public void setC1(int value) {
        this.c1 = value;
    }

    /**
     * Gets the value of the c2 property.
     * 
     */
    public int getC2() {
        return c2;
    }

    /**
     * Sets the value of the c2 property.
     * 
     */
    public void setC2(int value) {
        this.c2 = value;
    }

    /**
     * Gets the value of the c3 property.
     * 
     */
    public int getC3() {
        return c3;
    }

    /**
     * Sets the value of the c3 property.
     * 
     */
    public void setC3(int value) {
        this.c3 = value;
    }

    /**
     * Gets the value of the c4 property.
     * 
     */
    public int getC4() {
        return c4;
    }

    /**
     * Sets the value of the c4 property.
     * 
     */
    public void setC4(int value) {
        this.c4 = value;
    }

    /**
     * Gets the value of the c5 property.
     * 
     */
    public int getC5() {
        return c5;
    }

    /**
     * Sets the value of the c5 property.
     * 
     */
    public void setC5(int value) {
        this.c5 = value;
    }

    /**
     * Gets the value of the c6 property.
     * 
     */
    public int getC6() {
        return c6;
    }

    /**
     * Sets the value of the c6 property.
     * 
     */
    public void setC6(int value) {
        this.c6 = value;
    }

    /**
     * Gets the value of the c7 property.
     * 
     */
    public int getC7() {
        return c7;
    }

    /**
     * Sets the value of the c7 property.
     * 
     */
    public void setC7(int value) {
        this.c7 = value;
    }

    /**
     * Gets the value of the s1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS1() {
        return s1;
    }

    /**
     * Sets the value of the s1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS1(String value) {
        this.s1 = value;
    }

    /**
     * Gets the value of the authorityTreeId property.
     * 
     */
    public int getAuthorityTreeId() {
        return authorityTreeId;
    }

    /**
     * Sets the value of the authorityTreeId property.
     * 
     */
    public void setAuthorityTreeId(int value) {
        this.authorityTreeId = value;
    }

    /**
     * Gets the value of the idISUOZNZ property.
     * 
     */
    public int getIdISUOZNZ() {
        return idISUOZNZ;
    }

    /**
     * Sets the value of the idISUOZNZ property.
     * 
     */
    public void setIdISUOZNZ(int value) {
        this.idISUOZNZ = value;
    }

}
