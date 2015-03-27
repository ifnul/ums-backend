
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
 *         &lt;element name="UniversityScienseSpecialitiesAspirantsAddResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "universityScienseSpecialitiesAspirantsAddResult"
})
@XmlRootElement(name = "UniversityScienseSpecialitiesAspirantsAddResponse")
public class UniversityScienseSpecialitiesAspirantsAddResponse {

    @XmlElement(name = "UniversityScienseSpecialitiesAspirantsAddResult")
    protected int universityScienseSpecialitiesAspirantsAddResult;

    /**
     * Gets the value of the universityScienseSpecialitiesAspirantsAddResult property.
     * 
     */
    public int getUniversityScienseSpecialitiesAspirantsAddResult() {
        return universityScienseSpecialitiesAspirantsAddResult;
    }

    /**
     * Sets the value of the universityScienseSpecialitiesAspirantsAddResult property.
     * 
     */
    public void setUniversityScienseSpecialitiesAspirantsAddResult(int value) {
        this.universityScienseSpecialitiesAspirantsAddResult = value;
    }

}
