import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodBadPoorNumbersTest {

    /*if((i % 7 == 0)&&(i % 9 == 0))
     */
    @Test
    public void testIMultiple7And9_HappyPath(){
        //AAA
        //arrange
        int number = 63;
        String expectedResult = "Good Number";

        //act
        String actualResult = new GoodBadPoorNumbers().goodBadPoorNumbers(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*if((i % 9 == 0)||(i % 7 != 0))
     */
    @Test
    public void testIMultiple9ButNot7_HappyPath(){
        //AAA
        //arrange
        int number = 72;
        String expectedResult = "Bad Number";

        //act
        String actualResult = new GoodBadPoorNumbers().goodBadPoorNumbers(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*if(i % 11 == 0)
     */
    @Test
    public void testIMultiple11_HappyPath(){
        //AAA
        //arrange
        int number = 22;
        String expectedResult = "Poor Number";

        //act
        String actualResult = new GoodBadPoorNumbers().goodBadPoorNumbers(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*if(i )
     */
    @Test
    public void testIMultiple_HappyPath(){
        //AAA
        //arrange
        int number = 17;
        String expectedResult = "-1";

        //act
        String actualResult = new GoodBadPoorNumbers().goodBadPoorNumbers(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
