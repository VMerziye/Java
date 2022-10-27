import org.testng.Assert;
import org.testng.annotations.Test;

public class FixNamesTest {

    /*if (!string.isEmpty())
     */
    @Test
    public void testStringIsEmpty_HappyPath() {
        //AAA
        //arrange
        String string = "";

        String expectedResult = "String is Empty";

        //act
        String actualResult = new FixNames().fixNames(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testUpperFirstLetter_HappyPath() {
        //AAA
        //arrange
        String string = "ташкент";

        String expectedResult = "Ташкент";

        //act
        String actualResult = new FixNames().fixNames(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testLowRemainder_HappyPath() {
        //AAA
        //arrange
        String string = "ЧикаГО";

        String expectedResult = "Чикаго";

        //act
        String actualResult = new FixNames().fixNames(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
