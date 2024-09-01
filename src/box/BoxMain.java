package box;

public class BoxMain {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(20, 20, 20);
        box1.showVolume();
        box2.showVolume();
        Box box3 = new Box(30);
        box3.showVolume();
    }
}
