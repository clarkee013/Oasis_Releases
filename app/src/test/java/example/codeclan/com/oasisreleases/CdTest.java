package example.codeclan.com.oasisreleases;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 05/07/2017.
 */

public class CdTest {

    Cd cd;

    @Before
    public void before(){
        cd = new Cd(101, "Shakermaker", 1993);
    }

    @Test
    public void canGetRanking(){
        assertEquals(101, cd.getRanking());
    }

    @Test
    public void canGetTitle(){
        assertEquals("Shakermaker", cd.getTitle());
    }

    @Test
    public void canGetYear(){
        assertEquals(1993, cd.getYear());
    }
}