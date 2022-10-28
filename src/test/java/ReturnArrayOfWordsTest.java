import org.testng.Assert;
import org.testng.annotations.Test;

public class ReturnArrayOfWordsTest {

    /*if (!string.isEmpty())
     */
    @Test
    public void testStringIsEmpty_HappyPath() {
        //AAA
        //arrange
        String string = "";

        String [] expectedResult = {};

        //act
        String [] actualResult = new ReturnArrayOfWords().returnArrayOfWords(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testReturnArrayOfWords_HappyPath() {
        //AAA
        //arrange
        String string = "QA for Everyone";

        String [] expectedResult = {"QA", "for", "Everyone"};

        //act
        String [] actualResult = new ReturnArrayOfWords().returnArrayOfWords(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testReturnArrayOfWords2_HappyPath() {
        //AAA
        //arrange
        String string = "Александр Сергеевич Пушкин";

        String [] expectedResult = {"Александр", "Сергеевич", "Пушкин"};

        //act
        String [] actualResult = new ReturnArrayOfWords().returnArrayOfWords(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }



}
