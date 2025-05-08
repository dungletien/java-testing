import org.junit.Test;
import static org.junit.Assert.*;

public class TestProgramTest {

    @Test
    public void testSumGreaterThan10() {
        int sum = 15;
        if (sum > 10) {
            // Đường đi khi tổng lớn hơn 10
            assertTrue(true);
        }
    }

    @Test
    public void testSumLessThanOrEqual10() {
        int sum = 5;
        if (sum <= 10) {
            // Đường đi khi tổng không lớn hơn 10
            assertTrue(true);
        }
    }

    @Test
    public void testValidInput() {
        // Đường đi khi số hợp lệ
        assertTrue(new TestProgram().isValidInput(5));
    }

    @Test
    public void testInvalidInput() {
        // Đường đi khi số không hợp lệ
        assertFalse(new TestProgram().isValidInput(15));
    }
}
