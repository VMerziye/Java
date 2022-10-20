import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    //if (number % 2 == 0)
    @Test
    public void testNumberIsDivisibleBy2_HappyPat() {
        //AAA
        //arrange
        int number = 222222;
        String expectedResult = "even";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //if (number % 2 != 0)
    @Test
    public void testNumberIsNotDivisibleBy2_HappyPat() {
        //AAA
        //arrange
        int number = 1;
        String expectedResult = "odd";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //if (number % 2 != 0 && number < 0)
    @Test
    public void testNumberIsLessThen0AndIsDivisibleBy2_HappyPat() {
        //AAA
        //arrange
        int number = -345;
        String expectedResult = "even";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //if (number % 2 != 0 && number < 0)
    @Test
    public void testNumberIsLessThen0AndIsNotDivisibleBy2_HappyPat() {
        //AAA
        //arrange
        int number = -5;
        String expectedResult = "odd";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //if (number = 0)
    @Test
    public void testNumberEqualsZero_HappyPath() {
        //AAA
        //arrange
        int number = -5;
        String expectedResult = "odd";

        //act
        String actualResult = new OddEven().oddEven(number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
