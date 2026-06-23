package collectionsRevision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        OurCustomList<Integer> list = new OurCustomList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>(list1);
        list2.add(4);
        list2.add(5);
        System.out.println(list1);
        System.out.println(list2);
//        list2.

//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        /**
         * Above lines 11-14 can be written as below.
         * Using unboxing here for converting Integer ReferenceType to int primitive type
         */
//        for (int i : list) {
//            System.out.println(i);
//        }
    }
}
