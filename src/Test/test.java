package Test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X1","jeep");
        car.setMark("Mersedes");
        car.getMark();
        String Mark1=car.getMark();
        System.out.println(car.getMark());

        //System.out.println("Hello world");
        //int x = 0;
        //MaxTOMin();
        //typesofdata();
        //divide();
        //OperationPiroshki();
        //long a = 100;
        //long b =(int)a;
        //String a=" " ;
        //Scanner scanner = new Scanner(System.in);
        //int f, b;
        //f = scanner.nextInt();
        //b = scanner.nextInt();
        //int c = f + b;
        //System.out.println(c);

        //while(!a.equals("exit")){
        //   a = scanner.nextLine();
        //  System.out.println(a);
    }

    public static void typesofdata() {
        int x = 0;
        Scanner scr = new Scanner(System.in);
        x = scr.nextInt();
        if (x >= 3 && x <= 8) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void divide() {
        int x;
        Scanner scr = new Scanner(System.in);
        x = scr.nextInt();
        int c = 0, d = 0;
        while (x > 0) {
            d = d + x % 10;
            x /= 10;
        }

        System.out.println(d + c + x);
    }

    public static void OperationPiroshki() {
        int a = 0, b = 0, c = 0, d = 0, s = 0;

        Scanner scr = new Scanner(System.in);
        a = scr.nextInt();
        b = scr.nextInt();
        c = scr.nextInt();
        d = a * c;
        s = (b * c) % 100;
        System.out.println(d);
        System.out.println(s);


    }

    public static void MaxTOMin() {
        int a = 0, b = 0, c = 0;
        Scanner scr = new Scanner(System.in);
        a = scr.nextInt();
        b = scr.nextInt();
        c = scr.nextInt();
        if ((a > b) & (a > c)) {
            System.out.println(a);
            if (b > c) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        }
        if ((b > a) & (b > c)) {
            System.out.println(b);
            if (a > c) {
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        }
        if ((c > a) & (c > b)) {
            System.out.println(c);
            if (a > b) {
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(b);
                System.out.println(a);
            }


        }
    }
}














