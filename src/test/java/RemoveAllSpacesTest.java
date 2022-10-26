import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAllSpacesTest {
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

    @Test
    public void testRemoveAllSpaces_HappyPath(){
        //AAA
        //arrange
        String string = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";

        //Act
        String actualResult = new RemoveAllSpaces().removeAllSpaces(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllSpaces2_HappyPath(){
        //AAA
        //arrange
        String string = "p a     n   d a   ";
        String expectedResult = "panda";

        //Act
        String actualResult = new RemoveAllSpaces().removeAllSpaces(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
