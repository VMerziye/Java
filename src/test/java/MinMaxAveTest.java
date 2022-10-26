import org.testng.Assert;
import org.testng.annotations.Test;

public class MinMaxAveTest {

    @Test
    public void testArrayElementGreaterThanNumber(){
        //AAA
        //Arrange
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int numberA = 2;
        int numberB = 6;
        int [] expectedResult = {3, 7, 5};

        //act
        int [] actualResult = new MinMaxAve().minMaxAve(array, numberA, numberB);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}
