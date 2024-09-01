package examples;

public class MyMath {
    // перегрузка методов

    // для двух чисел
    static int multiple(int a, int b) {
        return a * b;
    }
    // для двух числе с плавающей точкой
    static double multiple(double a, double b) {
        return a * b;
    }
    // для одного числа
    static int multiple(int a) {
        return a * a;
    }
}
