public class FixNames {

    /*Напишите метод, кторый принимает на вход название города и исправляет написание:
     */

    public String fixNames(String str){
        if (!str.isEmpty()){
            String firstLetter = str.substring(0, 1).toUpperCase();
            String remainder = str.substring(1).toLowerCase();

            return firstLetter + remainder;
        }

        return "String is Empty";
    }
}
