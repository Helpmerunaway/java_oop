package inheritance;

// extends CatFamily - наследник класса
public class Cat extends CatFamily{

//    // меняем возможность сьесть человека на false
//    public Cat() {
//        // всегда выполняется вызов конструктора суперкласса (родительского):
//        // super();
//        // canEatPerson = false;
   // }

    public Cat() {
        // выполняется вызов конструктора суперкласса (родительского) и вводятся параметры
        super(4, 2, false);
        setLegs(5);
    }

}
