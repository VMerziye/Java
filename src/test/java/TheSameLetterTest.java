import org.testng.Assert;
import org.testng.annotations.Test;

public class TheSameLetterTest {

    /*if (!string.isEmpty())
     */
    @Test
    public void testStringIsEmpty_HappyPath() {
        //AAA
        //arrange
        String string = "";

        boolean expectedResult = false;

        //act
        boolean actualResult = new TheSameLetter().theSameLetter(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    /*the same at the beginning and at the end
     */

    @Test
    public void testTheSameLetter_HappyPath() {
        //AAA
        //arrange
        String string = "Abracadabra";

        boolean expectedResult = true;

        //act
        boolean actualResult = new TheSameLetter().theSameLetter(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    /*different letters at the beginning and at the end
     */
    @Test
    public void testTheDifferentLetters_HappyPath() {
        //AAA
        //arrange
        String string = "Whippersnapper";

        boolean expectedResult = false;

        //act
        boolean actualResult = new TheSameLetter().theSameLetter(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
