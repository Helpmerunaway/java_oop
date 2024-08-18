public class Box {
    double length;
    double width;
    double height;

    // конструктор класса без параметров
    Box() {
        this(10);
    }
    // конструктор класса
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    // конструктор класса с одним параметром
    Box(double size) {
        this(size, size, size);
    }

    void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getVolume() {
        return length * width * height;
    }
    void showVolume() {
        System.out.println(getVolume());
    }
}
