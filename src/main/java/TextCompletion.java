public class TextCompletion {

    /*Написать метод, который принимает на вход предложение, которое состоит из имени,
    фамилии, отчества и возвращает текст:
     Test Data:
     “Александр Сергеевич Пушкин” →
     “Имя: Александр
     Отчество: Сергеевич
     Фамилия: Пушкин”
     */

//    public String textCompletion(String str){
//        if (!str.isEmpty()){
//            int spaceIndex = str.indexOf(" ");
//            int lastSpaceIndex = str.lastIndexOf(" ");

    //            return "Имя: "+str.substring(0,spaceIndex) + "\n"
//                    + "Отчество:"+ str.substring(spaceIndex, lastSpaceIndex) + "\n"
//                    + "Фамилия:" + str.substring(lastSpaceIndex, str.length());
//
//        }
//
//        return "String is empty";
//    }
    public String textCompletion(String str) {
        if (!str.isEmpty()) {
            String[] newStr = str.split(" ");

            return "Имя: " + newStr[0] + "\n"
                    + "Отчество: " + newStr[1] + "\n"
                    + "Фамилия: " + newStr[2];


        }

        return "String is empty";
    }
}
