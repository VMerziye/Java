import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    /*if(a > b)
     */
    @Test
    public void testAGreaterThenB_HappyPat() {
        //AAA
        //arrange
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*if(a < b)
     */
    @Test
    public void testALessThenB_HappyPat() {
        //AAA
        //arrange
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    /*if(a > b)
     */
    @Test
    public void testAEqualB_HappyPat() {
        //AAA
        //arrange
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        //act
        int actualResult = new AreNumbersEqual().areNumbersEqual(a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
