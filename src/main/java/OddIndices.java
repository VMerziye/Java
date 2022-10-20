public class OddIndices {
    /*Написать алгоритм OddIndices, который принимает массив целых чисел,
     /и возвращает массив значений нечетных индексов
     */

    public int[] oddIndices(int[] array) {
        if (array.length > 1) {
            int[] arrayOddIndices = new int[array.length / 2];
            for (int i = 1; i < array.length; i += 2) {
                    arrayOddIndices[i/2] = array[i];
            }

            return arrayOddIndices;
        }

        return new int [0];
    }
}
