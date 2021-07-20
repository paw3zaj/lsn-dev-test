package Task3;

import java.util.HashSet;
import java.util.Scanner;

public class MainTaskThree {

    public static void main(String[] args) {

        var in = new Scanner(System.in);
        var graphs = 0;
        var set = new HashSet<Integer>();

        if(in.hasNextInt()) {
            set.add(in.nextInt());

            while (in.hasNextInt()) {
                int x = in.nextInt();
                if (!in.hasNextInt()) {
                    break;
                }
                int y = in.nextInt();
                if ((x + 1) == y) {
                    if (!set.contains(x) && !set.contains(y)) {
                        set.add(x);
                        set.add(y);
                        graphs++;
                    }
                }
            }
        }
        System.out.println("Number of graphs: " + graphs);
    }
}
