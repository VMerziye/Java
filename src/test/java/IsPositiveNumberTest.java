import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    /*if (a >0)
     */

    @Test
    public void testAGreaterThenZero(){
        //AAA
        //arrange
        int number = 555;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*if (a == 0)
     */
    @Test
    public void testAEqualsZero(){
        //AAA
        //arrange
        int number = 0;
        boolean expectedResult = true;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*if (a == 0)
     */
    @Test
    public void testALessThenZero(){
        //AAA
        //arrange
        int number = -555;
        boolean expectedResult = false;

        //act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
