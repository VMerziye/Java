import project_utils.Utils;

public class InsertQuotes {

    /*7.Напишите метод insertQuotes(), который принимает слово и возвращает строку,
     /в которой это слово “обернуто” в кавычки:
     */
    public String insertQuotes(String str) {
        if (Utils.isNotNullAndNotEmpty(str)) {

            return "\"" + str.concat("\"");
        }

        return "String is empty";
    }




    /* 8.Напишите метод insertQuotes(), который принимает на вход две строки,
    /и добавляет знак :  после слова “писал”,  и оборачивает в кавычки вторую строку
    /(результат строится с помощью метода concat())
     */

    public String insertQuotes2(String str1, String str2){
        if (!str1.trim().isEmpty()||!str2.trim().isEmpty()){

            return str1.concat(": \"") + str2.concat("\"");
        }

        return "String is Empty";
    }

}
