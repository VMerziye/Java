public class RemoveAllZeros {

    /*3.Написать алгоритм removeAllZeros().
    /С помощью методов из видео1,  написать алгоритм, который
    /принимает на вход строку, состоящую из цифр. Если строка валидная,
    /то метод удаляет все пробелы из строки, если таковые имеются. Метод
    /возвращает обработанную строку, в которой нет нулей. Если в строке не
    /было нулей, метод возвращает сообщение “This is a valid string”.
     */

    public String removeAllZeros(String str){
        String newStr = str.replace("0", "");
        if (!str.isEmpty()){
            if (!str.equals(newStr)){

                return str.replace("0", "");
            }

            return "This is a valid string";
        }

        return "Строка пустая";
    }
}
