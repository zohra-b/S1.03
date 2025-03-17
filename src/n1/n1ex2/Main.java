package n1.n1ex2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(11);
        myList.add(111);
        myList.add(1111);
        myList.add(11111);
        myList.add(111111);

        List<Integer> reversedList1 = new ArrayList<>();
        for (int i = myList.size() - 1; i >= 0; i--) {
            reversedList1.add(myList.get(i));
        }
        System.out.println(reversedList1);

        List<Integer> reversedList2 = new ArrayList<>();
        for (ListIterator<Integer> iter = myList.listIterator(); iter.hasNext(); ) {
            int element = iter.next();
            reversedList2.add(element);
        }
        System.out.println(reversedList2);

        List<Integer> reversedList3 = new ArrayList<>();
        ListIterator<Integer> iterator = myList.listIterator(myList.size());
        while (iterator.hasPrevious()){

            reversedList3.add(iterator.previous());
        }
        System.out.println(reversedList3);

    }
}
