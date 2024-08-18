public class HW5Monster {
    int eyes;
    int hands;
    int legs;
    // конструктор без параметров (2)
    HW5Monster() {
        this(2);
    }
    // конструктор с 3 параметрами
    HW5Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }
    // конструктор с 1 параметром
    HW5Monster(int count) {
        this(count, count, count);
    }

    void showInfo() {
        System.out.println("Eye: " + eyes + "\n" + "Hands: " + hands + "\n" + "Legs: " + legs);
    }
    // перегруженный метод 1
    void voice() {
        System.out.println("Grrrrrrrrrrrrr...");
    }
    // перегруженный метод 2
    void voice(int count) {
        // Example: voice(3);

        // Output:
        // Grrrrrrrrr
        // Grrrrrrrrr
        // Grrrrrrrrr
        for (int i = 0; i < count; i++)
        System.out.println("Grrrrrrrrrrrrr...");
    }
    // перегруженный метод 3
    void voice(int count, String word) {
        // Example: voice(2, "Aaaaaaaaa...");

        // Output:
        // "Aaaaaaaaa...";
        // "Aaaaaaaaa...";
        for (int i = 0; i < count; i++)
            System.out.println(word);

    }


}
