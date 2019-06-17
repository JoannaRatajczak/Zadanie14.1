import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Double> newList = Methods.newTreeSet();
        System.out.println(Methods.reverseTable(newList));
        Methods.simpleMath(newList);
        Methods.bigSmallElement(newList);

    }
}
