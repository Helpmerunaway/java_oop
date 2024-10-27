package test;

import inheritance.Cat;
import inheritance.Lion;

public class MainCats {
    public static void main(String[] args) {
        // создаем экземпляр класса кошка и лев
        Cat cat = new Cat();
        Lion lion = new Lion();
        // выводим в консоль способность есть людей у кошки и льва
        // при использовании модификатора доступа protected мы не можем обращаться к полям
//        System.out.println(cat.canEatPerson);
//        System.out.println(lion.canEatPerson);
        // обращаемся к геттерам для получения значения protected
        System.out.println(cat.isCanEatPerson());
        System.out.println(lion.isCanEatPerson());
    }
}
