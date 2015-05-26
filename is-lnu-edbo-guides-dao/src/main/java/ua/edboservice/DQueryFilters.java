
package ua.edboservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dQueryFilters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dQueryFilters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_QueriesFilter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="QueriesFilterParameterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueriesFilterParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueriesFilterParameterIsString" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dQueryFilters", propOrder = {
    "idQueriesFilter",
    "queriesFilterParameterName",
    "queriesFilterParameter",
    "queriesFilterParameterIsString"
})
public class DQueryFilters {

    @XmlElement(name = "Id_QueriesFilter")
    protected int idQueriesFilter;
    @XmlElement(name = "QueriesFilterParameterName")
    protected String queriesFilterParameterName;
    @XmlElement(name = "QueriesFilterParameter")
    protected String queriesFilterParameter;
    @XmlElement(name = "QueriesFilterParameterIsString")
    protected int queriesFilterParameterIsString;

    /**
     * Gets the value of the idQueriesFilter property.
     * 
     */
    public int getIdQueriesFilter() {
        return idQueriesFilter;
    }

    /**
     * Sets the value of the idQueriesFilter property.
     * 
     */
    public void setIdQueriesFilter(int value) {
        this.idQueriesFilter = value;
    }

    /**
     * Gets the value of the queriesFilterParameterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueriesFilterParameterName() {
        return queriesFilterParameterName;
    }

    /**
     * Sets the value of the queriesFilterParameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueriesFilterParameterName(String value) {
        this.queriesFilterParameterName = value;
    }

    /**
     * Gets the value of the queriesFilterParameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueriesFilterParameter() {
        return queriesFilterParameter;
    }

    /**
     * Sets the value of the queriesFilterParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueriesFilterParameter(String value) {
        this.queriesFilterParameter = value;
    }

    /**
     * Gets the value of the queriesFilterParameterIsString property.
     * 
     */
    public int getQueriesFilterParameterIsString() {
        return queriesFilterParameterIsString;
    }

    /**
     * Sets the value of the queriesFilterParameterIsString property.
     * 
     */
    public void setQueriesFilterParameterIsString(int value) {
        this.queriesFilterParameterIsString = value;
    }

}
