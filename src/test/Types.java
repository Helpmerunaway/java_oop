package test;

public class Types {
    public static void main(String[] args) {
        // создание переменной примитивного типа
        int a = 5;
        // если нужно работать как с обьектом (ссылочным) то создаем оболочку
        // здесь сначала создается переменная примитивного типа, а затем ссылочный
        Integer a1 = 5;

        byte b;
        Byte b1;

        short c;
        Short c1;

        long d;
        Long d1;

        char e;
        Character e1;

        float g;
        Float g1;

        double h;
        Double h1;

        boolean i;
        Boolean i1;

        String s = "1000";
        String s1 = "2000";
        System.out.println(s + s1);         //=10002000
        // преобразовываем строку в число при помощи статического метода parseInt
        // этот метод есть у всех примитивных типов
        int aaa = Integer.parseInt(s);
        int bbb = Integer.parseInt(s1);
        System.out.println(aaa + bbb);     //=3000

        // нужно обрезать слово John в строке
        String st = "This is John. He is 27 years old.";
        // обрезаем строку с начала и с конца
        String name = st.substring(8, 12);
        System.out.println(name); //=John
    }
}
