import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveAllZerosTest {

    /*if (!string.isEmpty())
     */
    @Test
    public void testStringIsEmpty_HappyPath() {
        //AAA
        //arrange
        String string = "";

        String expectedResult = "Строка пустая";

        //act
        String actualResult = new RemoveAllZeros().removeAllZeros(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*if (st.equals(newStr)
     */
    @Test
    public void testStringDoesNotHaveZero_HappyPath(){
        //AAA
        //arrange
        String string = "35429764";
        String expectedResult = "This is a valid string";

        //Act
        String actualResult = new RemoveAllZeros().removeAllZeros(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    /*if (!str.equals(newStr)
     */
    @Test
    public void testRemoveAllZerro_HappyPath(){
        //AAA
        //arrange
        String string = "3504209706040000";
        String expectedResult = "35429764";

        //Act
        String actualResult = new RemoveAllZeros().removeAllZeros(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    /*if (!str.equals(newStr)
    */
    @Test
    public void testRemoveAllZerro2_HappyPath(){
        //AAA
        //arrange
        String string = "0000000111";
        String expectedResult = "111";

        //Act
        String actualResult = new RemoveAllZeros().removeAllZeros(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
