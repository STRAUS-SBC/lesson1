package lesson2;

import java.util.Scanner;

public class StaticProbs {
    public static int probs;

    static {
        probs = am();
    }

    public static int am(){
        Scanner boom = new Scanner(System.in);
        int a = boom.nextInt();
        int b = 5;
        int v = a + b;
        return v;
    }
}
