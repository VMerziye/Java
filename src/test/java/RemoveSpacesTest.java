import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveSpacesTest {
/*if (!string.isEmpty())
 */
    @Test
    public void testStringIsEmpty_HappyPath() {
        //AAA
        //arrange
        String string = "";

        String expectedResult = "Строка пустая";

        //act
        String actualResult = new RemoveSpaces().removeSpaces(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*if (string.equals(string.trim())
     */
    @Test
    public void testStringEqualsNewString(){
        //AAA
        //arrange
        String string = "    Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";

        //Act
        String actualResult = new RemoveSpaces().removeSpaces(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringIsNotEqualsNewString(){
        //AAA
        //arrange
        String string = "Red Rover School";
        String expectedResult = "Пробелов не было";

        //Act
        String actualResult = new RemoveSpaces().removeSpaces(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
