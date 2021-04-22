public class Homework4_5_diagonalarray {

        public static void main(String[] args) {
            int[][] array = {{1, 0, 2}, {34, 10, 0}, {0, 0, 0}};
            System.out.println("Диагональ массива Array");
//Часть кода проходящий по каждому элементу массивов array
            for (int i = 0; i < array.length; i++) {

                for (int f = 0; f < array[i].length; f++) {
//Проверяет равны ли индексы массива так как в диагональных элементах они равны.
                    if (i == f) {

                        System.out.println(array[i][f]);
                    }

                }

            }
        }

}
