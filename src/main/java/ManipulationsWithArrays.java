public class ManipulationsWithArrays {

    /*5.Написать метод multiplуArrayByNumber(), который принимает на вход массив
     /целых чисел и число int number. Метод возвращает массив тех же чисел,
     /умноженных на number Например, multiplуArrayByNumber()({1, 2, 3, 4, 5}, 3) -> {3, 6, 9, 12, 15}
     */

    public int[] manipulationsArrayByNumber(int [] array, int number){
        if (array.length > 0) {
            int[] arrayByNumber = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayByNumber[i] = array[i] * number;
            }

            return arrayByNumber;
        }

        return new int [0];
    }

    /*6.Написать метод toDoubleArray(), который принимает на вход массив целых чисел,
     /и возвращает массив типа double[] из тех же чисел
     /Например, toDoubleArray({1, 2, 3, 4, 5}) -> {1.0, 2.0, 3.0, 4.0, 5.0}
     */

    public double[] toDoubleArray(int [] array){
        if (array.length > 0) {
            double[] toDouble = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                toDouble[i] = (double) array[i];
            }

            return toDouble;
        }

        return new double[0];
    }

    /*7.Написать метод toIntArray(), который принимает на вход массив типа double[],
     /и возвращает массив типа int[] из тех же чисел
     /Например, toIntArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {1, 2, 3, 4, 5}
     */

    public int[] toIntArray(double [] array){
        if (array.length > 0) {
            int[] toIntArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                toIntArray[i] = (int)array[i];
            }

            return toIntArray;
        }

        return new int[0];
    }

    /*8.Написать метод toStringArray(), который принимает на вход массив целых чисел,
     /и возвращает массив типа String[] из тех же чисел (желательно не использовать метод
     /.toString(), нужно переводить вручную)
     /Например, toStringArray({1, 2, 3, 4, 5}) -> {“1”, “2”, “3”, “4”, “5”}
     */

    public String[] toStringArray(int [] array){
        if (array.length > 0) {
            String[] toStringArray = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                toStringArray[i] = " " + array[i];
            }

            return toStringArray;
        }

        return new String[0];
    }

    /*9.Перегрузить метод toStringArray() параметром double[]. Этот
     /метод должен возвращать массив типа String[] (желательно не использовать метод .
     /toString(), нужно переводить вручную)
     /Например, toStringArray({1.1, 2.5, 3.7, 4.0, 5.5}) -> {“1.1”, “2.5”, “3.7”, “4.0”, “5.5”}
     */

    public String[] doubleToStringArray(double [] array){
        if (array.length > 0) {
            String[] toStringArray = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                toStringArray[i] = " " + array[i];
            }

            return toStringArray;
        }

        return new String[0];
    }

    /* 12.В классе ManipulationsWithArrays написать метод areValuesGreaterThanNumber(),
     /который принимает на вход массив целых чисел и число number. Метод возвращает
     /значение true, если все элементы массива больше number, иначе возвращает false
     */

    public boolean areValuesGreaterThanNumber(int [] array, int number){
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++){
                if (array[i] <= number){

                    return false;
                }
            }

            return true;

        }

        return false;
    }

}
