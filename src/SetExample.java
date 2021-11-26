
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    static Set<Integer> set = new HashSet<>();
    static Set<String> strSet = new HashSet<>();

    public static void main(String[] args) {
        set.add(4);
        set.add(5);
        set.add(3);
        set.add(4);
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        strSet.add("Pragra");
        strSet.add("Interfaces");
        strSet.add("Collections");
        strSet.add("Pragra");

        Iterator itr2 = strSet.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}