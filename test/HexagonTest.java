import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HexagonTest {

    private Hexagon hexagon = new Hexagon(2);


    @Test
    public void HexagonCalculateAreaTest() {
        Assertions.assertEquals(24, hexagon.calculateArea());
    }

}
