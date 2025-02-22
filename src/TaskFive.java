import java.util.*;

public class TaskFive {
    public static void main(String[] args) {
        //Todo: У вас есть двумерный массив чисел, например, матрица.
        // Ваша задача - написать программу, которая находит сумму всех элементов в этом массиве.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int sum = 0;

        // Заполнение матрицы
        for (int i = 0; i < rows; i++) {
            System.out.print("Введите " + cols + " чисел для строки " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
                sum += matrix[i][j]; // Сразу считаем сумму
            }
        }

        System.out.println("Сумма всех элементов: " + sum);
        scanner.close();
    }
}