import java.util.Scanner;
public class Homework4_1_increasingthearray {


    public static void main(String[] args) {
        int[][][] array = {{{1, 2, 3}}, {{6, 5, 4}}, {{1, 3, 5}}};
        int rez = 0;
        Scanner s = new Scanner(System.in);
        System.out.printf("Введите числo: ");
        int number = s.nextInt();
        for (int i = 0; i < array.length; i++) {
//Часть кода проходящий по каэждому элементу массива и увеличивает его на значение number

            for (int j = 0; j < array[i].length; j++) {
                for (int f = 0; f < array[i][j].length; f++) {

                    rez = array[i][j][f] + number;
//Выводит массив на экран
                    System.out.print(rez + "\t");
                }
                System.out.println();
            }

        }

    }
}











