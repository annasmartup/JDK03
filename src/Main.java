public class Main {
    public static void main(String[] args) {

        // Задание 1
        double res_sum = Calculator.sum(3, 5.4);
        double res_mult = Calculator.multiply(3, 5.4);
        double res_div = Calculator.divide(3, 5.4);
        double res_substr = Calculator.subtract(3, 5.4);
        System.out.println("Сложение: " + res_sum);
        System.out.println("Умножение: " + res_mult);
        System.out.println("Деление: " + res_div);
        System.out.println("Вычитание: " + res_substr);

        // Задание 2
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};

        System.out.println("Сравнение массивов int: " + Compare.compareArrays(array1, array2));

        String[] strArray1 = {"a", "b", "c"};
        String[] strArray2 = {"a", "b", "d"};

        System.out.println("Сравнение массивов str: " + Compare.compareArrays(strArray1, strArray2));

        // Задание 3
        Pair<Integer, String> pair1 = new Pair<>(42, "Anna");
        System.out.println("Пара 1: " + pair1);
    }
}
