package hw;

import java.util.ArrayList;

public class HW7CollectionResult {
    //5 - от 0 до 4
    public static void main(String[] args) {
        // создаем коллекцию от 0 до 4
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        // создаем коллекцию для имен
        ArrayList<String> names = getNames();
        // коллекция результата numbers + name
        ArrayList<String> result = new ArrayList<>();
        // создаем цикл for с ограничением по количеству numbers
        for (int i = 0; i < numbers.size(); i++){
            // создаем новую строку и передаем в нее номер + тире + имя
            String s = numbers.get(i) + " - " + names.get(i);
            // складываем в коллецию result
            result.add(s);
//            System.out.println(s);
        }
        // проверяем что все ок через for each
        for (String s: result) {
            System.out.println(s);
        }


    }
    public static ArrayList<String> getNames() {
        ArrayList<String> name = new ArrayList<>();
        name.add("John");
        name.add("Vasya");
        name.add("Eva");
        name.add("Max");
        name.add("Aska");
        return name;
    }
}
