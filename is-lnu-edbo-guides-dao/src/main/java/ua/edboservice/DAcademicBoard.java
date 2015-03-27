
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dAcademicBoard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dAcademicBoard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_AcademicBoard" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_CertifyingAgencies" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicBoardDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AcademicBoardOrderCreateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicBoardOrderEndNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Prisvoent_D" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vidmineno_D" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vidkladeno_D" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Expertiza_D" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Prisvoent_P" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vidmineno_P" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vidkladeno_P" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Expertiza_P" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Prisvoent_SnS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vidmineno_SnS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vidkladeno_SnS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Expertiza_SnS" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Prisvoent_Kn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vidmineno_Kn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vidkladeno_Kn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Expertiza_Kn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Prisvoent_Dn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vidmineno_Dn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vidkladeno_Dn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Expertiza_Dn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateLastChange" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AcademicBoardIsActive" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dAcademicBoard", propOrder = {
    "idAcademicBoard",
    "idCertifyingAgencies",
    "academicBoardDate",
    "academicBoardOrderCreateNumber",
    "academicBoardOrderEndNumber",
    "prisvoentD",
    "vidminenoD",
    "vidkladenoD",
    "expertizaD",
    "prisvoentP",
    "vidminenoP",
    "vidkladenoP",
    "expertizaP",
    "prisvoentSnS",
    "vidminenoSnS",
    "vidkladenoSnS",
    "expertizaSnS",
    "prisvoentKn",
    "vidminenoKn",
    "vidkladenoKn",
    "expertizaKn",
    "prisvoentDn",
    "vidminenoDn",
    "vidkladenoDn",
    "expertizaDn",
    "dateLastChange",
    "academicBoardIsActive"
})
public class DAcademicBoard {

    @XmlElement(name = "Id_AcademicBoard")
    protected int idAcademicBoard;
    @XmlElement(name = "Id_CertifyingAgencies")
    protected int idCertifyingAgencies;
    @XmlElement(name = "AcademicBoardDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar academicBoardDate;
    @XmlElement(name = "AcademicBoardOrderCreateNumber")
    protected String academicBoardOrderCreateNumber;
    @XmlElement(name = "AcademicBoardOrderEndNumber")
    protected String academicBoardOrderEndNumber;
    @XmlElement(name = "Prisvoent_D")
    protected int prisvoentD;
    @XmlElement(name = "Vidmineno_D")
    protected int vidminenoD;
    @XmlElement(name = "Vidkladeno_D")
    protected int vidkladenoD;
    @XmlElement(name = "Expertiza_D")
    protected int expertizaD;
    @XmlElement(name = "Prisvoent_P")
    protected int prisvoentP;
    @XmlElement(name = "Vidmineno_P")
    protected int vidminenoP;
    @XmlElement(name = "Vidkladeno_P")
    protected int vidkladenoP;
    @XmlElement(name = "Expertiza_P")
    protected int expertizaP;
    @XmlElement(name = "Prisvoent_SnS")
    protected int prisvoentSnS;
    @XmlElement(name = "Vidmineno_SnS")
    protected int vidminenoSnS;
    @XmlElement(name = "Vidkladeno_SnS")
    protected int vidkladenoSnS;
    @XmlElement(name = "Expertiza_SnS")
    protected int expertizaSnS;
    @XmlElement(name = "Prisvoent_Kn")
    protected int prisvoentKn;
    @XmlElement(name = "Vidmineno_Kn")
    protected int vidminenoKn;
    @XmlElement(name = "Vidkladeno_Kn")
    protected int vidkladenoKn;
    @XmlElement(name = "Expertiza_Kn")
    protected int expertizaKn;
    @XmlElement(name = "Prisvoent_Dn")
    protected int prisvoentDn;
    @XmlElement(name = "Vidmineno_Dn")
    protected int vidminenoDn;
    @XmlElement(name = "Vidkladeno_Dn")
    protected int vidkladenoDn;
    @XmlElement(name = "Expertiza_Dn")
    protected int expertizaDn;
    @XmlElement(name = "DateLastChange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastChange;
    @XmlElement(name = "AcademicBoardIsActive")
    protected int academicBoardIsActive;

    /**
     * Gets the value of the idAcademicBoard property.
     * 
     */
    public int getIdAcademicBoard() {
        return idAcademicBoard;
    }

    /**
     * Sets the value of the idAcademicBoard property.
     * 
     */
    public void setIdAcademicBoard(int value) {
        this.idAcademicBoard = value;
    }

    /**
     * Gets the value of the idCertifyingAgencies property.
     * 
     */
    public int getIdCertifyingAgencies() {
        return idCertifyingAgencies;
    }

    /**
     * Sets the value of the idCertifyingAgencies property.
     * 
     */
    public void setIdCertifyingAgencies(int value) {
        this.idCertifyingAgencies = value;
    }

    /**
     * Gets the value of the academicBoardDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicBoardDate() {
        return academicBoardDate;
    }

    /**
     * Sets the value of the academicBoardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicBoardDate(XMLGregorianCalendar value) {
        this.academicBoardDate = value;
    }

    /**
     * Gets the value of the academicBoardOrderCreateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicBoardOrderCreateNumber() {
        return academicBoardOrderCreateNumber;
    }

    /**
     * Sets the value of the academicBoardOrderCreateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicBoardOrderCreateNumber(String value) {
        this.academicBoardOrderCreateNumber = value;
    }

    /**
     * Gets the value of the academicBoardOrderEndNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicBoardOrderEndNumber() {
        return academicBoardOrderEndNumber;
    }

    /**
     * Sets the value of the academicBoardOrderEndNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicBoardOrderEndNumber(String value) {
        this.academicBoardOrderEndNumber = value;
    }

    /**
     * Gets the value of the prisvoentD property.
     * 
     */
    public int getPrisvoentD() {
        return prisvoentD;
    }

    /**
     * Sets the value of the prisvoentD property.
     * 
     */
    public void setPrisvoentD(int value) {
        this.prisvoentD = value;
    }

    /**
     * Gets the value of the vidminenoD property.
     * 
     */
    public int getVidminenoD() {
        return vidminenoD;
    }

    /**
     * Sets the value of the vidminenoD property.
     * 
     */
    public void setVidminenoD(int value) {
        this.vidminenoD = value;
    }

    /**
     * Gets the value of the vidkladenoD property.
     * 
     */
    public int getVidkladenoD() {
        return vidkladenoD;
    }

    /**
     * Sets the value of the vidkladenoD property.
     * 
     */
    public void setVidkladenoD(int value) {
        this.vidkladenoD = value;
    }

    /**
     * Gets the value of the expertizaD property.
     * 
     */
    public int getExpertizaD() {
        return expertizaD;
    }

    /**
     * Sets the value of the expertizaD property.
     * 
     */
    public void setExpertizaD(int value) {
        this.expertizaD = value;
    }

    /**
     * Gets the value of the prisvoentP property.
     * 
     */
    public int getPrisvoentP() {
        return prisvoentP;
    }

    /**
     * Sets the value of the prisvoentP property.
     * 
     */
    public void setPrisvoentP(int value) {
        this.prisvoentP = value;
    }

    /**
     * Gets the value of the vidminenoP property.
     * 
     */
    public int getVidminenoP() {
        return vidminenoP;
    }

    /**
     * Sets the value of the vidminenoP property.
     * 
     */
    public void setVidminenoP(int value) {
        this.vidminenoP = value;
    }

    /**
     * Gets the value of the vidkladenoP property.
     * 
     */
    public int getVidkladenoP() {
        return vidkladenoP;
    }

    /**
     * Sets the value of the vidkladenoP property.
     * 
     */
    public void setVidkladenoP(int value) {
        this.vidkladenoP = value;
    }

    /**
     * Gets the value of the expertizaP property.
     * 
     */
    public int getExpertizaP() {
        return expertizaP;
    }

    /**
     * Sets the value of the expertizaP property.
     * 
     */
    public void setExpertizaP(int value) {
        this.expertizaP = value;
    }

    /**
     * Gets the value of the prisvoentSnS property.
     * 
     */
    public int getPrisvoentSnS() {
        return prisvoentSnS;
    }

    /**
     * Sets the value of the prisvoentSnS property.
     * 
     */
    public void setPrisvoentSnS(int value) {
        this.prisvoentSnS = value;
    }

    /**
     * Gets the value of the vidminenoSnS property.
     * 
     */
    public int getVidminenoSnS() {
        return vidminenoSnS;
    }

    /**
     * Sets the value of the vidminenoSnS property.
     * 
     */
    public void setVidminenoSnS(int value) {
        this.vidminenoSnS = value;
    }

    /**
     * Gets the value of the vidkladenoSnS property.
     * 
     */
    public int getVidkladenoSnS() {
        return vidkladenoSnS;
    }

    /**
     * Sets the value of the vidkladenoSnS property.
     * 
     */
    public void setVidkladenoSnS(int value) {
        this.vidkladenoSnS = value;
    }

    /**
     * Gets the value of the expertizaSnS property.
     * 
     */
    public int getExpertizaSnS() {
        return expertizaSnS;
    }

    /**
     * Sets the value of the expertizaSnS property.
     * 
     */
    public void setExpertizaSnS(int value) {
        this.expertizaSnS = value;
    }

    /**
     * Gets the value of the prisvoentKn property.
     * 
     */
    public int getPrisvoentKn() {
        return prisvoentKn;
    }

    /**
     * Sets the value of the prisvoentKn property.
     * 
     */
    public void setPrisvoentKn(int value) {
        this.prisvoentKn = value;
    }

    /**
     * Gets the value of the vidminenoKn property.
     * 
     */
    public int getVidminenoKn() {
        return vidminenoKn;
    }

    /**
     * Sets the value of the vidminenoKn property.
     * 
     */
    public void setVidminenoKn(int value) {
        this.vidminenoKn = value;
    }

    /**
     * Gets the value of the vidkladenoKn property.
     * 
     */
    public int getVidkladenoKn() {
        return vidkladenoKn;
    }

    /**
     * Sets the value of the vidkladenoKn property.
     * 
     */
    public void setVidkladenoKn(int value) {
        this.vidkladenoKn = value;
    }

    /**
     * Gets the value of the expertizaKn property.
     * 
     */
    public int getExpertizaKn() {
        return expertizaKn;
    }

    /**
     * Sets the value of the expertizaKn property.
     * 
     */
    public void setExpertizaKn(int value) {
        this.expertizaKn = value;
    }

    /**
     * Gets the value of the prisvoentDn property.
     * 
     */
    public int getPrisvoentDn() {
        return prisvoentDn;
    }

    /**
     * Sets the value of the prisvoentDn property.
     * 
     */
    public void setPrisvoentDn(int value) {
        this.prisvoentDn = value;
    }

    /**
     * Gets the value of the vidminenoDn property.
     * 
     */
    public int getVidminenoDn() {
        return vidminenoDn;
    }

    /**
     * Sets the value of the vidminenoDn property.
     * 
     */
    public void setVidminenoDn(int value) {
        this.vidminenoDn = value;
    }

    /**
     * Gets the value of the vidkladenoDn property.
     * 
     */
    public int getVidkladenoDn() {
        return vidkladenoDn;
    }

    /**
     * Sets the value of the vidkladenoDn property.
     * 
     */
    public void setVidkladenoDn(int value) {
        this.vidkladenoDn = value;
    }

    /**
     * Gets the value of the expertizaDn property.
     * 
     */
    public int getExpertizaDn() {
        return expertizaDn;
    }

    /**
     * Sets the value of the expertizaDn property.
     * 
     */
    public void setExpertizaDn(int value) {
        this.expertizaDn = value;
    }

    /**
     * Gets the value of the dateLastChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastChange() {
        return dateLastChange;
    }

    /**
     * Sets the value of the dateLastChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastChange(XMLGregorianCalendar value) {
        this.dateLastChange = value;
    }

    /**
     * Gets the value of the academicBoardIsActive property.
     * 
     */
    public int getAcademicBoardIsActive() {
        return academicBoardIsActive;
    }

    /**
     * Sets the value of the academicBoardIsActive property.
     * 
     */
    public void setAcademicBoardIsActive(int value) {
        this.academicBoardIsActive = value;
    }

}
