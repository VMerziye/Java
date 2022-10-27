import org.testng.Assert;
import org.testng.annotations.Test;

public class BetweenParameterLetterTest {

    /*if (!string.isEmpty())
     */
    @Test
    public void testStringIsEmpty_HappyPath() {
        //AAA
        //arrange
        String string = "";
        String letter = "";

        String expectedResult = "String is Empty";

        //act
        String actualResult = new BetweenParameterLetter().betweenParameterLetter(string, letter);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testLetterNotContainedInString_HappyPath() {
        //AAA
        //arrange
        String string = "Abracadabra";
        String letter = "n";

        String expectedResult = "Parameter letter not contained in string";

        //act
        String actualResult = new BetweenParameterLetter().betweenParameterLetter(string, letter);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }



    @Test
    public void testReternBetweenLetter_HappyPath() {
        //AAA
        //arrange
        String string = "Abracadabra";
        String letter = "b";

        String expectedResult = "bracadab";

        //act
        String actualResult = new BetweenParameterLetter().betweenParameterLetter(string, letter);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReternBetweenLetterP_HappyPath() {
        //AAA
        //arrange
        String string = "Whippersnapper";
        String letter = "p";

        String expectedResult = "ppersnapp";

        //act
        String actualResult = new BetweenParameterLetter().betweenParameterLetter(string, letter);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
