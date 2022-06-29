import java.util.Scanner;

public class Asalsayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 100;

        for (int b=0;b<=a;b++){

        if (b%2!=0&& b%3!=0 && b%5!=0&&b!=49 ){
            System.out.println(b);
        }
    }
}
}
