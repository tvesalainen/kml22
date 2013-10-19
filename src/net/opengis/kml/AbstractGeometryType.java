//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 11:15:43 AM EEST 
//


package net.opengis.kml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import net.opengis.kml.ex.MultiTrackType;
import net.opengis.kml.ex.TrackType;


/**
 * <p>Java class for AbstractGeometryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractGeometryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/kml/2.2}AbstractObjectType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractGeometrySimpleExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/kml/2.2}AbstractGeometryObjectExtensionGroup" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractGeometryType", propOrder = {
    "abstractGeometrySimpleExtensionGroup",
    "abstractGeometryObjectExtensionGroup"
})
@XmlSeeAlso({
    MultiTrackType.class,
    TrackType.class,
    ModelType.class,
    PointType.class,
    PolygonType.class,
    LinearRingType.class,
    MultiGeometryType.class,
    LineStringType.class
})
public abstract class AbstractGeometryType
    extends AbstractObjectType
{

    @XmlElementRef(name = "AbstractGeometrySimpleExtensionGroup", namespace = "http://www.opengis.net/kml/2.2", type = JAXBElement.class, required = false)
    protected List<JAXBElement<?>> abstractGeometrySimpleExtensionGroup;
    @XmlElement(name = "AbstractGeometryObjectExtensionGroup")
    protected List<AbstractObjectType> abstractGeometryObjectExtensionGroup;

    /**
     * Gets the value of the abstractGeometrySimpleExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractGeometrySimpleExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractGeometrySimpleExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractGeometrySimpleExtensionGroup() {
        if (abstractGeometrySimpleExtensionGroup == null) {
            abstractGeometrySimpleExtensionGroup = new ArrayList<JAXBElement<?>>();
        }
        return this.abstractGeometrySimpleExtensionGroup;
    }

    /**
     * Gets the value of the abstractGeometryObjectExtensionGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractGeometryObjectExtensionGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractGeometryObjectExtensionGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractObjectType }
     * 
     * 
     */
    public List<AbstractObjectType> getAbstractGeometryObjectExtensionGroup() {
        if (abstractGeometryObjectExtensionGroup == null) {
            abstractGeometryObjectExtensionGroup = new ArrayList<AbstractObjectType>();
        }
        return this.abstractGeometryObjectExtensionGroup;
    }

}
