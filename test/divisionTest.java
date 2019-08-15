import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class divisionTest {

    @Test
    @DisplayName("division")
    public void division1and0() {
        int expected = 0;
        double result;
        try {
            result = Division.division(1, 0);
        }catch (ArithmeticException e){
            result = 0;
        }
        assertEquals(expected, result);
    }
}
