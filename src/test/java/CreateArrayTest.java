import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    @Test
    public void testReturnIntArray_HappyPath() {
        //AAA
        //arrange
        int numberA = 1;
        int numberB = 2;
        int numberC = 3;
        int numberD = 4;
        int numberE = 5;

        int [] expectedResult = {1, 2, 3, 4, 5};

        //act
        int [] actualResult = new CreateArray().createIntArray(numberA, numberB,numberC, numberD, numberE);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReturnDoubleArray_HappyPath() {
        //AAA
        //arrange
        double doubleA = 1.1;
        double doubleB = 2.5;
        double doubleC = 3.7;
        double doubleD = 4.0;
        double doubleE = 5.5;

        double [] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

        //act
        double [] actualResult = new CreateArray().createDoubleArray(doubleA, doubleB, doubleC, doubleD, doubleE);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testReturnStringArray_HappyPath() {
        //AAA
        //arrange
        String stringA = "It";
        String stringB = "was";
        String stringC = "an";
        String stringD = "apple";
        String stringE = "pie";

        String [] expectedResult = {"It", "was", "an", "apple", "pie"};

        //act
        String [] actualResult = new CreateArray().createStringArray(stringA, stringB, stringC, stringD, stringE);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testReturnArrayFromText_HappyPath() {
        //AAA
        //arrange
        String stringA = "It was an apple pie";

        String [] expectedResult = {"It", "was", "an", "apple", "pie"};

        //act
        String [] actualResult = new CreateArray().createArrayFromText(stringA);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
