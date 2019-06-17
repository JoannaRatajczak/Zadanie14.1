
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

import static java.lang.Math.E;

public class Methods {

    static TreeSet<Double> newTreeSet() {
        TreeSet<Double> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        double temp;

        System.out.println("Add some number");

        do {
            temp = scanner.nextDouble();
            if (temp > 0) {
                treeSet.add(temp);
            }
        }
        while (temp > 0);
        System.out.println("TreeSet has been made. Size: " + treeSet.size());
        return treeSet;
    }

    static String reverseTable(TreeSet<Double> treeSet) {
        return "Reverse order:" + treeSet.descendingSet().toString(); //descendingIterator() other...
    }

    static void simpleMath(TreeSet<Double> treeSet) {
        System.out.print("Simple math, adding all elemnts: ");

        Object[] table = treeSet.toArray();
        double sum = 0;
        for (int i = 0; i < table.length; i++) {
            sum += (double) table[i];
        }

        //Wyświetlanie po kolei z użyciem biblioteki iterator -> forEachRemaining() / remove()
        Iterator iterator = treeSet.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            i++; //by wyświetlić ostatni element
            if (i < treeSet.size()) {
                System.out.print(iterator.next() + "+");
            } else {
                System.out.println(iterator.next() + "=" + sum);
            }
        }

    }

    static void bigSmallElement(TreeSet<Double> treeSet) {
        treeSet.addAll(treeSet); //sort-natuall order
        System.out.println("Biggest no. : " + treeSet.last() + ", smallest one : " + treeSet.first());

    }

}
