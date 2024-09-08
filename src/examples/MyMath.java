package examples;

public class MyMath {

    public static final double PI = 3.14;

    public static int sum(int... numbers) {
        // создаем переменную и присваиваем 0
        int sum = 0;
        // по очереди достаем переменные из массива и кладем в number + увепичиваем переменную sum на число number
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double lenght(double raduis) {
        return 2 * PI * raduis;
    }

    public static double area(double radius) {
        // pi = 10;
        return PI * radius * radius;
    }
    // перегрузка методов

    // для двух чисел
    public static int multiple(int a, int b) {
        return a * b;
    }
    // для двух числе с плавающей точкой
    public static double multiple(double a, double b) {
        return a * b;
    }
    // для одного числа
    public static int multiple(int a) {
        return a * a;
    }
}

