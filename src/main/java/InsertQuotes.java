public class InsertQuotes {

    /*7.Напишите метод insertQuotes(), который принимает слово и возвращает строку,
     /в которой это слово “обернуто” в кавычки:
     */
    public String insertQuotes(String str){
        if (!str.isEmpty()){

            return "\"" + str.concat("\"");
        }

        return "String is Empty";
    }

    /* 8.Напишите метод insertQuotes(), который принимает на вход две строки,
    /и добавляет знак :  после слова “писал”,  и оборачивает в кавычки вторую строку
    /(результат строится с помощью метода concat())
     */

    public String insertQuotes2(String str1, String str2){
        if (!str1.isEmpty()||!str2.isEmpty()){

            return str1.concat(": \"") + str2.concat("\"");
        }

        return "String is Empty";
    }

}
