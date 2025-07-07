package guru.qa;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CollectionList collectionList = new CollectionList();
        List<String> itemsList = collectionList.getItems();
        System.out.println("Список вещей в квартире:\n" + itemsList);
        itemsList.add("TV");
        System.out.println("Список вещей в квартире:\n" + itemsList);
    }
}


