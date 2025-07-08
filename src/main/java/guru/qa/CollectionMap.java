package guru.qa;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
    Map<String, Integer> peoples = new HashMap<>();

    public Map<String, Integer> itemsPeoples() {
        peoples.put("Roman", 43);
        peoples.put("Alex", 30);
        peoples.put("Svetlana", 21);
        peoples.put("Nastya", 18);
        peoples.put("Artyom", 28);
        if (peoples.containsValue(43)) {
            System.out.println("В HashMap есть значение 43");
        return peoples;
    } else {
        System.out.println("Значение 'Roman' не найдено");
    }
        return peoples;
    }
}

