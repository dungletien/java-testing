import org.junit.Test;
import static org.junit.Assert.*;

public class TestProgramTest {

    @Test
    public void testSum() {
        TestProgram program = new TestProgram();
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        // Kiểm tra tổng
        assertEquals(15, sum);
    }

    @Test
    public void testValidInput() {
        TestProgram program = new TestProgram();
        // Kiểm tra số hợp lệ
        assertTrue(program.isValidInput(5));
        // Kiểm tra số không hợp lệ
        assertFalse(program.isValidInput(15));
    }

    @Test
    public void testSumGreaterThan10() {
        int sum = 15;
        // Kiểm tra nếu tổng lớn hơn 10
        assertTrue(sum > 10);
    }

    @Test
    public void testSumLessThanOrEqual10() {
        int sum = 5;
        // Kiểm tra nếu tổng không lớn hơn 10
        assertFalse(sum > 10);
    }
}
