import org.testng.Assert;
import org.testng.annotations.Test;

public class RepeatWordTest {
    /*if (!string.isEmpty())
     */
    @Test
    public void testStringIsEmpty_HappyPath() {
        //AAA
        //arrange
        String string = "";
        int number = 0;

        String expectedResult = "Invalid data";

        //act
        String actualResult = new RepeatWord().repeatWord(string, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    // number>0
    @Test
    public void testNumberGreaterZero_HappyPath() {
        //AAA
        //arrange
        String string = "one";
        int number = 5;

        String expectedResult = "oneoneoneoneone";

        //act
        String actualResult = new RepeatWord().repeatWord(string, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
