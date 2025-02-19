import java.util.*;

public class TaskFour {
    public static void main(String[] args) {
        //Todo: У вас есть одномерный массив целых чисел.
        // Ваша задача - найти наименьший элемент в этом массиве с использованием цикла foreach.
        Scanner scanner = new Scanner(System.in);

        // Ввод массива чисел
        System.out.print("Введите элементы массива через пробел: ");
        int[] numbers = Arrays.stream(scanner.nextLine().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();


        for (int num : numbers) {

            }
        }

    }


