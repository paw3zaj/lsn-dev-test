package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class MainTaskOne {

    public static void main(String[] args) {

        var in = new Scanner(System.in);
        System.out.print("Input a list: ");
        var list = in.nextLine();

        solve(list);
    }

    private static void solve(String list) {

        list = list.trim();
        var count = 0;
        var distinct = 0;
        var min = 0;
        var max = 0;
        var length = list.length();
        var sortedTab = new StringBuilder();

        if (length != 0) {

            for (int i = 0; i < length; i++) {
                if (Character.isSpaceChar(list.charAt(i))) {
                    count++;
                }
            }

            count++;
            distinct = count;

            int[] tab = new int[count];

            String[] parts = list.split(" ");
            for (int i = 0; i < count; i++) {
                try {
                    tab[i] = Integer.parseInt(parts[i]);
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                }
            }

            Arrays.sort(tab);

            min = tab[0];
            max = tab[count - 1];

            for (int a : tab) {
                sortedTab.append(a).append(" ");
            }

            for (int i = 1; i < count; i++) {
                if (tab[i] == tab[i - 1]) {
                    distinct--;
                }
            }
        }

        System.out.println();
        System.out.println("Sorted the list: " + sortedTab.toString().trim());
        System.out.println("count: " + count);
        System.out.println("distinct: " + distinct);
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
