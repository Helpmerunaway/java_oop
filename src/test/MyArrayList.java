

package test;

// меняем собственный массив на встроенный
// всегда вместо массивов используйте класс MyArrayList, он гораздо удобнее (динамический массив) - нам не нужно указывать
// размер и мы можем использовать любой тип данных
import java.util.ArrayList;

public class MyArrayList {
// вот как мы можем работать с существующей коллекцией ArrayList
    public static void main(String[] args) {
        // примитивные типы а-ля int не подходят, нужны ссылочные для int это класс Integer
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }
        // выводим в консоль значения от 0 до 999
        for (int number: numbers) {
            System.out.println(number);
        }
    }

//    public static void main(String[] args) {
//        // мы можем использовать дженерики, к примеру Box
//        ArrayList<String> employees = getEmployess();
//        employees.add("James"); // added James
//        employees.remove("Emma"); // deleted Emma
//        employees.remove(0); // deleted John
//        // заменяем на цикл for each
//        for (String employee : employees) {
//            System.out.println(employee);
//        }
//    }
    // указываем какой тип данных должен содержаться в коллекции - дженерик <String>
    private static ArrayList<String> getEmployess() {
        ArrayList<String> employess = new ArrayList<>();
        employess.add("John");
        employess.add("Olivia");
        employess.add("Emma");
        employess.add("Max");
        employess.add("Victoria");
        return employess;
    }
}