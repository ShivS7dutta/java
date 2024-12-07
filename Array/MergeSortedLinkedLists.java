package Array;

import java.util.LinkedList;

public class MergeSortedLinkedLists {

	 public static LinkedList<Integer> mergeSortedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> mergedList = new LinkedList<>();

        // Pointers to traverse both lists
        int i = 0, j = 0;
        
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        // Add remaining elements from list1 if any
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        // Add remaining elements from list2 if any
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        LinkedList<Integer> mergedList = mergeSortedLists(list1, list2);
        System.out.println("Merged LinkedList: " + mergedList);



	}

}
