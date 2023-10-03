import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckTextTest {
    private CheckText checkTextfirst = new CheckText();

    @Test
    public void areTextFilesEqualTest(){
        Assertions.assertTrue(checkTextfirst.areTextFilesEqual("test1.txt", "test2.txt"));
    }
    @Test
    public void invertFile1Test(){
        Assertions.assertEquals(true, checkTextfirst.invertFile1("test1.txt"));
    }
}
