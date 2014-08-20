/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.vesalainen.kml;

import java.io.IOException;
import java.io.InputStream;
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
    }
}
