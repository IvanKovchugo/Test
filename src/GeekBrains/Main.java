package GeekBrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] strOne = new String[5];
        String[] strTwo = new String[strOne.length];
        System.out.println("Input your strings in the amount of five");
        for (int i = 0; i < strOne.length; i++) {
            strOne[i] = sc.next();
        }


        int count = 0;
        for (int i = 0; i < strOne.length; i++) {
            if (strOne[i].length() <= 3) {
                strTwo[count] = strOne[i];
                System.out.println("Founded numbers = " + strTwo[count] + "!");
                count++;

            }
        }
    }

}
