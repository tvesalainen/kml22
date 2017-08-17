/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vesalainen.kml;

import java.util.List;
import javax.xml.bind.JAXBElement;
import org.vesalainen.repacked.net.opengis.kml.AbstractFeatureType;
import org.vesalainen.repacked.net.opengis.kml.AbstractGeometryType;
import org.vesalainen.repacked.net.opengis.kml.AbstractTimePrimitiveType;
import org.vesalainen.repacked.net.opengis.kml.DocumentType;
import org.vesalainen.repacked.net.opengis.kml.FolderType;
import org.vesalainen.repacked.net.opengis.kml.LineStringType;
import org.vesalainen.repacked.net.opengis.kml.LinearRingType;
import org.vesalainen.repacked.net.opengis.kml.PlacemarkType;
import org.vesalainen.repacked.net.opengis.kml.PointType;
import org.vesalainen.repacked.net.opengis.kml.PolygonType;
import org.vesalainen.repacked.net.opengis.kml.TimeSpanType;
import org.vesalainen.repacked.net.opengis.kml.TimeStampType;

/**
 *
 * @author Timo Vesalainen <timo.vesalainen@iki.fi>
 */
public abstract class FeatureVisitor<C>
{
    public void visit(KML kml, C ctx)
    {
        JAXBElement<? extends AbstractFeatureType> document = kml.getKml().getValue().getAbstractFeatureGroup();
        visit(document.getValue(), ctx);
    }
    public void visit(AbstractFeatureType feature, C ctx)
    {
        if (feature instanceof FolderType)
        {
            FolderType folder = (FolderType) feature;
            ctx = startOf(folder, ctx);
            handleTimePrimitive(feature, ctx);
            for (JAXBElement<? extends AbstractFeatureType> ft : folder.getAbstractFeatureGroup())
            {
                visit(ft.getValue(), ctx);
            }
            endOf(folder, ctx);
        }
        else
        if (feature instanceof DocumentType)
        {
            DocumentType document = (DocumentType) feature;
            ctx = startOf(document, ctx);
            handleTimePrimitive(feature, ctx);
            for (JAXBElement<? extends AbstractFeatureType> ft : document.getAbstractFeatureGroup())
            {
                visit(ft.getValue(), ctx);
            }
            endOf(document, ctx);
        }
        else
        if (feature instanceof PlacemarkType)
        {
            PlacemarkType placemark = (PlacemarkType) feature;
            ctx = startOf(placemark, ctx);
            handleTimePrimitive(feature, ctx);
            handleGeometry(placemark, ctx);
            endOf(placemark, ctx);
        }
    }

    private void handleGeometry(PlacemarkType placemark, C ctx)
    {
        JAXBElement<? extends AbstractGeometryType> geometryType = placemark.getAbstractGeometryGroup();
        if (geometryType != null)
        {
            AbstractGeometryType geometry = geometryType.getValue();
            if (geometry instanceof PointType)
            {
                handlePoint(placemark, (PointType)geometry, ctx);
                PointType pt = (PointType) geometry;
                handleCoordinates(placemark, pt.getCoordinates(), ctx);
            }
            else
            if (geometry instanceof LineStringType)
            {
                LineStringType ls = (LineStringType)geometry;
                handleLineString(placemark, ls, ctx);
                handleCoordinates(placemark, ls.getCoordinates(), ctx);
            }
            else
            if (geometry instanceof LinearRingType)
            {
                LinearRingType lr = (LinearRingType)geometry;
                handleLinearRing(placemark, lr, ctx);
                handleCoordinates(placemark, lr.getCoordinates(), ctx);
            }
            else
            if (geometry instanceof PolygonType)
            {
                PolygonType p = (PolygonType)geometry;
                handlePolygon(placemark, p, ctx);
                handleCoordinates(placemark, p.getOuterBoundaryIs().getLinearRing().getCoordinates(), ctx);
            }
            else
            {
                throw new UnsupportedOperationException(geometry+" not supported");
            }
        }
    }
    private void handleTimePrimitive(AbstractFeatureType feature, C ctx)
    {
        JAXBElement<? extends AbstractTimePrimitiveType> timePrimitiveType = feature.getAbstractTimePrimitiveGroup();
        if (timePrimitiveType != null)
        {
            AbstractTimePrimitiveType tp = timePrimitiveType.getValue();
            if (tp instanceof TimeSpanType)
            {
                handleTimeSpan(feature, (TimeSpanType) tp, ctx);
            }
            else
            {
                handleTimeStamp(feature, (TimeStampType) tp, ctx);
            }
        }
    }
    protected abstract void handleTimeSpan(AbstractFeatureType feature, TimeSpanType timeSpan, C ctx);
    protected abstract void handleTimeStamp(AbstractFeatureType feature, TimeStampType timeStamp, C ctx);
    protected abstract void handlePoint(PlacemarkType placemark, PointType point, C ctx);
    protected abstract void handleLineString(PlacemarkType placemark, LineStringType lineString, C ctx);
    protected abstract void handleLinearRing(PlacemarkType placemark, LinearRingType linearRing, C ctx);
    protected abstract void handlePolygon(PlacemarkType placemark, PolygonType polygon, C ctx);
    protected abstract void handleCoordinates(PlacemarkType placemark, List<String> coordinates, C ctx);

    protected abstract C startOf(DocumentType document, C ctx);
    protected abstract void endOf(DocumentType document, C ctx);
    protected abstract C startOf(FolderType folder, C ctx);
    protected abstract void endOf(FolderType folder, C ctx);
    protected abstract C startOf(PlacemarkType placemark, C ctx);
    protected abstract void endOf(PlacemarkType placemark, C ctx);
    
}
