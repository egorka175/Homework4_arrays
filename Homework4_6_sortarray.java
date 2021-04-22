import java.util.Arrays;

public class Homework4_6_sortarray {
    public static void main(String[] args) {
        int[][] array = {{1, 0, 2}, {34, 1, 0}, {0, 300, 10}};

//Часть кода проходящий по каждому элементу массивов array1
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Arrays.sort(array[i]);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

