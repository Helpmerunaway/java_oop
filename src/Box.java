public class Box {
    double length;
    double width;
    double height;

    double getVolume() {
        return length * width * height;
    }
    void showVolume() {
        System.out.println(getVolume());
    }
}
