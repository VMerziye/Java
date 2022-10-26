public class RemoveSpaces {

    public String removeSpaces(String str){
        String newStr = str.trim();
        if (!str.isEmpty()){
            if (str.equals(newStr)){

                return "Пробелов не было";
            }

                return "Лишние пробелы удалены";

        }

        return "Строка пустая";
    }

}
