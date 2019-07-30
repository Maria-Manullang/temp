package com.Pertemuan8;
import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Variabel 1= ");
        int var1=input.nextInt();
        System.out.print("Variabel 2= ");
        int var2=input.nextInt();

        int var;
        var=var1;
        var1=var2;
        var2=var;

        System.out.println(" ");
        System.out.println("Variabel 1= "+var1);
        System.out.println("Variabel 2= "+var2);


    }
}
