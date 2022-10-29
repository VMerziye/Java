import org.testng.Assert;
import org.testng.annotations.Test;

public class TextCompletionTest {
    /*if (!string.isEmpty())
     */
    @Test
    public void testStringIsEmpty_HappyPath() {
        //AAA
        //arrange
        String string = "";

        String expectedResult = "String is empty";

        //act
        String actualResult = new TextCompletion().textCompletion(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void test_HappyPath() {
        //AAA
        //arrange
        String string = "Александр Сергеевич Пушкин";

        String expectedResult = "Имя: Александр\n"
                + "Отчество: Сергеевич\n"
                + "Фамилия: Пушкин";

        //act
        String actualResult = new TextCompletion().textCompletion(string) ;

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
