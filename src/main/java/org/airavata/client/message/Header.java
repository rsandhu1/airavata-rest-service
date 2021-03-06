//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.06.18 at 02:07:40 PM EDT 
//


package org.airavata.client.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{}experimentid" minOccurs="0"/>
 *         &lt;element ref="{}experimentName" minOccurs="0"/>
 *         &lt;element ref="{}hostname" minOccurs="0"/>
 *         &lt;element ref="{}processorcount" minOccurs="0"/>
 *         &lt;element ref="{}hostcount" minOccurs="0"/>
 *         &lt;element ref="{}queuename" minOccurs="0"/>
 *         &lt;element ref="{}walltime" minOccurs="0"/>
 *         &lt;element ref="{}userdn" minOccurs="0"/>
 *         &lt;element ref="{}applicationId" minOccurs="0"/>
 *         &lt;element ref="{}executable" minOccurs="0"/>
 *         &lt;element ref="{}emailid" minOccurs="0"/>
 *         &lt;element ref="{}emailparam" minOccurs="0"/>
 *         &lt;element ref="{}outputLocation" minOccurs="0"/>
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
    "experimentid",
    "experimentName",
    "hostname",
    "processorcount",
    "hostcount",
    "queuename",
    "walltime",
    "userdn",
    "applicationId",
    "executable",
    "emailid",
    "emailparam",
    "outputLocation"
})
@XmlRootElement(name = "Header")
public class Header {

    protected String experimentid;
    protected String experimentName;
    protected String hostname;
    protected Integer processorcount;
    protected Integer hostcount;
    protected String queuename;
    protected Integer walltime;
    protected String userdn;
    protected String applicationId;
    protected String executable;
    protected String emailid;
    protected String emailparam;
    protected String outputLocation;

    /**
     * Gets the value of the experimentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperimentid() {
        return experimentid;
    }

    /**
     * Sets the value of the experimentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperimentid(String value) {
        this.experimentid = value;
    }

    /**
     * Gets the value of the experimentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExperimentName() {
        return experimentName;
    }

    /**
     * Sets the value of the experimentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExperimentName(String value) {
        this.experimentName = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the processorcount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProcessorcount() {
        return processorcount;
    }

    /**
     * Sets the value of the processorcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProcessorcount(Integer value) {
        this.processorcount = value;
    }

    /**
     * Gets the value of the hostcount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHostcount() {
        return hostcount;
    }

    /**
     * Sets the value of the hostcount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHostcount(Integer value) {
        this.hostcount = value;
    }

    /**
     * Gets the value of the queuename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueuename() {
        return queuename;
    }

    /**
     * Sets the value of the queuename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueuename(String value) {
        this.queuename = value;
    }

    /**
     * Gets the value of the walltime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWalltime() {
        return walltime;
    }

    /**
     * Sets the value of the walltime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWalltime(Integer value) {
        this.walltime = value;
    }

    /**
     * Gets the value of the userdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserdn() {
        return userdn;
    }

    /**
     * Sets the value of the userdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserdn(String value) {
        this.userdn = value;
    }

    /**
     * Gets the value of the applicationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of the applicationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    /**
     * Gets the value of the executable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutable() {
        return executable;
    }

    /**
     * Sets the value of the executable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutable(String value) {
        this.executable = value;
    }

    /**
     * Gets the value of the emailid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailid() {
        return emailid;
    }

    /**
     * Sets the value of the emailid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailid(String value) {
        this.emailid = value;
    }

    /**
     * Gets the value of the emailparam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailparam() {
        return emailparam;
    }

    /**
     * Sets the value of the emailparam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailparam(String value) {
        this.emailparam = value;
    }

    /**
     * Gets the value of the outputLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputLocation() {
        return outputLocation;
    }

    /**
     * Sets the value of the outputLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputLocation(String value) {
        this.outputLocation = value;
    }

}
