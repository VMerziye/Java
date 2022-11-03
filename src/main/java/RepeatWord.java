import project_utils.Utils;

public class RepeatWord {

    /* Написать метод, который принимает на вход слово и число n,  и
    /возвращает строку, где слово повторяется n раз.
     */

    public String repeatWord(String str, int number){
        if (Utils.isNotNullAndNotEmpty(str)){
            if (number > 0){

                return str.repeat(number);
            }

        }

        return "Invalid data";
    }
}
