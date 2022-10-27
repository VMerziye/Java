public class InsertQuotes {

    /*7.Напишите метод insertQuotes(), который принимает слово и возвращает строку,
     /в которой это слово “обернуто” в кавычки:
     */
    public String insertQuotes(String str){

        return "\"" + str.concat("\"");
    }

}
