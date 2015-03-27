
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
 *         &lt;element name="WebAcademicDegreiesGetResult" type="{http://edboservice.ua/}ArrayOfDWebAcademicDegreies" minOccurs="0"/>
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
    "webAcademicDegreiesGetResult"
})
@XmlRootElement(name = "WebAcademicDegreiesGetResponse")
public class WebAcademicDegreiesGetResponse {

    @XmlElement(name = "WebAcademicDegreiesGetResult")
    protected ArrayOfDWebAcademicDegreies webAcademicDegreiesGetResult;

    /**
     * Gets the value of the webAcademicDegreiesGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDWebAcademicDegreies }
     *     
     */
    public ArrayOfDWebAcademicDegreies getWebAcademicDegreiesGetResult() {
        return webAcademicDegreiesGetResult;
    }

    /**
     * Sets the value of the webAcademicDegreiesGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDWebAcademicDegreies }
     *     
     */
    public void setWebAcademicDegreiesGetResult(ArrayOfDWebAcademicDegreies value) {
        this.webAcademicDegreiesGetResult = value;
    }

}
