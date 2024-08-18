public class Monster {
    public static void main(String[] args) {
        HW5Monster monster = new HW5Monster(10, 20, 30);
        HW5Monster monster1 = new HW5Monster(5);
        HW5Monster monster2 = new HW5Monster();
        monster.showInfo();
        monster1.showInfo();
        monster2.showInfo();
        monster.voice(2, "Aaaaaaaaa...");
    }
}
