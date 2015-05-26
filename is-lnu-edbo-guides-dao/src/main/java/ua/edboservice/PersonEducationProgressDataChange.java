
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
 *         &lt;element name="Id_PersonEducationProgressOrders" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonEducationProgressDatas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idPersonEducationProgressOrders",
    "personEducationProgressDatas"
})
@XmlRootElement(name = "PersonEducationProgressDataChange")
public class PersonEducationProgressDataChange {

    @XmlElement(name = "SessionGUID")
    protected String sessionGUID;
    @XmlElement(name = "Id_PersonEducationProgressOrders")
    protected int idPersonEducationProgressOrders;
    @XmlElement(name = "PersonEducationProgressDatas")
    protected String personEducationProgressDatas;

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
     * Gets the value of the idPersonEducationProgressOrders property.
     * 
     */
    public int getIdPersonEducationProgressOrders() {
        return idPersonEducationProgressOrders;
    }

    /**
     * Sets the value of the idPersonEducationProgressOrders property.
     * 
     */
    public void setIdPersonEducationProgressOrders(int value) {
        this.idPersonEducationProgressOrders = value;
    }

    /**
     * Gets the value of the personEducationProgressDatas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEducationProgressDatas() {
        return personEducationProgressDatas;
    }

    /**
     * Sets the value of the personEducationProgressDatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEducationProgressDatas(String value) {
        this.personEducationProgressDatas = value;
    }

}
