public class RemoveAllZeros {

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
