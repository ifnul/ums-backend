
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
 *         &lt;element name="Id_EducationalCyclesPatternDisciplinesGroup" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "idEducationalCyclesPatternDisciplinesGroup"
})
@XmlRootElement(name = "EducationalCyclesPatternDisciplinesGroupsDel")
public class EducationalCyclesPatternDisciplinesGroupsDel {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_EducationalCyclesPatternDisciplinesGroup")
    protected int idEducationalCyclesPatternDisciplinesGroup;

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
     * Gets the value of the idEducationalCyclesPatternDisciplinesGroup property.
     * 
     */
    public int getIdEducationalCyclesPatternDisciplinesGroup() {
        return idEducationalCyclesPatternDisciplinesGroup;
    }

    /**
     * Sets the value of the idEducationalCyclesPatternDisciplinesGroup property.
     * 
     */
    public void setIdEducationalCyclesPatternDisciplinesGroup(int value) {
        this.idEducationalCyclesPatternDisciplinesGroup = value;
    }

}
