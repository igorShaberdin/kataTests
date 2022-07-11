import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
        @Test
        public void test() {
            assertEquals(811181, Main.test(9119));
            assertEquals(0, Main.test(0));
        }
    }
