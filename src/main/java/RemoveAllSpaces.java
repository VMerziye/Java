public class RemoveAllSpaces {

    public String removeAllSpaces(String str) {
        if (!str.isEmpty()) {

            return str.replace(" ", "");
        }

        return "Строка пустая";
    }

}
