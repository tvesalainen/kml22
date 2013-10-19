//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 11:15:43 AM EEST 
//


package net.opengis.kml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoundaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoundaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}LinearRing" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}BoundarySimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}BoundaryObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundaryType", propOrder = {
    "linearRing",
    "boundarySimpleExtensionGroup",
    "boundaryObjectExtensionGroup"
})
public class BoundaryType {

    @XmlElement(name = "LinearRing")
    protected LinearRingType linearRing;
    @XmlElement(name = "BoundarySimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> boundarySimpleExtensionGroup;
    @XmlElement(name = "BoundaryObjectExtensionGroup")
    protected List<AbstractObjectType> boundaryObjectExtensionGroup;

    /**
     * Gets the value of the linearRing property.
     * 
     * @return
     *     possible object is
     *     {@link LinearRingType }
     *     
     */
    public LinearRingType getLinearRing() {
        return linearRing;
    }

    /**
     * Sets the value of the linearRing property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearRingType }
     *     
     */
    public void setLinearRing(LinearRingType value) {
        this.linearRing = value;
    }

    /**
     * Gets the value of the boundarySimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundarySimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundarySimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getBoundarySimpleExtensionGroup() {
        if (boundarySimpleExtensionGroup == null) {
            boundarySimpleExtensionGroup = new ArrayList<Object>();
        }
        return this.boundarySimpleExtensionGroup;
    }

    /**
     * Gets the value of the boundaryObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundaryObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundaryObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getBoundaryObjectExtensionGroup() {
        if (boundaryObjectExtensionGroup == null) {
            boundaryObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.boundaryObjectExtensionGroup;
    }

}
