package Test;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class FirstTask {

    public static void main(String[] args) {
        //Cakes();
        Divide();






    }
    private static void Divide(){
        int i,b=0;
        String c=" ";

        Scanner scr = new Scanner(System.in);
        i = scr.nextInt();
        int [] x = new int [i];

        for(int a=0;a<x.length;a++){
             x[a] = scr.nextInt();
             c=c+x[a]+" ";


        }
        StringBuffer sbf = new StringBuffer(c);

        System.out.println(sbf.reverse()) ;


        //for(int t:x){
        //    System.out.print(t+" ");
        //}

        }

    }
























