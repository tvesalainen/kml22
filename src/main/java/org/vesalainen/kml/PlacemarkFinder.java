/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.vesalainen.kml;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBElement;
import net.opengis.kml.AbstractFeatureType;
import net.opengis.kml.DocumentType;
import net.opengis.kml.FolderType;
import net.opengis.kml.LineStringType;
import net.opengis.kml.LinearRingType;
import net.opengis.kml.PlacemarkType;
import net.opengis.kml.PointType;
import net.opengis.kml.PolygonType;
import net.opengis.kml.TimeSpanType;
import net.opengis.kml.TimeStampType;

/**
 * @author Timo Vesalainen
 */
public class PlacemarkFinder extends FeatureVisitor<Object>
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            File f = new File("C:\\Users\\tkv\\Dropbox\\Valpuri\\Valpurin laituripaikka.kmz");
            KMZ kmz = new KMZ(f);
            PlacemarkFinder pf = new PlacemarkFinder();
            pf.visit(kmz, null);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    @Override
    protected void handleTimeSpan(AbstractFeatureType feature, TimeSpanType timeSpan, Object ctx)
    {
    }

    @Override
    protected void handleTimeStamp(AbstractFeatureType feature, TimeStampType timeStamp, Object ctx)
    {
    }

    @Override
    protected void handlePoint(PlacemarkType placemark, PointType point, Object ctx)
    {
    }

    @Override
    protected void handleLineString(PlacemarkType placemark, LineStringType lineString, Object ctx)
    {
    }

    @Override
    protected void handleLinearRing(PlacemarkType placemark, LinearRingType linearRing, Object ctx)
    {
    }

    @Override
    protected void handlePolygon(PlacemarkType placemark, PolygonType polygon, Object ctx)
    {
    }

    @Override
    protected void handleCoordinates(PlacemarkType placemark, List<String> coordinates, Object ctx)
    {
        if (coordinates != null && !coordinates.isEmpty())
        {
            String[] ss = coordinates.get(0).split(",");
            if (ss.length >= 2)
            {
                System.err.println(coordinates);
            }
        }
    }

    @Override
    protected Object startOf(DocumentType document, Object ctx)
    {
        return ctx;
    }

    @Override
    protected void endOf(DocumentType document, Object ctx)
    {
    }

    @Override
    protected Object startOf(FolderType folder, Object ctx)
    {
        return ctx;
    }

    @Override
    protected void endOf(FolderType folder, Object ctx)
    {
    }

    @Override
    protected Object startOf(PlacemarkType placemark, Object ctx)
    {
        return ctx;
    }

    @Override
    protected void endOf(PlacemarkType placemark, Object ctx)
    {
    }

}
