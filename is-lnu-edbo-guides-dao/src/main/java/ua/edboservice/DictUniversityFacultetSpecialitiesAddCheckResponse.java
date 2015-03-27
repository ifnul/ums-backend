
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
 *         &lt;element name="DictUniversityFacultetSpecialitiesAddCheckResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "dictUniversityFacultetSpecialitiesAddCheckResult"
})
@XmlRootElement(name = "DictUniversityFacultetSpecialitiesAddCheckResponse")
public class DictUniversityFacultetSpecialitiesAddCheckResponse {

    @XmlElement(name = "DictUniversityFacultetSpecialitiesAddCheckResult")
    protected int dictUniversityFacultetSpecialitiesAddCheckResult;

    /**
     * Gets the value of the dictUniversityFacultetSpecialitiesAddCheckResult property.
     * 
     */
    public int getDictUniversityFacultetSpecialitiesAddCheckResult() {
        return dictUniversityFacultetSpecialitiesAddCheckResult;
    }

    /**
     * Sets the value of the dictUniversityFacultetSpecialitiesAddCheckResult property.
     * 
     */
    public void setDictUniversityFacultetSpecialitiesAddCheckResult(int value) {
        this.dictUniversityFacultetSpecialitiesAddCheckResult = value;
    }

}
