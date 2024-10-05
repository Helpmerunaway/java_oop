

package test;


public class Main {

    public static void main(String[] args) {
        MyArray employees = getEmployess();
        // добавляем James в существующий массив
        employees.add("James");
        // удаляем Emma из массива
        employees.remove("Emma");
        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }

    private static MyArray getEmployess() {
        MyArray employess = new MyArray();
        employess.add("John");
        employess.add("Olivia");
        employess.add("Emma");
        employess.add("Max");
        employess.add("Nick");
        return employess;
    }
}