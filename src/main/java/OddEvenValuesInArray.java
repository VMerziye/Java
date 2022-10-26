public class OddEvenValuesInArray {

    /*Написать метод countEvenValuesInArray(), который принимает на
     /вход массив целых чисел,  и возвращает количество четных чисел в этом массиве
     */

    public int countEvenValuesInArray(int[] intNumbers) {
        int count = 0;
        if (intNumbers.length > 1) {
            for (int i = 0; i < intNumbers.length; i++) {
                if (intNumbers[i] % 2 == 0) {
                    count++;
                }
            }

            return count;
        }

        return 0;
    }
    /* Написать метод countOddValuesInArray(), который принимает на
     /вход массив целых чисел,  и возвращает количество нечетных чисел в этом массиве
     */

    public int countOddValuesInArray(int[] intNumbers) {
        int count = 0;
        if (intNumbers.length > 1) {
            for (int i = 0; i < intNumbers.length; i++) {
                if (intNumbers[i] % 2 != 0) {
                    count++;
                }
            }

            return count;
        }

        return 0;
    }

}
