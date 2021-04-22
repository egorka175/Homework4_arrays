public class Homework4_4_sumarray {

        public static void main(String[] args) {
            int[][] array = {{1, 0, 2}, {34, 1, 0}, {0, 0, 0}};
            int rezSum = 0;
//Часть кода проходящий по каждому элементу массивов array
            for (int i = 0; i < array.length; i++) {

                for (int f = 0; f < array[i].length; f++) {
//Суммирует элементы массива.
                    rezSum=rezSum+array[i][f];

                }

            }
            System.out.println("Полученная сумма чисел массива: "+rezSum);
        }
    }

