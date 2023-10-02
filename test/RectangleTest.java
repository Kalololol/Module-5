import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    private Rectangle rectangle = new Rectangle(4,3);



    @Test
    public void TriangleCalculateAreaTest(){
        Assertions.assertEquals(12, rectangle.calculateArea());
    }
}
