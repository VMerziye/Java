public class ReturnLastWord {

    /*12.Напишите метод, который принимает на вход строку из двух слов,
    /разделенных пробелом, и возвращает последнее слово
     */

    public String returnLastWord(String str){
        if (!str.isEmpty()){
            int index = str.indexOf(" ");

            return str.substring(index + 1);
        }

        return "String is empty";
    }
}
