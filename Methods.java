import java.util.*;


public class Methods {

    static ArrayList<Double> newArrayList() {
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);
        double temp;

        System.out.println("Add some number");

        do {
            temp = scanner.nextDouble();
            if (temp > 0) {
                list.add(temp);
            }
        }
        while (temp > 0);
        System.out.println("ArrayList has been made. Size: " + list.size());
        return list;
    }

    static void reverseTable(ArrayList<Double> list) {
        System.out.println("Revwerse List: ");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    static void simpleMath(ArrayList<Double> list) {
        System.out.print("Simple math, adding all elemnts: ");

        Object[] table = list.toArray();
        double sum = 0;
        for (int i = 0; i < table.length; i++) {
            sum += (double) table[i];
        }

        //Wyświetlanie po kolei z użyciem biblioteki iterator -> forEachRemaining() / remove()
        Iterator iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            i++; //by wyświetlić ostatni element
            if (i < list.size()) {
                System.out.print(iterator.next() + "+");
            } else {
                System.out.println(iterator.next() + "=" + sum);
            }
        }

    }

    static void bigSmallElement(ArrayList<Double> list) {
        list.sort(Comparator.naturalOrder());
        System.out.println("Biggest no. : " + list.get(list.size() - 1) + ", smallest one : " + list.get(0));

    }

}
