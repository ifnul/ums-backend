
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
 *         &lt;element name="Id_AcademicBoard" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AcademicBoardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicBoardOrderCreateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AcademicBoardOrderEndNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idAcademicBoard",
    "academicBoardDate",
    "academicBoardOrderCreateNumber",
    "academicBoardOrderEndNumber"
})
@XmlRootElement(name = "AcademicBoardEdit")
public class AcademicBoardEdit {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_AcademicBoard")
    protected int idAcademicBoard;
    @XmlElement(name = "AcademicBoardDate")
    protected String academicBoardDate;
    @XmlElement(name = "AcademicBoardOrderCreateNumber")
    protected String academicBoardOrderCreateNumber;
    @XmlElement(name = "AcademicBoardOrderEndNumber")
    protected String academicBoardOrderEndNumber;

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
     * Gets the value of the academicBoardDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicBoardDate() {
        return academicBoardDate;
    }

    /**
     * Sets the value of the academicBoardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicBoardDate(String value) {
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

}
