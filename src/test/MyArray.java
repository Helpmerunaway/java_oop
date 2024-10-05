package test;
// оболочка вокруг массива
public class MyArray {
    // массив из 10 элементов, строго фиксированная величина
    private String[] array = new String[10];
    // изначально размер 0
    private int size = 0;
    // метод получения элемента из коллекции по индексу
    public String get(int index) {
        return array[index];
    }
    // метод добавления в коллекцию, в качестве параметра принимает значение size которое мы ходим добавить в коллекцию
    public void add(String element){
        array[size] = element;
        //
        size++;
        //
        if (size == array.length) {
            // создаем новый массив больше предыдущего в два раза
            String[] newArray = new String[array.length * 2];
            // и кладем в него элементы из предыдущего массива
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            // перезаписываем в новый массив



            }
            array = newArray;
        }
    }
    // в качестве параметра принимает позицию элемента, удаляет элемент по его индексу index
    public void remove(int index) {
        // size хранит реальное количество элементов в этом массиве, если мы добавили один элемент то длина массива 10
        // а переменная size = 1, и цикл нужно будет пройти один раз
        for (int i = index; i < size - 1; i++) {
            // пример - присваиваем значение 4 в индекс 5, 5 в 6, 6 в 7, 7 в 8 и так далее
            array[i] = array[i+1];
        }
        // последнему элементу присваиваем значение null
        array[size] = null;
        // уменьшаем размер коллекции на единицу
        size--;

    }
    // в качестве параметра принимает строку (название), удаляет элемент по его имени
    public void remove(String element) {
        // проходим по всем элементам, если элемент из массива равен элементу который мы ходим удалить
        for (int i = 0; i < size; i++){
            if (element.equals(array[i])){
                // вызываем метод remove и передаем ему индекс(i)
                remove(i);
                // выходим из метода, даже если ничего не возвращаем
                return;
            }
        }
    }
    // узнаем значение size при помощи getter, тк переменная private
    public int getSize() {
        return size;
    }
}
