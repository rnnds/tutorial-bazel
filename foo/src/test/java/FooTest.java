import org.junit.Test;

import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void shouldNotReturnNull() {
        assertEquals("foobar", Foo.process());
    }
}