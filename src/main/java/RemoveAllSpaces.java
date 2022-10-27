public class RemoveAllSpaces {

    /*4. Написать алгоритм removeAllSpaces.
    /С помощью методов из видео1,  написать алгоритм, который
    /принимает на вход строку. Если строка валидная, то метод удаляет
    /все пробелы из строки, если таковые имеются. Метод возвращает обработанную строку.
     */

    public String removeAllSpaces(String str) {
        if (!str.isEmpty()) {

            return str.replace(" ", "");
        }

        return "Строка пустая";
    }

}
