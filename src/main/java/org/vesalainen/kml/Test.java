/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.vesalainen.kml;

import java.net.URL;

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
