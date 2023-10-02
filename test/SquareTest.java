import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    private Square square = new Square(5);

    @Test
    public void calculateDiameterTest(){
        Assertions.assertEquals(20, square.calculateDiameter());
    }
    @Test
    public void calculateAreaTest(){
        Assertions.assertEquals(25, square.calculateArea());
    }
}
