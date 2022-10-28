import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnLastWordTest {

    /*if (!string.isEmpty())
     */
    @Test
    public void testStringIsEmpty_HappyPath() {
        //AAA
        //arrange
        String string = "";

        String expectedResult = "String is empty";

        //act
        String actualResult = new ReturnLastWord().returnLastWord(string) ;

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReturnLastWord_HappyPath() {
        //AAA
        //arrange
        String string = "Red Rover";

        String expectedResult = "Rover";

        //act
        String actualResult = new ReturnLastWord().returnLastWord(string) ;

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
