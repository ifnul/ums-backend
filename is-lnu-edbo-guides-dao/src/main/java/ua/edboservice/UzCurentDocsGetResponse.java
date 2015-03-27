
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
 *         &lt;element name="UzCurentDocsGetResult" type="{http://edboservice.ua/}ArrayOfDUzCurentDocs" minOccurs="0"/>
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
    "uzCurentDocsGetResult"
})
@XmlRootElement(name = "UzCurentDocsGetResponse")
public class UzCurentDocsGetResponse {

    @XmlElement(name = "UzCurentDocsGetResult")
    protected ArrayOfDUzCurentDocs uzCurentDocsGetResult;

    /**
     * Gets the value of the uzCurentDocsGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDUzCurentDocs }
     *     
     */
    public ArrayOfDUzCurentDocs getUzCurentDocsGetResult() {
        return uzCurentDocsGetResult;
    }

    /**
     * Sets the value of the uzCurentDocsGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDUzCurentDocs }
     *     
     */
    public void setUzCurentDocsGetResult(ArrayOfDUzCurentDocs value) {
        this.uzCurentDocsGetResult = value;
    }

}
