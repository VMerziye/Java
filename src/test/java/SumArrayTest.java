import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    @Test
    public void testSumArrayEven_HappyPat() {
        //AAA
        //arrange
        int [] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        //act
        int actualResult = new SumArray().sumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSumArrayOdd_HappyPat() {
        //AAA
        //arrange
        int [] array = {-7, -3};
        int expectedResult = -10;

        //act
        int actualResult = new SumArray().sumArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
