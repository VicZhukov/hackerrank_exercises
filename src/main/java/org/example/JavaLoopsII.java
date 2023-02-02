package main.java.org.example;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int buff = 1;
            int x = 0;

            for (int j = 1; j <= n; j++) {
                x = x + (buff * b);
                buff *= 2;
                System.out.print((a + x) + " ");
            }
        }
        in.close();
    }
}
