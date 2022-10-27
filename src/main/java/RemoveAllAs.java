public class RemoveAllAs {

    /*2.Написать алгоритм removeAllAs().
    /С помощью методов из видео1,  написать алгоритм, который
    /принимает на вход строку. Если строка валидная, то метод удаляет все
    /буквы a из строки, если таковые имеются. Метод возвращает обработанную строку.
     */

    public String removeAllAs(String str){
        String newStr = str.trim();
        if (!str.isEmpty()){

            return newStr.replace("a", "");
        }

        return "Строка пустая";
    }
}
