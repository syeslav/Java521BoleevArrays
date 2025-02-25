import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        //Todo: У вас есть трехмерный массив чисел, представляющий собой набор матриц.
        // Ваша задача - вычислить среднее значение всех элементов в этом трехмерном массиве.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество слоев: ");
        int layers = scanner.nextInt();

        int[][][] threeDArray = new int[layers][][];
        int sum = 0, count = 0;

        // Заполнение массива
        for (int i = 0; i < layers; i++) {
            System.out.print("Введите количество строк для слоя " + (i + 1) + ": ");
            int rows = scanner.nextInt();
            threeDArray[i] = new int[rows][];

            for (int j = 0; j < rows; j++) {
                System.out.print("Введите элементы строки " + (j + 1) + " через пробел: ");
                scanner.nextLine(); // Очистка буфера
                String[] input = scanner.nextLine().split(" ");
                threeDArray[i][j] = new int[input.length];

                for (int k = 0; k < input.length; k++) {
                    threeDArray[i][j][k] = Integer.parseInt(input[k]);
                    sum += threeDArray[i][j][k];
                    count++;
                }
            }
        }

        // Вывод результата
        if (count == 0) {
            System.out.println("Массив пуст!");
        } else {
            System.out.println("Среднее значение: " + (double) sum / count);
        }

        scanner.close();
    }
}