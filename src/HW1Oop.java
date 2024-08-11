public class HW1Oop {
    public static void main(String[] args) {
        HW1Human eric = new HW1Human();
        eric.name = "Eric";
        eric.age = 17;
        eric.weight = 100;

        HW1Human liloo = new HW1Human();
        liloo.name = "Liloo";
        liloo.age = 27;
        liloo.weight = 60;

        HW1Human victor = new HW1Human();
        victor.name = "Victor";
        victor.age = 35;
        victor.weight = 55;
        double average = eric.age + liloo.age + victor.age;
        double sum = average / 3;
        System.out.println(sum);
    }
}
