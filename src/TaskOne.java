import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        //Todo:Напишите программу, которая переворачивает массив, так чтобы последний элемент стал первым, предпоследний - вторым и так далее.
        // Используйте Random для заполнения массива. Вывести свои было и стало.
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // 1. Запрос размера массива у пользователя
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        // 2. Создание массива
        int[] array = new int[size];

        // 3. Заполнение массива случайными числами
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Было: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Стало: " + Arrays.toString(array));

        scanner.close();

    }

    //Разворот массива
    public static void reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
