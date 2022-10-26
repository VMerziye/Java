public class MinMaxAve {

    /*Part2 8.Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и
     /2 значения индексов. Алгоритм возвращает массив, который содержит минимальное значение,
     /максимальное значение,  и среднее среди всех значений между 2-мя индексами.
     /Test Data:({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
     */

    public int[] minMaxAve(int[] array, int a, int b) {
        int sum = 0;
        int numberOfElements = 0;
        int max = array[a];
        int min = array[a];
        int average = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += array[i];
                numberOfElements++;
                average = sum / numberOfElements;
                if(max < array[i] ){
                    max = array[i];
                }
                if(min > array[i]){
                    min = array[i];
                }
//                max = Math.max(max, array[i]);
//                min = Math.min(min, array[i]);
            }

            return new int[]{min, max, average};
        }

        return new int[0];

    }
}
