/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.vesalainen.kml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import org.vesalainen.repacked.net.opengis.kml.AbstractFeatureType;
import org.vesalainen.repacked.net.opengis.kml.KmlType;
import org.vesalainen.repacked.net.opengis.kml.LinkType;
import org.vesalainen.repacked.net.opengis.kml.LookAtType;
import org.vesalainen.repacked.net.opengis.kml.NetworkLinkType;
import org.vesalainen.repacked.net.opengis.kml.ObjectFactory;

/**
 * @author Timo Vesalainen
 */
public class KML 
{
    protected static JAXBContext jaxbCtx;
    protected static ObjectFactory factory;
    protected static DatatypeFactory dtFactory;
    protected JAXBElement<KmlType> kml;

    static
    {
        try
        {
            jaxbCtx = JAXBContext.newInstance("net.opengis.kml");
            factory = new ObjectFactory();
            dtFactory = DatatypeFactory.newInstance();
        }
        catch (DatatypeConfigurationException ex)
        {
            throw new IllegalArgumentException(ex);
        }
        catch (JAXBException ex)
        {
            throw new IllegalArgumentException(ex);
        }
    }
    public KML()
    {
        kml = factory.createKml(factory.createKmlType());
    }

    public KML(File file) throws IOException, JAXBException
    {
        Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
        try (FileInputStream fis = new FileInputStream(file))
        {
            kml = (JAXBElement<KmlType>) unmarshaller.unmarshal(fis); //NOI18N
        }
    }

    public KML(InputStream is) throws IOException, JAXBException
    {
        Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
        kml = (JAXBElement<KmlType>) unmarshaller.unmarshal(is);
    }

    public ObjectFactory getFactory()
    {
        return factory;
    }

    public JAXBElement<KmlType> getKml()
    {
        return kml;
    }

    public DatatypeFactory getDtFactory()
    {
        return dtFactory;
    }
    /**
     * @deprecated 
     * @return 
     */
    public JAXBElement<LookAtType> createLookAt()
    {
        return factory.createLookAt(factory.createLookAtType());
    }
    /**
     * @deprecated 
     * @return 
     */
    public JAXBElement<NetworkLinkType> createNetworkLink()
    {
        return factory.createNetworkLink(factory.createNetworkLinkType());
    }
    /**
     * @deprecated 
     * @return 
     */
    public LinkType createLink()
    {
        return factory.createLinkType();
    }
    public void set(JAXBElement<? extends AbstractFeatureType> feature)
    {
        kml.getValue().setAbstractFeatureGroup(feature);
    }
    public void write(Writer writer) throws IOException
    {
        try
        {
            Marshaller marshaller = jaxbCtx.createMarshaller();
            marshaller.marshal(kml, writer);
        }
        catch (JAXBException ex)
        {
            throw new IOException(ex);
        }
    }
}
