import org.junit.Test;

import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void shouldNotReturnNull() {
        assertNotNull(Foo.process());
    }
}