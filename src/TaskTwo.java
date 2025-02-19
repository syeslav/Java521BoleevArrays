import java.util.*;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ввод массива
        System.out.print("Введите элементы массива через пробел: ");
        // Читаем всю строку и разбиваем ее на массив строк по пробелам
        String[] input = scanner.nextLine().split(" ");
        String[] array = new String[input.length];
        // Копируем элементы из input в array
        System.arraycopy(input, 0, array, 0, input.length);

        // 2. Поиск дубликатов
        // - Значение (List<Integer>): список индексов, где встречается элемент
        Map<String, List<Integer>> duplicates = new HashMap<>();

        // Проходим по всем элементам массива
        for (int i = 0; i < array.length; i++) {
            String element = array[i];
            // Если элемента еще нет в HashMap, добавляем его с пустым списком индексов
            if (!duplicates.containsKey(element)) {
                duplicates.put(element, new ArrayList<>());
            }
            // Добавляем текущий индекс (i) в список индексов для этого элемента
            duplicates.get(element).add(i);
        }

        // 3. Вывод результатов
        boolean hasDuplicates = false; // Флаг, есть ли дубликаты
        // Проходим по всем записям в HashMap
        for (Map.Entry<String, List<Integer>> entry : duplicates.entrySet()) {
            // Если у элемента больше одного индекса, это дубликат
            if (entry.getValue().size() > 1) {
                hasDuplicates = true;
                System.out.println("Элемент '" + entry.getKey() + "' повторяется на индексах: " + entry.getValue());
            }
        }

        if (!hasDuplicates) {
            System.out.println("Дубликатов не найдено.");
        }

        scanner.close();
    }
}