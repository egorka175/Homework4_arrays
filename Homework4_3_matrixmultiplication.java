public class Homework4_3_matrixmultiplication {
    public static void main(String[] args) {
        int[][] array = {{1, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] array2 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, };
        int rez=0;
        int indexArray2=0;
        int indexArray_2=0;
//Часть кода проходящий по каждому элементу массивов array1 , array2
        for (int i = 0; i < array.length; i++) {
            if(indexArray2>0){
                indexArray2++;
            }
            for (int f = 0; f < array[i].length; f++) {
                if(indexArray_2>0){
                    indexArray_2++;
                }
//Перемножает элементы матриц между собой.
                rez=array[i][f]*array2[indexArray2][indexArray_2];
//Выводит массив.
                System.out.println("Полученная матрица");
                System.out.print(rez + "\t");


            }
            System.out.println();
        }
    }
}
