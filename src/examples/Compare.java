package examples;

import box.Box;

public class Compare {
    public static void main(String[] args) {
        Box current = new Box(10);
        Box another = current.increase();
        current.compare(another);
        // метод умножающий коробку на 2
        Box increased = current.increase();
        current.showVolume();
        another.showVolume();
        increased.showVolume();
        int result = current.compareTwo(another);
        System.out.println(result);
    }
}
