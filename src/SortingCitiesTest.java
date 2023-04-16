import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingCitiesTest {
    SortingCities obj;
    @Before
    public void setUp(){
      obj = new SortingCities();
    }
    @After
    public void tearDown(){
        obj = null;
    }
    @Test
    public void citiesWithDistanceTest(){
        SortingCities obj = new SortingCities();
        String []str = {"LUCERNE", "ENGELBERG", "BASEL", "JUNGFRAUJOCH", "MURREN", "INTERLAKEN", "GRINDELWALD", "BERN", "ZERMATT", "GENEVA"};
        assertArrayEquals(str,obj.citiesWithDistance(new String[]{"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"},new int[]{138, 52, 118, 136, 85, 276, 103, 87, 214, 101}));
    }
    @Test
    public void fineCityTest(){
        SortingCities obj = new SortingCities();
        assertEquals("Lucerne",obj.findCity(new String[]{"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"},new int[]{138, 52, 118, 136, 85, 276, 103, 87, 214, 101}));
    }
    @Test
    public void findHighestCity(){
        SortingCities obj = new SortingCities();
        assertEquals("Geneva",obj.findHighestCity(new String[]{"Bern", "Lucerne", "Interlaken", "Grindelwald", "Engelberg", "Geneva", "Murren", "Basel", "Zermatt", "Jungfraujoch"},new int[]{138, 52, 118, 136, 85, 276, 103, 87, 214, 101}));

    }

}