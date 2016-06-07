package com.mckesson.hub.test;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for simple App.
 */
public class MartiniTest {

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        Martini martini = new Martini(5);
        String glass = martini.generateGlass();
        System.out.println(glass);
        assertNotNull(glass);
        assertEquals("000000000\n" +
                " 0000000\n" +
                "  00000\n" +
                "   000\n" +
                "    0\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "    |\n" +
                "=========", glass);
    }
}
