package inheritance;

public class Lion extends CatFamily{
    public Lion() {
        // выполняется вызов конструктора суперкласса (родительского) и вводятся параметры
        super(4, 2, true);
    }

}
