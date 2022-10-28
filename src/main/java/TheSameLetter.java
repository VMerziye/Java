public class TheSameLetter {

    /*11.Напишите метод, который принимает на вход слово, и возвращает true,
    /если слово начинается и заканчивается на одинаковую букву, и false иначе
     */

    public boolean theSameLetter(String str){
        if (!str.isEmpty()){
            str = str.toLowerCase();
            return str.charAt(0) == str.charAt(str.length() - 1);
        }

        return false;
    }
}
