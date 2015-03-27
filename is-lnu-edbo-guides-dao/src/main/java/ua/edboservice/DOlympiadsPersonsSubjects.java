
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dOlympiadsPersonsSubjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dOlympiadsPersonsSubjects">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_OlympiadPersonsSubject" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OlympiadPersonsSubjectsName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dOlympiadsPersonsSubjects", propOrder = {
    "idOlympiadPersonsSubject",
    "olympiadPersonsSubjectsName"
})
public class DOlympiadsPersonsSubjects {

    @XmlElement(name = "Id_OlympiadPersonsSubject")
    protected int idOlympiadPersonsSubject;
    @XmlElement(name = "OlympiadPersonsSubjectsName")
    protected String olympiadPersonsSubjectsName;

    /**
     * Gets the value of the idOlympiadPersonsSubject property.
     * 
     */
    public int getIdOlympiadPersonsSubject() {
        return idOlympiadPersonsSubject;
    }

    /**
     * Sets the value of the idOlympiadPersonsSubject property.
     * 
     */
    public void setIdOlympiadPersonsSubject(int value) {
        this.idOlympiadPersonsSubject = value;
    }

    /**
     * Gets the value of the olympiadPersonsSubjectsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOlympiadPersonsSubjectsName() {
        return olympiadPersonsSubjectsName;
    }

    /**
     * Sets the value of the olympiadPersonsSubjectsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOlympiadPersonsSubjectsName(String value) {
        this.olympiadPersonsSubjectsName = value;
    }

}
