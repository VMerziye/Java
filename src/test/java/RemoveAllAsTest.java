import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAllAsTest {
    /*if (!string.isEmpty())
     */
    @Test
    public void testStringIsEmpty_HappyPath() {
        //AAA
        //arrange
        String str = "";

        String expectedResult = "Строка пустая";

        //act
        String actualResult = new RemoveAllAs().removeAllAs(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testRemoveAllAs_HappyPath() {
        //AAA
        //arrange
        String str = "taramasalata";

        String expectedResult = "trmslt";

        //act
        String actualResult = new RemoveAllAs().removeAllAs(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testRemoveAllAsAndSpase_HappyPath() {
        //AAA
        //arrange
        String str = "panda   ";

        String expectedResult = "pnd";

        //act
        String actualResult = new RemoveAllAs().removeAllAs(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testRemoveAllSpase_HappyPath() {
        //AAA
        //arrange
        String str = "    Red Rover School   ";

        String expectedResult = "Red Rover School";

        //act
        String actualResult = new RemoveAllAs().removeAllAs(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}


