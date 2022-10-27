import org.testng.Assert;
import org.testng.annotations.Test;

public class CountJavaTest {

    /*if (!string.isEmpty())
     */
    @Test
    public void testStringIsEmpty_HappyPath() {
        //AAA
        //arrange
        String string = "";

        boolean expectedResult = false;

        //act
        boolean actualResult = new CountJava().countJava(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public void testStringContainsJava_HappyPath() {
        //AAA
        //arrange
        String string = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 "
                + "are the current long-term support (LTS) versions. Oracle released the last zero-cost "
                + "public update for the legacy version Java 8 LTS in January 2019 for commercial use, "
                + "although it will otherwise still support Java 8 with public updates for personal "
                + "use indefinitely. Other vendors have begun to offer "
                + "zero-cost builds of OpenJDK 8 and 11 that are still receiving security and "
                + "other upgrades";

        boolean expectedResult = true;

        //act
        boolean actualResult = new CountJava().countJava(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringDoesNotContainsJava_HappyPath() {
        //AAA
        //arrange
        String string = "99 little bugs in a code.\n"
                + "99 little bugs in a code.\n"
                + "Take one down, and patch it around.\n"
                + "235 critical bugs in the code.";

        boolean expectedResult = false;

        //act
        boolean actualResult = new CountJava().countJava(string);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
