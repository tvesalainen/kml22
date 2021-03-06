/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.vesalainen.kml;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBException;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Timo Vesalainen
 */
public class KMZTest
{
    
    public KMZTest()
    {
    }

    @Test
    public void test0()
    {
        KMZ kmz = new KMZ();
        assertNotNull(kmz);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try
        {
            kmz.writeTo(baos);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
            fail(ex.getMessage());
        }
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        try
        {
            KMZ kmz2 = new KMZ(bais);
        }
        catch (IOException | JAXBException ex)
        {
            ex.printStackTrace();
            fail(ex.getMessage());
        }
    }
}
