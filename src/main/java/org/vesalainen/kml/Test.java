/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.vesalainen.kml;

import java.io.File;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;
import org.vesalainen.repacked.net.opengis.kml.DocumentType;
import org.vesalainen.repacked.net.opengis.kml.KmlType;
import org.vesalainen.repacked.net.opengis.kml.LinkType;
import org.vesalainen.repacked.net.opengis.kml.ObjectFactory;

/**
 * @author Timo Vesalainen
 */
public class Test
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            URL url = new URL("http://www.yachtiiris.net/placemark/pmk20110620211944.kmz");
            KMZ kmz = new KMZ(url);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

}
