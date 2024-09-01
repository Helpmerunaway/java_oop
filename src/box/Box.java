package box;

public class Box {
    private double length;
    private double width;
    private double height;

    // конструктор класса без параметров
    public Box() {
        this(10);
    }
    // конструктор класса
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    // конструктор класса с одним параметром
    public Box(double size) {
        this(size, size, size);
    }
    // конструктор с ссылочным типом
    public Box(Box another) {
        this(another.length, another.width, another.height);
    }

    public void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    // метод может принимать другой ссылочный тип и работать с ним, в данном случае это box.Box another
    public void compare(Box another){
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        if (currentVolume > anotherVolume) {
            System.out.println("Current > Another");
        }
        else if (currentVolume < anotherVolume) {
            System.out.println("Current < Another");
        }
        else if (currentVolume == anotherVolume) {
            System.out.println("Current = Another");
        }
    }

    public int compareTwo(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        int result;
        if (currentVolume > anotherVolume) {
            result = 1;
        }
        else if (currentVolume < anotherVolume) {
            result = -1;
        }
        else {
            result = 0;
        }
        return result;
    }
    // метод возвращения новой коробки box.Box
    // создаем новую коробку и добавляем поля из уже созданной коробки lenght, width, height
    public Box copy() {
        return new Box(this.length, this.width, this.height);
    }
    // метод возвращающий обьект box.Box (current), умноженный на 2
    public Box increase() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

    private double getVolume() {
        return length * width * height;
    }
    public void showVolume() {
        System.out.println(getVolume());
    }
}
