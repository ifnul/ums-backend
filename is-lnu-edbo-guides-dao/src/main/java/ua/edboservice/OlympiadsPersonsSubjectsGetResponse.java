
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
 *         &lt;element name="OlympiadsPersonsSubjectsGetResult" type="{http://edboservice.ua/}ArrayOfDOlympiadsPersonsSubjects" minOccurs="0"/>
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
    "olympiadsPersonsSubjectsGetResult"
})
@XmlRootElement(name = "OlympiadsPersonsSubjectsGetResponse")
public class OlympiadsPersonsSubjectsGetResponse {

    @XmlElement(name = "OlympiadsPersonsSubjectsGetResult")
    protected ArrayOfDOlympiadsPersonsSubjects olympiadsPersonsSubjectsGetResult;

    /**
     * Gets the value of the olympiadsPersonsSubjectsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDOlympiadsPersonsSubjects }
     *     
     */
    public ArrayOfDOlympiadsPersonsSubjects getOlympiadsPersonsSubjectsGetResult() {
        return olympiadsPersonsSubjectsGetResult;
    }

    /**
     * Sets the value of the olympiadsPersonsSubjectsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDOlympiadsPersonsSubjects }
     *     
     */
    public void setOlympiadsPersonsSubjectsGetResult(ArrayOfDOlympiadsPersonsSubjects value) {
        this.olympiadsPersonsSubjectsGetResult = value;
    }

}
