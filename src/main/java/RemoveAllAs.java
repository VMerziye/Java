public class RemoveAllAs {

    public String removeAllAs(String str){
        String newStr = str.trim();
        if (!str.isEmpty()){

            return newStr.replace("a", "");
        }

        return "Строка пустая";
    }
}
