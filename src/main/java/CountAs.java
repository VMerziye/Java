public class CountAs {

    /*5.Напишите метод countAs(), который принимает на вход строку и
     /считает, сколько букв а или А содержится в строке. Метод возвращает
     /количество букв a/A,  и количество букв/знаков в слове без букв a/A.
     /Итоговый результат должен строится с помощью метода из видео 2.
     */

    public String countAs(String str){
        int countA = 0;
        int l= str.length();
        if (str != null){
            if (!str.isEmpty()){
                str = str.toLowerCase();
                for (int i = 0; i < str.length(); i++){
                    if (str.charAt(i)== 'a'){
                        countA++;
                    }

                }
                int countRemainder= l - countA;

                return "".concat(String.valueOf(countA)).concat(",").concat(String.valueOf(countRemainder));

            }

        }


        return "String is Empty";

    }
}
