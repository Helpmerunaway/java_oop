package test;

import java.util.HashSet;
// элементы в HashSet хранятся беспорядочно, а в ArrayList они хранятся по порядку их добавления, отсутствует метод get
public class MyHashSet {
    public static void main(String[] args) {
        HashSet<String> client = getClient();
        // обратиться по индексам через get невозможно, только через for each
        for (String name: client) {
            System.out.println(name);
        }


    }
    // Коллекция не может хранить дубликатов. HashSet не может хранить одинаковых элементов, а в ArrayList может
    public static HashSet<String> getClient() {
        HashSet<String> client = new HashSet<>();
        client.add("Gendo");
        client.add("Rei");
        client.add("Misato");
        client.add("Shinji");
        client.add("Rei");
        client.add("Asuka");
        return client;
    }
}
