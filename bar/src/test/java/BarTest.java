import org.junit.Test;

import static org.junit.Assert.*;

public class BarTest {
    @Test
    public void shouldNotReturnNull() {
        assertEquals("bar", Bar.process());
    }
}