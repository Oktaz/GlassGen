package com.mckesson.hub.test;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BeerTest {

    @Test
    public void testApp()
    {
        Beer beer = new Beer(4);
        String glass = beer.generateGlass();
        System.out.println(glass);
        assertNotNull(glass);
        assertEquals(
                " ____\n" +
                "|    |\n" +
                "|    |\n" +
                "|    |\n" +
                "|____|", glass);
    }
}
