public class CountJava {

    /*6.Напишите метод countJava(), который принимает на вход текст и проверяет,
    /содержится ли в тексте хотя бы одно слово Java.
     */

    public boolean countJava(String str){
        if (!str.isEmpty()){
            if (str.contains("Java")){

                return true;
            }

            return false;

        }

        return false;
    }

}
