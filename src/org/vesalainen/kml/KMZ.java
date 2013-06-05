/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.vesalainen.kml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import net.opengis.kml.KmlType;

/**
 * @author Timo Vesalainen
 */
public class KMZ extends KML
{

    public KMZ()
    {
    }

    public KMZ(URL url) throws JAXBException, IOException
    {
        Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
        try (InputStream is = url.openStream())
        {
            try (ZipInputStream zis = new ZipInputStream(is))
            {
                zis.getNextEntry();
                kml = (JAXBElement<KmlType>) unmarshaller.unmarshal(zis); //NOI18N
            }
        }
    }

    public KMZ(File file) throws IOException, JAXBException
    {
        Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
        try (FileInputStream fis = new FileInputStream(file))
        {
            try (ZipInputStream zis = new ZipInputStream(fis))
            {
                zis.getNextEntry();
                kml = (JAXBElement<KmlType>) unmarshaller.unmarshal(zis); //NOI18N
            }
        }
    }

    public KMZ(InputStream is) throws IOException, JAXBException
    {
        Unmarshaller unmarshaller = jaxbCtx.createUnmarshaller();
        try (ZipInputStream zis = new ZipInputStream(is))
        {
            zis.getNextEntry();
            kml = (JAXBElement<KmlType>) unmarshaller.unmarshal(zis); //NOI18N
        }
    }

    public void write(OutputStream fos) throws IOException
    {
        try (ZipOutputStream zos = new ZipOutputStream(fos))
        {
            Writer out = new OutputStreamWriter(zos, "UTF-8");
            zos.putNextEntry(new ZipEntry("doc.kml"));
            write(out);
        }
    }
}
