import java.util.*;


public class TaskThree {
    public static void main(String[] args) {
        //Todo:Предоставлен массив чисел и значение, которое нужно найти.
        // Ваша задача - определить, содержит ли массив заданное значение, и если да, то найти индекс этого значения в массиве.
        Scanner scanner = new Scanner(System.in);

        // Ввод массива чисел
        System.out.print("Введите элементы массива через пробел: ");
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        // Ввод искомого значения
        System.out.print("Введите значение которое нужно найти: ");
        int target = scanner.nextInt();

        // Поиск индекса элемента
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        // Вывод результата
        if (index != -1) {
            System.out.println("Значение " + target + " найдено на позиции: " + index);
        } else {
            System.out.println("Значение " + target + " отсутствует в массиве");
        }

        scanner.close();
    }
}