import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] word = s.split("[ !,?._'@]+");

        System.out.println(word.length);

        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
        }

        scan.close();
    }
}

