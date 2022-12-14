public class CreateArray {

    /*В голубой папке java создать класс CreateArray, написать в этом классе метод createIntArray(),
     /который принимает на вход 5 целых чисел,  и возвращает массив из этих же чисел.
     */

    public int[] createIntArray(int a, int b, int c, int d, int e){

        return new int[]{a, b, c, d, e};

    }

    /*Написать метод createDoubleArray(), который принимает на вход 5 чисел типа double,
     /и возвращает массив из этих же чисел
     /Например, createDoubleArray(1.1, 2.5, 3.7, 4.0, 5.5) -> {1.1, 2.5, 3.7, 4.0, 5.5}
     */

    public double[] createDoubleArray(double a, double b, double c, double d, double e){

        return new double[]{a, b, c, d, e};
    }

     /*Написать метод createStringArray(), который принимает на вход 5 слов, и
      /возвращает массив из этих слов
      /Например, createStringArray(“It”, “was”, “an”, “apple”, “pie”) ->
      /{“It”, “was”, “an”, “apple”, “pie”}
      */

    public String[] createStringArray(String a, String b, String c, String d, String e){

        return new String[]{a, b, c, d, e};
    }

    /*4я задача только для тех, кто хочет разобраться с методом класса String split()
    /Написать метод createArrayFromText(), который принимает на вход предложение
    /из нескольких слов и возвращает массив из этих слов.
    /Например, createArrayFromText(“It was an apple pie”) -> {“It”, “was”, “an”, “apple”, “pie”}
     */

    public String[] createArrayFromText(String a) {

        return a.split(" ");

    }


}
