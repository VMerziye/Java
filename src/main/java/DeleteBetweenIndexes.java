public class DeleteBetweenIndexes {

    /*13.Написать метод, который принимает строку, и 2 индекса. Метод удаляет все,
     что находится между двумя индексами включительно
     */

    public String deleteBetweenIndexes(String str, int a, int b){
        if (!str.isEmpty()){
            if ((a >= 0)&&(a < b)){
                return str.substring(0, a) + str.substring(b + 1, str.length());
            }

            return "invalid data";

        }

        return "String is empty";
    }


}
