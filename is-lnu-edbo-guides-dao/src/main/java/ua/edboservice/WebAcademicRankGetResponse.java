
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
 *         &lt;element name="WebAcademicRankGetResult" type="{http://edboservice.ua/}ArrayOfDWebAcademicRank" minOccurs="0"/>
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
    "webAcademicRankGetResult"
})
@XmlRootElement(name = "WebAcademicRankGetResponse")
public class WebAcademicRankGetResponse {

    @XmlElement(name = "WebAcademicRankGetResult")
    protected ArrayOfDWebAcademicRank webAcademicRankGetResult;

    /**
     * Gets the value of the webAcademicRankGetResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDWebAcademicRank }
     *     
     */
    public ArrayOfDWebAcademicRank getWebAcademicRankGetResult() {
        return webAcademicRankGetResult;
    }

    /**
     * Sets the value of the webAcademicRankGetResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDWebAcademicRank }
     *     
     */
    public void setWebAcademicRankGetResult(ArrayOfDWebAcademicRank value) {
        this.webAcademicRankGetResult = value;
    }

}
