package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class MainTaskTwo {

    public static void main(String[] args) {

        var in = new Scanner(System.in);
        System.out.print("Input a list: ");
        var list = in.nextLine();

        solve(list);
    }

    private static void solve(String list) {
        list = list.trim();
        var count = 1;

        for (int i = 0; i < list.length(); i++) {
            if (Character.isSpaceChar(list.charAt(i))) {
                count++;
            }
        }

        var tab = new int[count];

        String[] parts = list.split(" ");
        for (int i = 0; i < count; i++) {
            try {
                tab[i] = Integer.parseInt(parts[i]);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        Arrays.sort(tab);

        System.out.println();
        for (int s = 0; s < count; s++) {
            for (int f = count - 1; f > 0; f--) {
                if (tab[s] + tab[f] == 13 && tab[s] < tab[f]) {
                    System.out.println(tab[s] + " " + tab[f]);
                }
            }
        }

    }
}
