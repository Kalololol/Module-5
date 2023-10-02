import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    private Triangle triangle = new Triangle(4,3);

    @Test
    public void TriangleCalculateAreaTest(){
        Assertions.assertEquals(6, triangle.calculateArea());
    }
}
