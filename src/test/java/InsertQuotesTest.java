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
}
