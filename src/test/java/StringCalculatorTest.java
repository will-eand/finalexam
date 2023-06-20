import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    StringCalculator stringCalc = new StringCalculator();

    @Test
    public void StringCalculatorTest1() throws Exception {

        assertThrows(Exception.class, () -> {
            stringCalc.add("5,-2");
        });

    }
    @Test
    public void StringCalculatorTest2() {

        assertTrue(
        });

    }


}