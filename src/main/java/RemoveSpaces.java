public class RemoveSpaces {

    public String removeSpaces(String str){
        String newString = str.trim();
        if (!str.isEmpty()){
            if (str.equals(newString)){

                return "Пробелов не было";
            }

                return "Лишние пробелы удалены";

        }

        return "Строка пустая";
    }

}
