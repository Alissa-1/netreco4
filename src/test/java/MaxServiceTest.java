import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {
    @Test
    public void shouldFindMax() {
        int a = 3;
        int b = 5;

        MaxService service = new MaxService();
        int expected = 10;
        int actual = service.max(a, b);
        Assertions.assertEquals(expected, actual);
    }
}
