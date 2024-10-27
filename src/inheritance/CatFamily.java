package inheritance;

public class CatFamily {
    // модификатор доступа protected дает доступ всем элементам внутри одного пакета + доступ у классов наследников (subclass)
    protected int legs;
    protected int eyes;
    protected boolean canEatPerson;


    // создаем конструктор класса
//    public CatFamily() {
//        legs = 4;
//        eyes = 2;
//        canEatPerson = true;
//    }

    // создаем конструктор без параметров
    public CatFamily(int legs, int eyes, boolean canEatPerson) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPerson = canEatPerson;
    }
    // без сеттеров мы не можем менять значения private (приватных) переменных в дочерних классах (subclass)
    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setCanEatPerson(boolean canEatPerson) {
        this.canEatPerson = canEatPerson;
    }
    // для доступа к полям вне одного пакета добавим getter

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }
    // у геттера с булевым типом название начинается с Is
    public boolean isCanEatPerson() {
        return canEatPerson;
    }
}
