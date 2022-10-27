import org.testng.Assert;
import org.testng.annotations.Test;

public class InsertQuotesTest {

    @Test
    public void testInsertQuotes_HappyPath(){
        //AAA
        //Arrange

        String str = "Abracadabra";
        String exspectedResult = "\"Abracadabra\"";

        //act
        String actualResult = new InsertQuotes().insertQuotes(str);

        //Assert

        Assert.assertEquals(actualResult, exspectedResult);
    }

    @Test
    public void testInsertQuotes2_HappyPath(){
        //AAA
        //Arrange

        String str1 = "Федор Достоевский писал";
        String str2 = "Надо любить жизнь больше, чем смысл жизни.";

        String exspectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";

        //act
        String actualResult = new InsertQuotes().insertQuotes2(str1, str2);

        //Assert

        Assert.assertEquals(actualResult, exspectedResult);
    }
    @Test
    public void testInsertQuotes2a_HappyPath(){
        //AAA
        //Arrange

        String str1 = "Наполеон Бонапарт писал";
        String str2 = "В моем словаре нет слова «невозможно».";

        String exspectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова «невозможно».\"";

        //act
        String actualResult = new InsertQuotes().insertQuotes2(str1, str2);

        //Assert

        Assert.assertEquals(actualResult, exspectedResult);
    }
}
