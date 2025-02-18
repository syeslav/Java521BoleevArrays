import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        //:Todo: Вам предоставляется массив элементов, и ваша задача - определить, есть ли
        //  дубликаты (повторяющиеся элементы) в массиве.
        //  Если есть, выведите информацию о том, какие элементы являются дубликатами и их индексы.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();

        }

        System.out.println("Массив: " + Arrays.toString(array));

    }
}

