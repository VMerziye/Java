import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    /*if(a >= b)
     */
    @Test
    public void testAGreaterThenB_HappyPat() {
        //AAA
        //arrange
        int a = 9999;
        int b = 3333;
        int expectedResult = a;

        //act
        int actualResult = new BiggerValue().biggerValue( a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*  if (a< b)
     */

    @Test
    public void testALessThenB_HappyPat() {
        //AAA
        //arrange
        int a = 3333;
        int b = 9999;
        int expectedResult = b;

        //act
        int actualResult = new BiggerValue().biggerValue( a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
