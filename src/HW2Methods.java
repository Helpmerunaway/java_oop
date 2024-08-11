public class HW2Methods {
    public static void main(String[] args) {
        HW2Dog dog1 = new HW2Dog();
        dog1.name = "Kenny";
        dog1.breed = "Korgi";
        dog1.weight = 20;
        String dog_info = dog1.getDog();
        System.out.println(dog_info);
        dog1.speed = 10;
        dog1.run();
    }
}
