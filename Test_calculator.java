import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        assertEquals("5", Calculator.Run("2+3"));
    }

    @Test
    public void testSubtraction() {
        assertEquals("3", Calculator.Run("5-2"));
    }

    @Test
    public void testMultiplication() {
        assertEquals("24", Calculator.Run("4*6"));
    }

    @Test
    public void testDivision() {
        assertEquals("4", Calculator.Run("8/2"));
    }

    @Test
    public void testComplexExpression() {
        assertEquals("14", Calculator.Run("2+3*4-8/2"));
    }

    @Test
    public void testErrorHandling() {
        assertEquals("ERROR", Calculator.Run("5/0"));
        assertEquals("ERROR", Calculator.Run("abc+3"));
    }
}
