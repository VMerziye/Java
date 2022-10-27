import org.testng.Assert;
import org.testng.annotations.Test;

public class CountAsTest {
    /*if (!string.isEmpty())
     */
    @Test
    public void testStringIsEmpty_HappyPath() {
        //AAA
        //arrange
        String string = "";

        String expectedResult = "String is Empty";

        //act
        String actualResult = new CountAs().countAs(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCountAsAndRemindersOneWord_HappyPath() {
        //AAA
        //arrange
        String string = "Abracadabra";

        String expectedResult = "5,6";

        //act
        String actualResult = new CountAs().countAs(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testCountAsAndRemindersWithoutAs_HappyPath() {
        //AAA
        //arrange
        String string = "Homenum Revelio";

        String expectedResult = "0,15";

        //act
        String actualResult = new CountAs().countAs(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAsAndRemindersWithSpaceAndNumber_HappyPath() {
        //AAA
        //arrange
        String string = "3 tarAmasAlatA";

        String expectedResult = "6,8";

        //act
        String actualResult = new CountAs().countAs(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
