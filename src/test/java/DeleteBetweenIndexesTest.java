import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteBetweenIndexesTest {
    /*if (!string.isEmpty())
     */
    @Test
    public void testStringIsEmpty_HappyPath() {
        //AAA
        //arrange
        String string = "";
        int a = 1;
        int b =3;

        String expectedResult = "String is Empty";

        //act
        String actualResult = new DeleteBetweenIndexes().deleteBetweenIndexes(string, a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    /*if (a < b))
     */
    @Test
    public void testIfAGreaterThenB_HappyPath() {
        //AAA
        //arrange
        String string = "Red rover";
        int a = 4;
        int b = 1;

        String expectedResult = "invalid data";

        //act
        String actualResult = new DeleteBetweenIndexes().deleteBetweenIndexes(string, a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    /*if(a >= 0)
     */
    @Test
    public void testIfALessThen0_HappyPath() {
        //AAA
        //arrange
        String string = "Red rover";
        int a = -4;
        int b = 1;

        String expectedResult = "invalid data";

        //act
        String actualResult = new DeleteBetweenIndexes().deleteBetweenIndexes(string, a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }



    @Test
    public void testDeleteBetweenIndexes_HappyPath() {
        //AAA
        //arrange
        String string = "Red rover";
        int a = 1;
        int b =4;

        String expectedResult = "Rover";

        //act
        String actualResult = new DeleteBetweenIndexes().deleteBetweenIndexes(string, a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
