package hw;

import examples.Person;

public class HW6Types {
    public static void main(String[] args) {
        // нужно обрезать слово John в строке
        String st = "This is John. He is 27 years old.";
        // обрезаем строку с начала и с конца - находим имя и возраст
        String name = st.substring(8, 12);
        String age_str = st.substring(20, 22);
        // преобразовываем строку в число (возраст)
        int age = Integer.parseInt(age_str);
        // создаем экземпляр класса Person и передаем полученные переменные из строки (name, age)
        Person person = new Person(name, age);
        // вызываем геттеры
        System.out.println(person.getName() + " " + person.getAge()); //=John 27

    }
}
