//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.07 at 04:37:11 PM EDT 
//


package gov.nc.ncidng.ncidngwebservice.schemas;

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
 *         &lt;element name="AppID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AppPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memberDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupDN" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "appID",
    "appPassword",
    "memberDN",
    "groupDN"
})
@XmlRootElement(name = "UnsubscribeUserFromGroupRequest")
public class UnsubscribeUserFromGroupRequest {

    @XmlElement(name = "AppID", required = true)
    protected String appID;
    @XmlElement(name = "AppPassword", required = true)
    protected String appPassword;
    @XmlElement(required = true)
    protected String memberDN;
    @XmlElement(required = true)
    protected String groupDN;

    /**
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }

    /**
     * Gets the value of the appPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppPassword() {
        return appPassword;
    }

    /**
     * Sets the value of the appPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPassword(String value) {
        this.appPassword = value;
    }

    /**
     * Gets the value of the memberDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberDN() {
        return memberDN;
    }

    /**
     * Sets the value of the memberDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberDN(String value) {
        this.memberDN = value;
    }

    /**
     * Gets the value of the groupDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupDN() {
        return groupDN;
    }

    /**
     * Sets the value of the groupDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupDN(String value) {
        this.groupDN = value;
    }

}
