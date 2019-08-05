import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TEstMain {
    
    @Test
    public void checkPositiveValues()
    {
        assertEquals( 3, Main.add(1,2));
        assertEquals(24, Main.add(5,19));
        assertEquals(40, Main.add(23,17));
    }
    @Test
    public void checkNegativeValues()
    {
        assertEquals( -30, Main.add(-14,-16));
        assertEquals(-226, Main.add(-50,-176));
        assertEquals( -39, Main.add(-10,-29));
    }
    @Test
    public void checkMixtureValues()
    {
        assertEquals(  0, Main.add(-13,13));
        assertEquals( -9, Main.add(-27,18));
        assertEquals(-60, Main.add(-90,30));
    }
}
