public class BetweenParameterLetter {

    /*Напишите метод, который принимает на вход строку и букву-параметр,
     /и возвращает все, что находится между первой и последней буквой-параметром:
     */


    public String betweenParameterLetter(String str, String letter){
        if (!str.isEmpty()&& !letter.isEmpty()){
            if (str.contains(letter)){
                int firstIndex = str.indexOf(letter);
                int lastIndex = str.lastIndexOf(letter);

                return str.substring(firstIndex, lastIndex + 1);
            }

            return "Parameter letter not contained in string";
        }

        return "String is empty";
    }
}
