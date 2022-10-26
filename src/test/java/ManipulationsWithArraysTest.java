import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {
    /*5
     */
    @Test
    public void multiplationsArrayByNumber_HappyPath(){
        //AAA
        //arrange
        int number = 3;
        int [] array = {1, 2, 3, 4, 5};
        int [] expectedResult = {3, 6, 9, 12, 15};

        //act
        int [] actualResult = new ManipulationsWithArrays().manipulationsArrayByNumber(array, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void multiplationsArrayByOddNumber_HappyPath(){
        //AAA
        //arrange
        int number = -3;
        int [] array = {1, 2, 3, 4, 5};
        int [] expectedResult = {-3, -6, -9, -12, -15};

        //act
        int [] actualResult = new ManipulationsWithArrays().manipulationsArrayByNumber(array, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*if (array.length < 1)
     */

    @Test
    public void manipulationsArrayLenghtLessThen1_HappyPath(){
        //AAA
        //arrange
        int number = 3;
        int [] array = {1};
        int [] expectedResult = {};

        //act
        int [] actualResult = new ManipulationsWithArrays().manipulationsArrayByNumber(array, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*6
     */
    @Test
    public void manipulationsIntToDouble_HappyPath(){
        //AAA
        //arrange
        int [] array = {1, 2, 3, 4, 5};
        double [] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        //act
        double [] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*7
     */
    @Test
    public void manipulationsDoubleToInt_HappyPath(){
        //AAA
        //arrange
        double [] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        int [] expectedResult = {1, 2, 3, 4, 5};

        //act
        int [] actualResult = new ManipulationsWithArrays().toIntArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*8
     */
    @Test
    public void manipulationsIntToString_HappyPath(){
        //AAA
        //arrange
        int [] array = {1, 2, 3, 4, 5};
        String [] expectedResult = {" 1"," 2", " 3", " 4", " 5"};

        //act
        String [] actualResult = new ManipulationsWithArrays().toStringArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*8
     */
    @Test
    public void manipulationsDoubleToString_HappyPath(){
        //AAA
        //arrange
        double [] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        String [] expectedResult = {" 1.1"," 2.5", " 3.7", " 4.0", " 5.5"};

        //act
        String [] actualResult = new ManipulationsWithArrays().doubleToStringArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*9
     */
    /*if (array[i] < number)
     */
    @Test
    public void testArrayElementLessThanNumber(){
        //AAA
        //Arrange
        int [] array = {1, 2, 3, 4, 5};
        int number = 4;
        boolean expectedResult = false;

        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
    /*if (array[i] < number)
     */
    @Test
    public void testArrayElementGreaterThanNumber(){
        //AAA
        //Arrange
        int [] array = {1, 2, 3, 4, 5};
        int number = 0;
        boolean expectedResult = true;

        //act
        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


}
