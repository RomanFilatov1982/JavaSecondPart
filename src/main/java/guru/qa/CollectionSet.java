package guru.qa;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    Set<String> subjects = new HashSet<String>();

    public Set<String> schoolSubjects() {
        subjects.add("Physics");
        subjects.add("Maths");
        subjects.add("Chemistry");
        subjects.add("Biology");
        subjects.add("History");
        subjects.add("Computer Science");
        subjects.add("Economics");
        subjects.add("Arts");
        subjects.add("Hindi");
        subjects.add("Social Studies");
        if (subjects.contains("English")) {
            System.out.println("Вы изучаете Английский");
        } else {
            System.out.println("Вы изучаете Русский");
        }
        return subjects;
    }
}
