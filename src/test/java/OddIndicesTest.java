import org.testng.Assert;
import org.testng.annotations.Test;

public class OddIndicesTest {

    //if (array.length > 1)
    @Test
    public void testArrayLengthGreaterThen1_HappyPath() {
        //AAA
        //arrange
        int [] input = {-45, 590, 234, 985, 12, 68};

        int[] expectedResult = {590, 985, 68};

        //act
        int[] actualResult = new OddIndices().oddIndices(input);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    //if (array.length < 2)
    @Test
    public void testArrayLengthLessThen1_HappyPath() {
        //AAA
        //arrange
        int [] input = {};

        int[] expectedResult = {};

        //act
        int[] actualResult = new OddIndices().oddIndices(input);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
