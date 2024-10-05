

package test;

import collections.Collections;
import examples.Person;

    public class MainMyArray {

        public static void main(String[] args) {
            String[] employess = getEmployess();
            // создание нового массива на 6 элементов
            String[] newArray = new String[employess.length + 1];
            for (int i = 0; i < employess.length; i++){
                // присваиваем значение от i, изначально индекс 0, мы положем значение John
                newArray[i] = employess[i];
            }
            // создаем нового сотрудника
            newArray[newArray.length - 1] = "James";
            // кладем в переменную employess значение нового массива (6 сотрудников)
            employess = newArray;
            // вводим значение null(не ссылается ни на один обьект) переменной ссылочного типа
            employess[0] = null;
            // чтобы удалить старого сотрудника (5 сотрудников)
            String[] newestArray = new String[employess.length - 1];
            for (int i = 0, j = 0; i < employess.length; i++) {
                String employee = employess[i];
                if (employee != null) {
                    newestArray[j] = employee;
                    j++;
                }
            }
            employess = newestArray;
            for (String employee: employess) {
                System.out.println(employee);
            }
        }
        // исходный массив не меняем
        private static String[] getEmployess(){
            String[] employess = new String[5];
            employess[0] = "John";
            employess[1] = "Olivia";
            employess[2] = "Emma";
            employess[3] = "Max";
            employess[4] = "Nick";
            return employess;
        }

    }

