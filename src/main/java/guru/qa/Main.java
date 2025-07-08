package guru.qa;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*CollectionList collectionList = new CollectionList();
        List<String> itemsList = collectionList.getItems();
        System.out.println("Список вещей:\n" + itemsList);
        itemsList.add("TV");
        System.out.println("Список вещей:\n" + itemsList);
        itemsList.remove("cafe");
        System.out.println("Список вещей:\n" + itemsList);
        itemsList.set(1, "orange");
        System.out.println("Список вещей:\n" + itemsList);*/

       /* CollectionSet collectionSet = new CollectionSet();
        Set itemsSubjects = collectionSet.schoolSubjects();
        System.out.println("Вы не изучаете" + itemsSubjects);
        itemsSubjects.add("English");
        System.out.println("Вы изучаете" + itemsSubjects);*/

        CollectionMap collectionMap = new CollectionMap();
        Map<String, Integer> itemsPeoples = collectionMap.itemsPeoples();
        System.out.println(itemsPeoples);
        itemsPeoples.put("Roman", 35);
        System.out.println(itemsPeoples);

    }
}


