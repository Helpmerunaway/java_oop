// homework
public class HW2Dog {
    String name;
    String breed;
    double weight;
    int speed;

    String getDog() {
        return ("Name: " + name + "\n" + "Breed: " + breed + "\n" + "Weight: " + weight);
    }
    void run() {
        for(int i = 0; i < speed; ++i) {
            System.out.println("Бегу");
        }

    }
}
