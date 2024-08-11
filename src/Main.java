public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box();
//        box1.height = 10;
//        box1.length = 10;
//        box1.width = 10;
//        Box box2 = new Box();
//        // Box box3 = box2;
//        box2.height = 20;
//        box2.length = 20;
//        box2.width = 20;
//        // box3.width = 0;
//        box1.showVolume();
//        box2.showVolume();
//        double volume2 = box2.getVolume();
//        System.out.println(volume2);

        Dog dog1 = new Dog();
        dog1.name = "Kenny";
        dog1.breed = "Korgi";
        dog1.weight = 20;
        String dog_info = dog1.getDog();
        System.out.println(dog_info);
        dog1.speed = 10;
        dog1.run();

//        Human eric = new Human();
//        eric.name = "Eric";
//        eric.age = 17;
//        eric.weight = 100;
//
//        Human liloo = new Human();
//        liloo.name = "Liloo";
//        liloo.age = 27;
//        liloo.weight = 60;
//
//        Human victor = new Human();
//        victor.name = "Victor";
//        victor.age = 35;
//        victor.weight = 55;
//        double average = eric.age + liloo.age + victor.age;
//        double sum = average / 3;
//        System.out.println(sum);
    }
}
