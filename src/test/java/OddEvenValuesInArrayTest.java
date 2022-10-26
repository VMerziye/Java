import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {
    //if (intNumbers.length < 0)
    @Test
    public void testIntNumberLessThen0_HappyPath() {
        //AAA
        //arrange
        int [] array = {1};
        int expectedResult = 0;

        //act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //(if (intNumbers[i] % 2 == 0))
    @Test
    public void testIntNumberMultiply2_HappyPath() {
        //AAA
        //arrange
        int [] array = {1, 2, 3, 4, 5, 6};
        int expectedResult = 3;

        //act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testIntNumberMultiply2Negative_HappyPath() {
        //AAA
        //arrange
        int [] array = {-1, -2, -3, -4, -5, -6};
        int expectedResult = 3;

        //act
        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //if (intNumbers.length < 0)
    @Test
    public void testIntNumberLessThen011_HappyPath() {
        //AAA
        //arrange
        int [] array = {1};
        int expectedResult = 0;

        //act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //(if (intNumbers[i] % 2 != 0))
    @Test
    public void testIntNumberNotMultiply2_HappyPath() {
        //AAA
        //arrange
        int [] array = {1, 2, 3, 4, 5, 6};
        int expectedResult = 3;

        //act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testIntNumberNotMultiply2Negative_HappyPath() {
        //AAA
        //arrange
        int [] array = {-1, -2, -3, -4, -5, -6};
        int expectedResult = 3;

        //act
        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
