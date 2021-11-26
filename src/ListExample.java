import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
    static List<Integer> myList = new ArrayList<Integer>();

    public static void main(String[] args) {
        myList.add(4);
        myList.add(5);
        myList.add(4);
        myList.add(2);
        ListIterator itr = myList.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}