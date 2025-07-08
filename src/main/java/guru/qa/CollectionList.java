package guru.qa;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {

    private List<String> items = new ArrayList<>(15);

    public List<String> getItems() {
        items.add("chair");
        items.add("table");
        items.add("bed");
        items.add("cafe");
        items.add("chandelier");
        items.add("bath");
        items.add("carpet");

        for (String item : items) {
            System.out.println(item);
        }
        return items;
    }
}


  /*
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
     }*/